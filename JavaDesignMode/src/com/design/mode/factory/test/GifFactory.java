package com.design.mode.factory.test;

public class GifFactory implements PictureReaderFactory{

	@Override
	public PictureReader getReader() {
		return new GifReader();
	}

}
