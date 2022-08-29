package com.terminal;

import java.util.Arrays;
import java.util.List;

public class AllMatch {
	public static void main(String[] args) {
		List<String> list = Arrays.asList("Lavanya G", "Srikanth G", "Bhuvi M", "Khyathi M");
		boolean allMatch = list.stream().allMatch(value -> value.contains("M"));
		System.out.println(allMatch);
	}
}
