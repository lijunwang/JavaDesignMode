package com.design.mode.simple.factory.test;

public class DrawingBoardFactory {
	public static DrawingBoard getDrawingBoard(String type) {
		if ("CircleDrawingBoard".equals(type)) {
			return new CircleDrawingBoard();
		} else if ("RectangleDrawingBoard".equals(type)) {
			return new CircleDrawingBoard();
		} else if ("SquareDrawingBoard".equals(type)) {
			return new SquareDrawingBoard();
		} else {
			throw new UnsupportedOperationException("������Ļ����������󣬲�֧�� ...");
		}
	}
}
