package com.design.mode.simple.factory;

public class ChartFactory {
	public static Chart getChart(String type) {
		if ("LineChart".equals(type)) {
			return new LineChart();
		} else if ("PieChart".equals(type)) {
			return new PieChart();
		} else if ("BarChart".equals(type)) {
			return new BarChart();
		} else {
			throw new IllegalArgumentException("您输入的参数有误 ...");
		}
	};
}
