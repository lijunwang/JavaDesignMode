package com.design.mode.factory.test;

public class JpgReader implements PictureReader {

	public JpgReader() {
		System.out.println("JpgReader ������ ...");
	}

	@Override
	public void read() {
		System.out.println("JpgReader read() ...");
	}

}
