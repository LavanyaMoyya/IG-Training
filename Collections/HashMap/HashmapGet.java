package com.collections;

import java.util.HashMap;
import java.util.Map;

public class HashmapGet {
	public static void main(String[] args) {
		Map<Integer, String> hmap = new HashMap<>();
		hmap.put(101, "Lavanya");
		hmap.put(102, "Srikanth");
		hmap.put(103, "Bhuvi");
		hmap.put(104, "Khyathi");
		hmap.put(105, "Naresh");

		String value = hmap.get(102);
		System.out.println("Getting value based on key: " + value);

		boolean enrtyKey = hmap.containsKey(107);
		System.out.println(enrtyKey);

		boolean entryValue = hmap.containsValue("Bhuvi");
		System.out.println(entryValue);

	}
}
