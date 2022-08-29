package com.optional;

import java.util.Optional;

public class OptionalOf {
	public static void main(String[] args) {

		Optional nonEmptyOptional = Optional.of("Lavanya");
		System.out.println(nonEmptyOptional);
		System.out.println(Optional.of(null));
	}
}
