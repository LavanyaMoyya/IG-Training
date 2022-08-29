package com.intermediate;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SortingUsingLambda {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(2, 4, 1, 3, 7, 5, 9, 6, 8);

		List<Integer> sortedList = list.stream().sorted((i1, i2) -> i1.compareTo(i2)).collect(Collectors.toList());

		System.out.println(sortedList);
	}
}
