package com.design.mode.factory;

public class PieChart implements Chart{

	public PieChart(){
		System.out.println("PieChart ≥ı ºªØ ... ");
	}
	@Override
	public void show() {
		System.out.println("PieChart show() ...");
	}

}
