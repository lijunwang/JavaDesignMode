package com.design.mode.factory;

public class LineChart implements Chart {

	public LineChart() {
		System.out.println("LineChart ��ʼ�� ...");
	}

	@Override
	public void show() {
		System.out.println("LineChart show() ...");
	}
}
