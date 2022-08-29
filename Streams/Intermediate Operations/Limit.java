package com.intermediate;

import java.util.Arrays;
import java.util.List;

public class Limit {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(10, 20, 30, 40, 50);
		list.stream().limit(3).forEach(System.out::println);
	}
}
