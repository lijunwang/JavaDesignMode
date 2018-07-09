package com.design.mode.simple.factory.test;

public class RectangleDrawingBoard implements DrawingBoard {

	public RectangleDrawingBoard() {
		System.out.println("RectangleDrawingBoard ´´½¨ÖÐ ... ");
	}

	@Override
	public void draw() {
		System.out.println("RectangleDrawingBoard draw ... ");
	}

	@Override
	public void erase() {
		System.out.println("RectangleDrawingBoard erase ... ");
	}
}
