package com.terminal;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Reduce {
	public static void main(String[] args) {
		List<String> list = Arrays.asList("Lavanya", "Srikanth", "Bhuvi", "Khyathi");
		Optional<String> reduced = list.stream().reduce((value, combinedValue) -> {
			return combinedValue + " + " + value;
		});
		System.out.println(reduced.get());
	}
}
