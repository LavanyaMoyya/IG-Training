package com.intermediate;

import java.util.Arrays;
import java.util.List;

public class FilterEmptyString {
	public static void main(String[] args) {
		List<String> list = Arrays.asList("abc", "", "xy", "pqr", "stuv", "", "lmn");
		Long count = list.stream().filter(x -> x.isEmpty()).count();
		System.out.println("Number of Emty Strings: " + count);
	}
}
