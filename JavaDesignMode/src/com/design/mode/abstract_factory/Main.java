package com.design.mode.abstract_factory;


import com.design.mode.common.XMLUtil;


public class Main {
	public static void main(String[] args) {

		System.out.println("---------------------------Spring---------------------------");
		SkinFactory factory = new SpringFactory();
		Button button = factory.createButton();
		TextFiled textFiled = factory.createTextFiled();
		CheckBox checkBox = factory.createCheckBox();
		
		button.display();
		textFiled.display();
		checkBox.display();

		System.out.println("---------------------------Summer---------------------------");
		factory = new SummerFactory();
		factory.createButton().display();
		factory.createTextFiled().display();
		factory.createCheckBox().display();
		
		//用XML进行文件配置
		System.out.println("---------------------------XML---------------------------");
		factory = (SkinFactory) XMLUtil.getBean("H:/android_workspace_wt02_5.1/JavaDesignMode/src/com/design/mode/abstract_factory/config.xml");
		factory.createButton().display();
		factory.createTextFiled().display();
		factory.createCheckBox().display();
	}
}
