package com.optional;

import java.util.Optional;

public class OptionalIsPresent {
public static void main(String[] args) {
	String name="Lavanya";
    Optional<String> nonEmptyOptional = Optional.of(name);
    Optional emptyOptional = Optional.empty();
    
    System.out.println(emptyOptional.isPresent());
    System.out.println(nonEmptyOptional.isPresent());
}
}
