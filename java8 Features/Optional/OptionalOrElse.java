package com.optional;

import java.util.Optional;

public class OptionalOrElse {
	public static void main(String[] args) {
	    Optional<String> nonEmptyOptional = Optional.of("Lavanya Moyya");
	        Optional<String> emptyOptional = Optional.empty();
	        System.out.println(nonEmptyOptional.orElse("Srikanth Goli"));
	        System.out.println(emptyOptional.orElse("Srikanth Goli"));
	  }
}
