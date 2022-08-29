package com.abstractfactory;

public class ShapeFactory extends ShapeColorAbstractFactory {

	@Override
	Color getColor(String color) {

		return null;
	}

	@Override
	Shape getShape(String shapeType) {

		if (shapeType.equalsIgnoreCase("CIRCLE")) {
			return new Circle();
		} else if (shapeType.equalsIgnoreCase("RECTANGLE")) {
			return new Rectangle();

		} else if (shapeType.equalsIgnoreCase("SQUARE")) {
			return new Square();
		}
		return null;
	}

}
