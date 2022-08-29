package com.intermediate;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MapUpperToLower {
	public static void main(String[] args) {
		List<String>G7=Arrays.asList("USA","JAPAN","FRANCE","GERMANY","ITALY","U.K","CANADA");
		String G7countries=G7.stream().map(x->x.toLowerCase()).collect(Collectors.joining(","));
		System.out.println(G7countries);
		
	}
}
