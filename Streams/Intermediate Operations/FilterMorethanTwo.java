package com.intermediate;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterMorethanTwo {
	public static void main(String[] args) {
		List<String> arrStr = Arrays.asList("abc", "", "bc", "efg", "abcd", "", "jkl", "qwerty");
		List<String> elements = arrStr.stream().filter(x -> x.length() > 2).collect(Collectors.toList());
		System.out.println("More than Two Characters: " + elements);
	}
}
