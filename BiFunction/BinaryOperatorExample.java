package com.function;

import java.util.function.BinaryOperator;

public class BinaryOperatorExample {
	public static void main(String... args) {
		BinaryOperator<Integer> sumOfSquare = (a, b) -> a * a + b * b;
		Integer i = sumOfSquare.apply(3, 4);
		System.out.println(i);
	}
}
