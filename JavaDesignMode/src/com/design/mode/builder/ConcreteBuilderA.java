package com.design.mode.builder;

public class ConcreteBuilderA extends Builder {

	public ConcreteBuilderA(){
		mProduct.setName("����");
	}
	@Override
	public void builderPartA() {
		System.out.println("ConcreteBuilderA builderPartA() ... ");
		mProduct.setPartA("����80");
	}

	@Override
	public void builderPartB() {
		System.out.println("ConcreteBuilderA builderPartB() ... ");
		mProduct.setPartB("����80");
	}

	@Override
	public void builderPartC() {
		System.out.println("ConcreteBuilderA builderPartC() ... ");
		mProduct.setPartC("ħ��30");
	}

}
