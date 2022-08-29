package com.abstractfactory;

public class ShapeColorMain {
	public static void main(String[] args) {
		ShapeColorAbstractFactory sc = ShapeColorFactory.getChoice("SHAPE");
		Shape shape1 = sc.getShape("CIRCLE");
		shape1.draw();
		Shape shape2 = sc.getShape("RECTANGLE");
		shape2.draw();
		Shape shape3 = sc.getShape("SQUARE");
		shape3.draw();

		ShapeColorAbstractFactory sc1 = ShapeColorFactory.getChoice("COLOR");
		Color color1 = sc1.getColor("RED");
		color1.fill();

		Color color2 = sc1.getColor("BLUE");
		color2.fill();
		Color color3 = sc1.getColor("GREEN");
		color3.fill();

	}

}
