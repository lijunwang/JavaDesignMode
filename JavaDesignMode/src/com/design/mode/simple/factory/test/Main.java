package com.design.mode.simple.factory.test;

public class Main {
	public static void main(String[] args) {
		
		DrawingBoard board = DrawingBoardFactory.getDrawingBoard("CircleDrawingBoard");
		board.draw();
		board.erase();
		
		board = DrawingBoardFactory.getDrawingBoard("RectangleDrawingBoard");
		board.draw();
		board.erase();
		
		board = DrawingBoardFactory.getDrawingBoard("SquareDrawingBoard");
		board.draw();
		board.erase();
		
		board = DrawingBoardFactory.getDrawingBoard("XX");
		board.draw();
		board.erase();
	}
}
