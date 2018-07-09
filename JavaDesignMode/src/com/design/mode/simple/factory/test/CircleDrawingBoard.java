package com.design.mode.simple.factory.test;

public class CircleDrawingBoard implements DrawingBoard{

	public CircleDrawingBoard(){
		System.out.println("CircleDrawingBoard ´´½¨ÖÐ ...");
	}
	@Override
	public void draw() {
		System.out.println("CircleDrawingBoard draw ...");
	}

	@Override
	public void erase() {
		System.out.println("CircleDrawingBoard erase ...");
	}

}
