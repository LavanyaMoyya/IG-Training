package com.polymorphism;

public class ChangingDatatype {
	int subtraction(int x, int y) {
		int difference = y - x;
		System.out.println("Subtraction of two numbers: " + difference);
		return difference;

	}

	double subtraction(double x, double y) {
		double diff = y - x;
		System.out.println("Difference of two numbers: " + diff);
		return diff;

	}

	public static void main(String[] args) {
		ChangingDatatype cd = new ChangingDatatype();
		cd.subtraction(20, 50);
		cd.subtraction(10.2, 30.8);
	}
}
