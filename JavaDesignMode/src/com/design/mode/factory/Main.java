package com.design.mode.factory;

import java.io.File;
import java.io.ObjectInputStream.GetField;

import com.design.mode.common.XMLUtil;

public class Main {
	public static void main(String[] args) {
		Factory factory = new PieFactory();
		factory.getChart().show();

		factory = new LineFactory();
		factory.getChart().show();

		new PieChart().show();

		System.out.println("--------------------XML------------------");
		factory = (Factory) XMLUtil.getBean(XMLUtil.RootPath
				+ File.separatorChar + "factory" + File.separatorChar
				+ "config.xml");
		factory.getChart().show();
	}
}
