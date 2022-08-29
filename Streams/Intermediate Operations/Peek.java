package com.intermediate;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Peek {
	public static void main(String[] args) {
		List<String> list = Arrays.asList("Lavanya", "Srikanth", "Bhuvi", "Khyathi");
		list.stream().filter(x -> x.length() > 5).peek(e -> System.out.println("Filtered Value: " + e))
				.map(x -> x.toUpperCase()).peek(e -> System.out.println("Mapped Value: " + e)).collect(Collectors.toList());
	}
}
