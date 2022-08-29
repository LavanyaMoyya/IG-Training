package com.terminal;

import java.util.Arrays;
import java.util.List;

public class Count {
	public static void main(String[] args) {

		List<String> arrStr = Arrays.asList("abc", "", "bc", "efg", "abcd", "", "jkl", "qwerty");
		long count = arrStr.stream().filter(x -> x.length() > 3).count();

		System.out.println("Total Strings:" + count);

	}

}
