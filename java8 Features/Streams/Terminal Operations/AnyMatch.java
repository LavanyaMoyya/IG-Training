package com.terminal;

import java.util.Arrays;
import java.util.List;

public class AnyMatch {
	public static void main(String[] args) {
		List<String> list = Arrays.asList("Lavanya", "Srikanth", "Bhuvi", "Khyathi");
		boolean anyMatch = list.stream().anyMatch((value) -> value.startsWith("S"));
		System.out.println(anyMatch);
	}
}
