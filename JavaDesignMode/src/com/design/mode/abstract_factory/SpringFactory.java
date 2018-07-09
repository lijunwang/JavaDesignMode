package com.design.mode.abstract_factory;

public class SpringFactory implements SkinFactory {

	@Override
	public Button createButton() {
		// TODO Auto-generated method stub
		return new SpringButton();
	}

	@Override
	public TextFiled createTextFiled() {
		return new TextFiled() {
			@Override
			public void display() {
				System.out.println("SpringTextFiled display() ... ");
			}
		};
	}

	@Override
	public CheckBox createCheckBox() {
		// TODO Auto-generated method stub
		return new CheckBox() {
			@Override
			public void display() {
				System.out.println("SpringCheckBox display() ... ");
			}
		};
	}

}
