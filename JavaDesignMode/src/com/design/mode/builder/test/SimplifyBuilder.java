package com.design.mode.builder.test;

public class SimplifyBuilder extends Builder{

	@Override
	public void buildMenu() {
		System.out.println("SimplifyBuilder buildMenu() ...");
	}

	@Override
	public void buildMainWindow() {
		System.out.println("SimplifyBuilder buildMainWindow() ...");
	}

	@Override
	public void buildPlayHistory() {
		System.out.println("SimplifyBuilder buildPlayHistory() ...");
	}

	@Override
	public void buildControlBar() {
		System.out.println("SimplifyBuilder buildControlBar() ...");
	}

	@Override
	public void buildFavoriteList() {
		System.out.println("SimplifyBuilder buildFavoriteList() ...");
	}
	
	@Override
	public boolean shouldBuildControlBar() {
		return false;
	}
	
	@Override
	public boolean shouldBuildMenu() {
		return false;
	}
	
	@Override
	public boolean shouldBuildFavoriteList() {
		return false;
	}
	
	@Override
	public boolean shouldBuildPlayHistory() {
		return false;
	}
}
