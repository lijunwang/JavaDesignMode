package com.design.mode.abstract_factory;

public class SummerFactory implements SkinFactory{

	@Override
	public Button createButton() {
		return new SummerButton();
	}

	@Override
	public TextFiled createTextFiled() {
		return new SummerTextFiled();
	}

	@Override
	public CheckBox createCheckBox() {
		return new SummerCheckBox();
	}

}
