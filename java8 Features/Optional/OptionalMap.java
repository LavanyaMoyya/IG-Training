package com.optional;

import java.util.Optional;
import java.util.function.Function;

public class OptionalMap {
	public static void main(String[] args) {
		Optional<String> nonEmptyOptional = Optional.of("Lavanya Moyya");
		Optional<String> emptyOptional = Optional.empty();
		Function<String, String> function = s -> s.substring(0, 0).length() == 0 ? null : s;

		System.out.println(nonEmptyOptional.map(function));
		System.out.println(nonEmptyOptional.map(String::toLowerCase));
		System.out.println(emptyOptional.map(function));
	}
}
