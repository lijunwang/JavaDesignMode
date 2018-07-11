package com.design.mode.single;

public class Main {
	public static void main(String[] args) {
		//从这2行代码可以看到饿汉模式实例化是在类加载的时候就完成的，由虚拟机构造加载完成
		EagerInstance.test();
		LazyInstance.test();
		final int count = 1000;
		for (int i = 0; i < count; i++) {
			new Thread("Thread-" + i) {
				public void run() {
//					EagerInstance.getInstance();
//					LazyInstance.getInstanceError1();
//					LazyInstance.getInstanceError2();
//					LazyInstance.getInstanceError3();
//					LazyInstance.getInstanceRight1();
//					LazyInstance.getInstanceRight2();
//					LazyInstance.getInstanceRight3();
				};
			}.start();
		}
	}
}
