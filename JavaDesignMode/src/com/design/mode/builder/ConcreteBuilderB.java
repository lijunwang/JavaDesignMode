package com.design.mode.builder;

public class ConcreteBuilderB extends Builder{

	public ConcreteBuilderB(){
		mProduct.setName("�����");
	}
	@Override
	public void builderPartA() {
		System.out.println("ConcreteBuilderB builderPartA() ... ");
		mProduct.setPartA("����30");
	}

	@Override
	protected boolean hidePartB() {
		return true;
	}
	@Override
	public void builderPartB() {
		System.out.println("ConcreteBuilderB builderPartB() ... ");
		mProduct.setPartB("����50");
	}

	@Override
	public void builderPartC() {
		System.out.println("ConcreteBuilderB builderPartC() ... ");
		mProduct.setPartC("ħ��90");
	}

}
