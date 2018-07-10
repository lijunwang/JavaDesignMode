package com.design.mode.abstract_factory.test;

import java.io.File;

import com.design.mode.common.XMLUtil;

public class Main {
	public static void main(String[] args) {
		System.out.println("-------------------Android-------------------");
		SystemFactory system = new Android();
		system.getOperationController().show();
		system.getUIController().show();

		System.out.println("-------------------Symbian-------------------");
		system = new Symbian();
		system.getOperationController().show();
		system.getUIController().show();

		System.out.println("-------------------WindowsMobile-------------------");
		system = new WindowsMobile();
		system.getOperationController().show();
		system.getUIController().show();
		
		System.out.println("-------------------XML-------------------");
		system = (SystemFactory) XMLUtil.getBean(XMLUtil.RootPath
				+ File.separatorChar + "abstract_factory" + File.separatorChar
				+ "test" + File.separatorChar + "config.xml");
		system.getOperationController().show();
		system.getUIController().show();
	}
}
