package com.design.mode.builder.test;

public class IntactBuilder extends Builder {

	@Override
	public void buildMenu() {
		System.out.println("IntactBuilder buildMenu() ... ");
	}

	@Override
	public void buildMainWindow() {
		System.out.println("IntactBuilder buildMainWindow() ... ");
	}

	@Override
	public void buildPlayHistory() {
		System.out.println("IntactBuilder buildPlayHistory() ... ");
	}

	@Override
	public void buildControlBar() {
		System.out.println("IntactBuilder buildControlBar() ... ");
	}

	@Override
	public void buildFavoriteList() {
		System.out.println("IntactBuilder buildFavoriteList() ... ");
	}

}
