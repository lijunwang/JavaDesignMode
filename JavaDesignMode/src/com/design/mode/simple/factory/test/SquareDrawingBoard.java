package com.design.mode.simple.factory.test;

public class SquareDrawingBoard implements DrawingBoard {

	public SquareDrawingBoard() {
		System.out.println("SquareDrawingBoard ������ ...");
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
