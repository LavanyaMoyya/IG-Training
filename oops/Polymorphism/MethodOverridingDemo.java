package com.polymorphism;

class Shape {
	void draw() {
		System.out.println("Drawing Shapes...");
	}
}

class Circle extends Shape {

	@Override
	void draw() {
		System.out.println("Drawing Circle");
	}

}

class Square extends Shape {
	@Override
	void draw() {
		System.out.println("Drawing Square");
	}
}

class Rectangle extends Shape {
	@Override
	void draw() {
		System.out.println("Drawing Rectangle");

	}
}

public class MethodOverridingDemo {
	public static void main(String[] args) {
		Shape s;
		s = new Shape();
		s.draw();
		s = new Circle();
		s.draw();
		s = new Square();
		s.draw();
		s = new Rectangle();
		s.draw();

	}

}
