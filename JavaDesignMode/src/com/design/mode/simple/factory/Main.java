package com.design.mode.simple.factory;

public class Main {
	public static void main(String[] args) {
		ChartFactory.getChart("PieChart").display();
		ChartFactory.getChart("BarChart").display();
		ChartFactory.getChart("LineChart").display();
	}
}
