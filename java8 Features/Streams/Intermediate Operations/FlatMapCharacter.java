package com.intermediate;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class FlatMapCharacter {
	public static void main(String[] args) {
		List<String> list = Arrays.asList("Lavanya", "Srikanth", "Bhuvi", "Khyathi");
		list.stream().flatMap(str -> Stream.of(str.charAt(2))).forEach(System.out::println);
	}
}
