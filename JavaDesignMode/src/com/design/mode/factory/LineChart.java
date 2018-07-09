package com.design.mode.factory;

public class LineChart implements Chart {

	public LineChart() {
		System.out.println("LineChart ≥ı ºªØ ...");
	}

	@Override
	public void show() {
		System.out.println("LineChart show() ...");
	}
}
