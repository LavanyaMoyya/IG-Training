package com.predicate;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateEquals {
	public static void main(String[] args) {
		System.out.println(Predicate.isEqual(10).test(12));
		System.out.println(Predicate.isEqual(10).test(10));
		List<String> list = Arrays.asList("Lavanya", "Bhuvi", "Lalitha", "Khyathi", "Latha");
		String MATCH = "Khyathi";

		list.stream().filter(Predicate.isEqual(MATCH)).forEach(System.out::println);
	}
}
