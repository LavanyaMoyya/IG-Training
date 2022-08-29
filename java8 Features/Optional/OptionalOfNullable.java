package com.optional;

import java.util.Optional;

public class OptionalOfNullable {
	public static void main(String[] args) {
	    Optional nonEmptyOptional = Optional.ofNullable("Lavanya");
	    Optional emptyOptional = Optional.ofNullable(null);
	    System.out.println(nonEmptyOptional);
	    System.out.println(emptyOptional);
	  }
}
