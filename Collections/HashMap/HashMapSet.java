package com.collections;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapSet {

	public static void main(String[] rgs) {
		Map<Integer, String> hmap = new HashMap<>();
		hmap.put(101, "Lavanya");
		hmap.put(102, "Srikanth");
		hmap.put(103, "Bhuvi");
		hmap.put(104, "Khyathi");
		hmap.put(105, "Naresh");
		Set<Integer> keys = hmap.keySet();
		System.out.println("Set view of Keys: " + keys);
		Collection<String> values = hmap.values();
		System.out.println("Collection view of Values: " + values);
	}
}
