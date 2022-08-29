package com.optional;

import java.util.Optional;
import java.util.function.Predicate;

public class OptionalFilter {
	public static void main(String[] args) {
		Optional<String> nonEmptyOptional = Optional.of("Lavanya Moyya");
		Optional<String> emptyOptional = Optional.empty();

		Predicate<String> predicate = s -> s.contains("Moyya");
		System.out.println(nonEmptyOptional.filter(predicate));
		System.out.println(nonEmptyOptional.filter(s -> s.equals("Lavanya")));
		System.out.println(emptyOptional.filter(predicate));
		System.out.println(nonEmptyOptional.filter(s -> s.startsWith("L")));
	}
}
