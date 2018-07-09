package com.design.mode.factory.test;

public class Main {
	public static void main(String[] args) {
		PictureReaderFactory factory = new GifFactory();
		factory.getReader().read();

		factory = new JpgFactory();
		factory.getReader().read();
	}
}
