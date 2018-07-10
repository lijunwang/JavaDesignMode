package com.design.mode.abstract_factory.test;

public interface SystemFactory {
	public abstract UIController getUIController();
	public abstract OperationController getOperationController();
}
