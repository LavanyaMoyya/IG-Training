package com.function;

import java.util.function.Function;

public class FunctionCompose {
	public static void main(String[] args) {

		Function<Integer, Integer> f1 = i -> i * 4;
		Function<Integer, Integer> f2 = i -> i + 4;

		System.out.println(f2.compose(f1).apply(3));

		Integer j1 = f1.apply(3);
		Integer j2 = f2.apply(j1);

		System.out.println(j2);
	}
}
