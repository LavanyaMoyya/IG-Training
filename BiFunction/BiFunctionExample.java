package com.function;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;

public class BiFunctionExample {
	public static void main(String[] args) {
		BiFunction<Integer, Integer, Integer> func = (x1, x2) -> x1 + x2;
		Integer result = func.apply(2, 3);
		System.out.println(result);
		System.out.println("----------------");
		BiFunction<Integer, Integer, Double> func2 = (x1, x2) -> Math.pow(x1, x2);
		Double result2 = func2.apply(2, 4);
		System.out.println(result2);
		System.out.println("----------------");
		BiFunction<Integer, Integer, List<Integer>> func3 = (x1, x2) -> Arrays.asList(x1 + x2);
		List<Integer> result3 = func3.apply(2, 3);
		System.out.println(result3);
		System.out.println("----------------");
		BiFunction<String, String, String> bif1 = (input1, input2) -> input1 + input2;
		String res = bif1.apply("Hello", "India");
		System.out.println(res);
		System.out.println("----------------");
		BiFunction<String, String, String> bif2 = (input1, input2) -> input1.concat(input2);
		res = bif2.apply("hai", "saturday");
		System.out.println(res);
		System.out.println("----------------------");
		BiFunction<Integer, Integer, Integer> bif3 = (input1, input2) -> input1 + input2;
		int result1 = bif3.apply(10, 5);
		System.out.println(result1);
		System.out.println("-------------------");
		BiFunction<Integer, Integer, String> bif4 = (input1, input2) -> String.valueOf(input1) + String.valueOf(input2);
		res = bif4.apply(5, 5);
		System.out.println(res);
		System.out.println("-----------------------");
		BiFunction<Integer, Integer, String> bif5 = (input1, input2) -> String.valueOf(input1 * input2);
		res = bif5.apply(5, 5);
		System.out.println(res);

	}
}
