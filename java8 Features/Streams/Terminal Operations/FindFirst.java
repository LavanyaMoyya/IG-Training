package com.terminal;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class FindFirst {
	public static void main(String[] args) {
		List<String> list = Arrays.asList("Lavanya", "Srikanth", "Bhuvi", "Khyathi");

		// String anyElement =list.stream().findFirst().get();
		Optional<String> anyElement = list.stream().findFirst();
		System.out.println(anyElement.get());
	}
}
