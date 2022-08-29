package com.polymorphism;

public class ChangeSequence {
	void multiply(int x, double y) {
		double m1 = x * y;
		System.out.println("Multiplication of two numbers: " + m1);
	}

	void multiply(double x, int y) {
		double m2 = x * y;
		System.out.println("Multiplication of two numbers: " + m2);
	}

	public static void main(String[] args) {
		ChangeSequence cs = new ChangeSequence();
		cs.multiply(10, 20.9);
		cs.multiply(30.5, 40);
	}
}
