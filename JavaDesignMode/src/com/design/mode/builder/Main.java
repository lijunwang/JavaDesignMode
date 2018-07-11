package com.design.mode.builder;

public class Main {
	public static void main(String[] args) {
		Director director = new Director();
		Product product = director.construct(new ConcreteBuilderA());
		System.out.println(product);
		
		product = director.construct(new ConcreteBuilderB());
		System.out.println(product);
		
		
		System.out.println("--------------------------------ÈÆ¿ªDirector--------------------------------");
		product = new ConcreteBuilderA().constructProduct();
		System.out.println(product);

		product = new ConcreteBuilderB().constructProduct();
		System.out.println(product);
	}
}
