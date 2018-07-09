package com.design.mode.factory.test;

public class GifReader implements PictureReader{

	public GifReader(){
		System.out.println("GifReader ������ ... ");
	}
	@Override
	public void read() {
		System.out.println("GifReader read() ... ");
	}

}
