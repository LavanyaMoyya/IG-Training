package com.abstractfactory;

public class ColorFactory extends ShapeColorAbstractFactory {

	@Override
	Color getColor(String color) {
		if (color.equalsIgnoreCase("RED")) {
			return new Red();
		} else if (color.equalsIgnoreCase("BLUE")) {
			return new Blue();
		} else if (color.equalsIgnoreCase("GREEN")) {
			return new Green();
		}
		return null;
	}

	@Override
	Shape getShape(String shape) {
		return null;
	}

}
