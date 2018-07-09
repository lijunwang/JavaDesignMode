package com.design.mode.simple.factory.test;

public class SquareDrawingBoard implements DrawingBoard {

	public SquareDrawingBoard() {
		System.out.println("SquareDrawingBoard ´´½¨ÖÐ ...");
	}

	@Override
	public void draw() {
		System.out.println("SquareDrawingBoard draw ...");
	}

	@Override
	public void erase() {
		System.out.println("SquareDrawingBoard erase ...");
	}

}
