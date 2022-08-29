package com.function;

import java.util.function.BiPredicate;

public class BiPredicateExample {
	public static void main(String... args) {
		BiPredicate<Integer, Integer> multiplePredicate = (a, b) -> a % b == 0;
		boolean b = multiplePredicate.test(72, 9);
		System.out.println(b);
	}
}
