package com.design.mode.factory;

public class PieFactory implements Factory{

	@Override
	public Chart getChart() {
		return new PieChart();
	}

}
