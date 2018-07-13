package com.design.mode.adapter;

public class Adapter extends SortOperation{

	private Adaptee mAdaptee = new Adaptee();
	@Override
	public void search() {
		mAdaptee.newSearch();
	}
	
	@Override
	public void sort() {
		mAdaptee.newSort();
	}
}
