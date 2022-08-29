package com.intermediate;

import java.util.Arrays;
import java.util.List;

public class MapStringLength {
	public static void main(String[] args) {
		List<String> list = Arrays.asList("Lavanya", "Srikanth", "Bhuvi", "Khyathi");
		list.stream().map(str -> str.length()).forEach(System.out::println);
	}
}
