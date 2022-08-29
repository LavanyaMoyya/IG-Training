package com.intermediate;

import java.util.Arrays;
import java.util.List;

public class DistinctString {
	public static void main(String[] args) {
		List<String> list = Arrays.asList("Lavanya", "Srikanth", "Bhuvi", "Khyathi", "Srikanth", "Bhuvi");
		list.stream().distinct().forEach(System.out::println);
	}
}
