package com.function;

import java.util.function.Function;

public class FunctionApply {
	public static void main(String[] args) {
		Function<Integer, Integer> f1 = i -> i * 4;
		System.out.println(f1.apply(3));

		Function<Integer, Integer> f2 = i -> i + 4;
		System.out.println(f2.apply(3));

		Function<String, Integer> f3 = s -> s.length();
		System.out.println(f3.apply("Peter"));

	}
}
