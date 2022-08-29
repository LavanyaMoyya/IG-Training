package com.predicate;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateOR {
	public static void main(String[] args) {

		Predicate<Integer> p1 = number -> (number % 2 == 0);
		Predicate<Integer> p2 = number -> (number > 10);

		System.out.println(p1.or(p2).test(11));
		System.out.println(p1.or(p2).test(12));
		List<String> list = Arrays.asList("Lavanya", "Bhuvi", "Lalitha", "Khyathi", "Latha");
		Predicate<String> p3 = name -> name.startsWith("L");
		Predicate<String> p4 = name -> name.endsWith("i");
		list.stream().filter(p3.or(p4)).forEach(System.out::println);

	}

}
