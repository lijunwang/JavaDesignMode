package com.design.mode.abstract_factory;

public interface SkinFactory {
	public abstract Button createButton();
	public abstract TextFiled createTextFiled();
	public abstract CheckBox createCheckBox();
}
