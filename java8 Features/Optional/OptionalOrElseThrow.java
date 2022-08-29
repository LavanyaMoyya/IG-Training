package com.optional;

import java.util.Optional;

public class OptionalOrElseThrow {
	public static void main(String[] args) {
		Optional<String> nonEmptyOptional = Optional.of("Lavanya Moyya");
		Optional<String> emptyOptional = Optional.empty();
		System.out.println(nonEmptyOptional.orElseThrow(NullPointerException::new));
		System.out.println(emptyOptional.orElseThrow(NullPointerException::new));
	}
}
