package com.optional;

import java.util.Optional;
import java.util.function.Consumer;

public class OptionalIfPresent {
	public static void main(String[] args) {
		Optional<String> nonEmptyOptional = Optional.of("Lavanya");
		Optional<String> emptyOptional = Optional.empty();
		Consumer<String> consumer = s -> System.out.println(s);
		nonEmptyOptional.ifPresent(consumer);
		emptyOptional.ifPresent(consumer);
	}
}
