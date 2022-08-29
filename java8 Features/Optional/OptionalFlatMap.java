package com.optional;

import java.util.Optional;
import java.util.function.Function;

public class OptionalFlatMap {
	public static void main(String[] args) {

		Optional<Optional> optionalContainer = Optional.of(Optional.of("Lavanya Moyya"));
		Optional<Optional> emptyOptionalContainer = Optional.of(Optional.of("Lavanya Moyya"));

		Function<String, String> function = s -> s.substring(0, 0).length() == 0 ? null : s;
		Function<String, String> function2 = s -> s.substring(0, 7);

		System.out.println(optionalContainer.map(optional -> optional.map(function2)));
		System.out.println(optionalContainer.flatMap(optional -> optional.map(function2)));
		System.out.println(emptyOptionalContainer.flatMap(optional -> optional.map(function)));
	}
}
