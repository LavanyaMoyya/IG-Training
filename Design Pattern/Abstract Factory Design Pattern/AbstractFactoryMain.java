package com.abstractfactory;

public class AbstractFactoryMain {
	public static void main(String[] args) {
		testAbstractFactory();
	}

	private static void testAbstractFactory() {
		Computer pc = ComputerFactory.getComputer(new PCFactory("2 GB", "500 GB", "2.4 GHz"));
		Computer server = ComputerFactory.getComputer(new ServerFactory("16 GB", "1TB", "2.9 GHz"));
		System.out.println("Abstract Factory PC Config:: " + pc);
		System.out.println("abstract Factory Server Config:: " + server);
	}
}
