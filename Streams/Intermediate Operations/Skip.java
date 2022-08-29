package com.intermediate;

import java.util.Arrays;
import java.util.List;

public class Skip {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		list.stream().filter(i -> i % 2 == 0).skip(2).forEach(System.out::println);
	}
}
