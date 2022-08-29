package com.abstractfactory;

public class ComputerFactory {
	public static Computer getComputer(ComputerAbstractFactory factory) {
		return factory.createComputer();

	}
}
//we will create a consumer class that will provide the entry point for the client classes to create sub-classes