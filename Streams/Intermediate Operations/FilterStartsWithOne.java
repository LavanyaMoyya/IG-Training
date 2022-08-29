package com.intermediate;

import java.util.Arrays;
import java.util.List;

public class FilterStartsWithOne {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(10, 15, 8, 49, 20, 14, 98);
		list.stream().map(x -> x + "").filter(x -> x.startsWith("1")).forEach(System.out::println);
	}
}
