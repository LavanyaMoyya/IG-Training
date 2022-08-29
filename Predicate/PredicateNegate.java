package com.predicate;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateNegate {
	public static void main(String[] args) {

		Predicate<Integer> p1 = number -> (number % 2 == 0);

		System.out.println(p1.negate().test(10));
		System.out.println(p1.negate().test(13));
		List<String> list = Arrays.asList("Lavanya", "Bhuvi", "Lalitha", "Khyathi", "Latha");
		Predicate<String> p2 = name -> name.startsWith("L");
		list.stream().filter(p2.negate()).forEach(System.out::println);
		
	}

}
