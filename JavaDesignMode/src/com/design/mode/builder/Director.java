package com.design.mode.builder;

public class Director {

//	private Builder mBuilder;

	/*public void setBuilder(Builder builder) {
		this.mBuilder = builder;
	}*/

	public Product construct(Builder builder) {
		builder.builderPartA();
		builder.builderPartB();
		builder.builderPartC();
		return builder.getResult();
	}
}
