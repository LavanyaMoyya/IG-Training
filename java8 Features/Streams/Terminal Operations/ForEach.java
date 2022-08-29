package com.terminal;

import java.util.Arrays;
import java.util.List;

public class ForEach {
	public static void main(String[] args) {
		List<String> list = Arrays.asList("Lavanya", "Srikanth", "Bhuvi", "Khyathi");
		list.stream().forEach(System.out::println);
	}
}
