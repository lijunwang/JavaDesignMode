package com.design.mode.single;

public class Main {
	public static void main(String[] args) {
		final int count = 1000;
		for (int i = 0; i < count; i++) {
			Runtime.getRuntime().freeMemory();
			new Thread("Thread-" + i) {
				public void run() {
					EagerInstance.getInstance();
//					LazyInstance.getInstanceError1();
//					LazyInstance.getInstanceError2();
//					LazyInstance.getInstanceError3();
//					LazyInstance.getInstanceRight1();
//					LazyInstance.getInstanceRight2();
					LazyInstance.getInstanceRight3();
				};
			}.start();
		}
	}
}
