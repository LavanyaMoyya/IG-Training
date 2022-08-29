package com.intermediate;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Distinct {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(10, 20, 30, 40, 30, 20);
		List<Integer> unique = list.stream().distinct().collect(Collectors.toList());
		System.out.println("Unique Values: " + unique);
	}
}
