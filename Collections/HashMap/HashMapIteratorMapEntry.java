package com.collections;

import java.util.HashMap;
import java.util.Map;

public class HashMapIteratorMapEntry {
	public static void main(String[] args) {
		Map<Integer, String> hmap = new HashMap<>();
		hmap.put(101, "Lavanya");
		hmap.put(102, "Srikanth");
		hmap.put(103, "Bhuvi");
		hmap.put(104, "Khyathi");
		hmap.put(105, "Naresh");
		for (Map.Entry<Integer, String> entry : hmap.entrySet()) {
			System.out.println("EmpId: " + entry.getKey() + " " + "Name: " + entry.getValue());
		}
	}
}
