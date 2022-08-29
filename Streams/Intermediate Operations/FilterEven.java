package com.intermediate;

import java.util.Arrays;
import java.util.List;

public class FilterEven {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(10, 8, 49, 25, 98, 32, 15);
		list.stream().filter(x -> x % 2 == 0).forEach(System.out::println);

	}
}
