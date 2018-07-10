package com.design.mode.single;

public class LazyInstance {
	private static LazyInstance mInstance = null;

	private LazyInstance() {
		try {
			Thread.currentThread().sleep(3000);
			System.out.println("LazyInstance创建中 ... " + this + ","
					+ Thread.currentThread().getName());
		} catch (InterruptedException e) {
			e.printStackTrace();
			System.out.println("LazyInstance InterruptedException ... "
					+ e.getMessage());
		}
	}

	// 错误的单例模式1;
	private static LazyInstance mInstanceError1 = null;

	public static LazyInstance getInstanceError1() {
		if (mInstanceError1 == null) {
			mInstanceError1 = new LazyInstance();
		}
		return mInstanceError1;
	}

	// 错误的单例模式2;
	volatile static LazyInstance mInstanceError2;

	public static LazyInstance getInstanceError2() {
		if (mInstanceError2 == null) {
			mInstanceError2 = new LazyInstance();
		}
		return mInstanceError2;
	}

	// 错误的单例模式三
	private static LazyInstance mInstanceError3 = null;

	public static LazyInstance getInstanceError3() {
		System.out.println("getInstanceError3 aa..."
				+ Thread.currentThread().getName());
		if (mInstanceError3 == null) {
			System.out.println("getInstanceError3 bb..."
					+ Thread.currentThread().getName());
			synchronized (LazyInstance.class) {
				System.out.println("getInstanceError3 cc..."
						+ Thread.currentThread().getName());
				mInstanceError3 = new LazyInstance();
			}
		}
		return mInstanceError3;
	}

	// 正确的单例模式一、重量级的全局锁；缺点锁定范围太大，系统资源消耗过大
	public static synchronized LazyInstance getInstanceRight1() {
		if (mInstance == null) {
			mInstance = new LazyInstance();
		}
		return mInstance;
	}

	// 正确的单例模式二、双重判断
	private volatile static LazyInstance mInstance2 = null;

	public static synchronized LazyInstance getInstanceRight2() {
		if (mInstance2 == null) {
			synchronized (LazyInstance.class) {
				if (mInstance2 == null) {
					mInstance2 = new LazyInstance();
				}
			}
		}
		return mInstance2;
	}

	// 正确的单例模式三、静态(static)内部类;Initialization Demand Holder (IoDH)
	private static class HolderClass {
		private static LazyInstance mLazyInstance = new LazyInstance();

		public static LazyInstance getInstance() {
			return mLazyInstance;
		}
	}
	
	public static LazyInstance getInstanceRight3(){
		return HolderClass.getInstance();
	}
}
