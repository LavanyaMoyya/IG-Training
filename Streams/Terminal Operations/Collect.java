package com.terminal;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Collect {
	public static void main(String[] args) {
		List<String> list = Arrays.asList("Lavanya", "Srikanth", "Bhuvi", "Khyathi");
		List<String> elements = list.stream().map(x -> x.toUpperCase()).collect(Collectors.toList());
		System.out.println(elements);
	}
}
