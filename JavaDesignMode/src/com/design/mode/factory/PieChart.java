package com.design.mode.factory;

public class PieChart implements Chart{

	public PieChart(){
		System.out.println("PieChart ��ʼ�� ... ");
	}
	@Override
	public void show() {
		System.out.println("PieChart show() ...");
	}

}
