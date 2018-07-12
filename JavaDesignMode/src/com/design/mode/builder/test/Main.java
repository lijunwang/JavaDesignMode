package com.design.mode.builder.test;

public class Main {
	public static void main(String[] args) {
		System.out
				.println("-----------------------精简模式-----------------------");
		Builder builder = new SimplifyBuilder();
		builder.getPlayer();

		System.out
				.println("-----------------------完整模式-----------------------");
		builder = new IntactBuilder();
		builder.getPlayer();
	}
}
