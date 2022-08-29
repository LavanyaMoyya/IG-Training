package com.intermediate;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MapLowerToUpper {
	public static void main(String[] args) {
		List<String>G7=Arrays.asList("USA","Japan","France","Germany","Italy","U.K","Canada");
		String G7countries=G7.stream().map(x->x.toUpperCase()).collect(Collectors.joining(","));
		System.out.println(G7countries);
		
	}
}
