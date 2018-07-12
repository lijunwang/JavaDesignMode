package com.design.mode.builder.test;

public abstract class Builder {
	protected VideoPlayer mPlayer = new VideoPlayer();
	private String menu = "菜单";
	private String mainWindow = "主窗口";
	private String playHistory = "播放列表";
	private String controlBar = "控制条";
	private String favoriteList = "收藏列表";

	public abstract void buildMenu();

	public abstract void buildMainWindow();

	public abstract void buildPlayHistory();

	public abstract void buildControlBar();

	public abstract void buildFavoriteList();

	public boolean shouldBuildMenu() {
		return true;
	}

	public boolean shouldBuildMainWindow() {
		return true;
	}

	public boolean shouldBuildPlayHistory() {
		return true;
	}

	public boolean shouldBuildControlBar() {
		return true;
	}

	public boolean shouldBuildFavoriteList() {
		return true;
	}

	public VideoPlayer getPlayer() {
		if (shouldBuildMenu()) {
			buildMenu();
		}
		if(shouldBuildMainWindow()){
			buildMainWindow();
		}
		if (shouldBuildControlBar()) {
			buildControlBar();
		}
		if(shouldBuildFavoriteList()){
			buildFavoriteList();
		}
		if(shouldBuildPlayHistory()){
			buildPlayHistory();
		}

		return mPlayer;
	}
}
