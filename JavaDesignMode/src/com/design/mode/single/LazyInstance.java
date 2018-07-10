package com.design.mode.single;

public class LazyInstance {
	private static LazyInstance mInstance = null;

	private LazyInstance() {
		try {
			Thread.currentThread().sleep(3000);
			System.out.println("LazyInstance������ ... " + this + ","
					+ Thread.currentThread().getName());
		} catch (InterruptedException e) {
			e.printStackTrace();
			System.out.println("LazyInstance InterruptedException ... "
					+ e.getMessage());
		}
	}

	// ����ĵ���ģʽ1;
	private static LazyInstance mInstanceError1 = null;

	public static LazyInstance getInstanceError1() {
		if (mInstanceError1 == null) {
			mInstanceError1 = new LazyInstance();
		}
		return mInstanceError1;
	}

	// ����ĵ���ģʽ2;
	volatile static LazyInstance mInstanceError2;

	public static LazyInstance getInstanceError2() {
		if (mInstanceError2 == null) {
			mInstanceError2 = new LazyInstance();
		}
		return mInstanceError2;
	}

	// ����ĵ���ģʽ��
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

	// ��ȷ�ĵ���ģʽһ����������ȫ������ȱ��������Χ̫��ϵͳ��Դ���Ĺ���
	public static synchronized LazyInstance getInstanceRight1() {
		if (mInstance == null) {
			mInstance = new LazyInstance();
		}
		return mInstance;
	}

	// ��ȷ�ĵ���ģʽ����˫���ж�
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

	// ��ȷ�ĵ���ģʽ������̬(static)�ڲ���;Initialization Demand Holder (IoDH)
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
