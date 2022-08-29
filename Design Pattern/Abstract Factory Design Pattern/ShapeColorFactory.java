package com.abstractfactory;

public class ShapeColorFactory {
	public static ShapeColorAbstractFactory getChoice(String choice) {
		if (choice.equalsIgnoreCase("SHAPE")) {
			return new ShapeFactory();
		} else if (choice.equalsIgnoreCase("COLOR")) {
			return new ColorFactory();
		}
		return null;

	}
}
