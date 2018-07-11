package com.design.mode.builder;

public class Product {
	private String partA;
	private String partB;
	private String partC;
	private String name;

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return (name == null ? "" : "name:" + name + ",") + "partA:" + partA + ",partB:" + partB + ",partC:" + partC;
	}

	public String getPartA() {
		return partA;
	}

	public void setPartA(String partA) {
		this.partA = partA;
	}

	public String getPartB() {
		return partB;
	}

	public void setPartB(String partB) {
		this.partB = partB;
	}

	public String getPartC() {
		return partC;
	}

	public void setPartC(String partC) {
		this.partC = partC;
	}

}
