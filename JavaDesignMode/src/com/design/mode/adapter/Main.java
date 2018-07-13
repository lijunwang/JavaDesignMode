package com.design.mode.adapter;

public class Main {
	public static void main(String[] args) {
		SortOperation operation = new SortOperation();
		operation.search();
		operation.sort();
		
		System.out.println("-----------------------������ģʽ-----------------------");
		operation = new Adapter();
		operation.search();
		operation.sort();
		
	}
}
