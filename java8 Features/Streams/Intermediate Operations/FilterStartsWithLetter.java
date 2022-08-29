package com.intermediate;

import java.util.Arrays;
import java.util.List;

public class FilterStartsWithLetter {
	public static void main(String[] args) {
		List<String> list = Arrays.asList("abc", "", "xy", "pqr", "stuv", "", "lmn");
		list.stream().filter(x -> x.startsWith("a")).forEach(System.out::println);
	}
}
