package com.optional;

import java.util.Optional;
import java.util.function.Supplier;

public class OptionalOrElseGet {
	public static void main(String[] args) {
		Optional<String> nonEmptyOptional = Optional.of("Lavanya Moyya");
		Optional<String> emptyOptional = Optional.empty();
		Supplier<String> supplier = () -> "Srikanth Goli";

		System.out.println(nonEmptyOptional.orElseGet(supplier));
		System.out.println(emptyOptional.orElseGet(supplier));
	}
}
