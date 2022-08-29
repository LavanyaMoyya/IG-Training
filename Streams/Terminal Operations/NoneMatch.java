package com.terminal;

import java.util.Arrays;
import java.util.List;

public class NoneMatch {
	public static void main(String[] args) {
		List<String> list = Arrays.asList("Lavanya", "Srikanth", "Bhuvi", "Khyathi");
		boolean noneMatch = list.stream().noneMatch(value -> value.equals("Raju"));
		System.out.println(noneMatch);
	}
}
