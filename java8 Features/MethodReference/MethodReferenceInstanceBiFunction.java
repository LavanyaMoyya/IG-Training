package com.methodReference;

import java.util.function.BiFunction;

public class MethodReferenceInstanceBiFunction {
	public int add(int a, int b) {
		return a + b;
	}

	public static void main(String[] args) {
		BiFunction<Integer, Integer, Integer> adder = new MethodReferenceInstanceBiFunction()::add;
		int result = adder.apply(10, 20);
		System.out.println("Sum of two Integers: " + result);

	}
}
