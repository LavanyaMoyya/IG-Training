package com.predicate;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateStream {
	public static void main(String[] args) {
		List<String> list = Arrays.asList("Lavanya", "Bhuvi", "Lalitha", "Khyathi", "Latha");
		Predicate<String> p = name -> name.startsWith("L");

		list.stream().filter(p).forEach(System.out::println);
	}
}
