package com.terminal;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Min {
	public static void main(String[] args) {
		List<String> list = Arrays.asList("Lavanya", "Srikanth", "Bhuvi", "Khyathi");
		Optional<String> minElement = list.stream().min((val1, val2) -> val1.compareTo(val2));
		System.out.println(minElement.get());
	}
}
