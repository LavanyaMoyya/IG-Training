package com.abstractfactory;

abstract class ShapeColorAbstractFactory {
	abstract Color getColor(String color);

	abstract Shape getShape(String shape);
}
