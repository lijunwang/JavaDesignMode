package com.design.mode.factory.test;


public class JpgFactory implements PictureReaderFactory{

	@Override
	public PictureReader getReader() {
		return new JpgReader();
	}

}
