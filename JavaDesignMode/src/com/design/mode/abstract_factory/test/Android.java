package com.design.mode.abstract_factory.test;

public class Android implements SystemFactory{

	@Override
	public UIController getUIController() {
		return new AndroidUIController();
	}

	@Override
	public OperationController getOperationController() {
		return new AndroidOperationController();
	}

}
