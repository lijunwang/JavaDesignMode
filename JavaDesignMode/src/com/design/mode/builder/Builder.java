package com.design.mode.builder;

public abstract class Builder {
	protected Product mProduct = new Product();

	public abstract void builderPartA();

	public abstract void builderPartB();

	public abstract void builderPartC();

	public Product getResult() {
		return mProduct;
	}

	protected boolean hidePartB() {
		return false;
	}

	// �Ƶ�Director
	public final Product constructProduct() {
		builderPartA();
		if (!hidePartB()) {
			builderPartB();
		}else{
			System.out.println("����PartB");
		}
		builderPartC();
		return mProduct;
	}
}
