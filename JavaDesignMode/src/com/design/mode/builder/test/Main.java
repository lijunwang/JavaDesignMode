package com.design.mode.builder.test;

public class Main {
	public static void main(String[] args) {
		System.out
				.println("-----------------------����ģʽ-----------------------");
		Builder builder = new SimplifyBuilder();
		builder.getPlayer();

		System.out
				.println("-----------------------����ģʽ-----------------------");
		builder = new IntactBuilder();
		builder.getPlayer();
	}
}
