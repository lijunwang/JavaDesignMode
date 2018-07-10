package com.design.mode.abstract_factory.test;

public class Symbian implements SystemFactory{

	@Override
	public UIController getUIController() {
		// TODO Auto-generated method stub
		return new SymbianUIController();
	}

	@Override
	public OperationController getOperationController() {
		// TODO Auto-generated method stub
		return new SymbianOperationController();
	}

}
