package com.design.mode.factory;

public class LineFactory implements Factory{
	@Override
	public Chart getChart() {
		return new LineChart();
	}
}
