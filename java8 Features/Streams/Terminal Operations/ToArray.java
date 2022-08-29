package com.terminal;

import java.util.Arrays;
import java.util.List;

public class ToArray {
	public static void main(String[] args) {
		List<String> list = Arrays.asList("Lavanya", "Srikanth", "Bhuvi", "Khyathi");
		Object[] obj = list.stream().toArray();
		System.out.println(obj[0]);
		System.out.println(obj[1]);
		System.out.println(obj[2]);
		System.out.println(obj[3]);

	}
}
