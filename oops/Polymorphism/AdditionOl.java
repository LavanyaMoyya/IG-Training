package com.polymorphism;

public class AdditionOl {
	void sum(int a, int b) {
		int s = a + b;
		System.out.println("Sum of two numbers: " + s);
	}

	void sum(int a, int b, int c) {
		int t = a + b + c;
		System.out.println("Sum of three numbers: " + t);
	}

	public static void main(String[] args) {
		AdditionOl a = new AdditionOl();
		a.sum(20, 30);
		a.sum(10, 20, 30);
	}
}
