package com.design.mode.abstract_factory.test;

public class WindowsMobile implements SystemFactory{

	@Override
	public UIController getUIController() {
		return new WindowsMobileUIController();
	}

	@Override
	public OperationController getOperationController() {
		return new WindowsMobileOperationController();
	}

}
