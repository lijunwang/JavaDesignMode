package com.design.mode.builder;

public class ConcreteBuilderB extends Builder{

	public ConcreteBuilderB(){
		mProduct.setName("Öî¸ðÁÁ");
	}
	@Override
	public void builderPartA() {
		System.out.println("ConcreteBuilderB builderPartA() ... ");
		mProduct.setPartA("Á¦Á¿30");
	}

	@Override
	protected boolean hidePartB() {
		return true;
	}
	@Override
	public void builderPartB() {
		System.out.println("ConcreteBuilderB builderPartB() ... ");
		mProduct.setPartB("¹¥»÷50");
	}

	@Override
	public void builderPartC() {
		System.out.println("ConcreteBuilderB builderPartC() ... ");
		mProduct.setPartC("Ä§·¨90");
	}

}
