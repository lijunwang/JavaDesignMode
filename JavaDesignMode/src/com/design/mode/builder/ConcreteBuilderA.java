package com.design.mode.builder;

public class ConcreteBuilderA extends Builder {

	public ConcreteBuilderA(){
		mProduct.setName("关羽");
	}
	@Override
	public void builderPartA() {
		System.out.println("ConcreteBuilderA builderPartA() ... ");
		mProduct.setPartA("力量80");
	}

	@Override
	public void builderPartB() {
		System.out.println("ConcreteBuilderA builderPartB() ... ");
		mProduct.setPartB("攻击80");
	}

	@Override
	public void builderPartC() {
		System.out.println("ConcreteBuilderA builderPartC() ... ");
		mProduct.setPartC("魔法30");
	}

}
