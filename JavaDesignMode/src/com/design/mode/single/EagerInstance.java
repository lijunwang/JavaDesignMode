package com.design.mode.single;

public class EagerInstance {

	public static EagerInstance mInstance = new EagerInstance();

	private EagerInstance() {
		try {
			Thread.currentThread().sleep(3000);
			System.out.println("EagerInstance ´´½¨ÖÐ ...");
		} catch (InterruptedException e) {
			e.printStackTrace();
			System.out.println("EagerInstance InterruptedException ... " + e.getMessage());
		}
	}

	public static EagerInstance getInstance() {
		return mInstance;
	}
	
	public static void test() {
		System.out.println("EagerInstance test() ...");
	}
}
