package com.collections;

import java.util.HashMap;
import java.util.Map;

public class HashMapForEach {
	public static void main(String[] args) {
		Map<Integer, String> hmap = new HashMap<>();
		hmap.put(101, "Lavanya");
		hmap.put(102, "Srikanth");
		hmap.put(103, "Bhuvi");
		hmap.put(104, "Khyathi");
		hmap.put(105, "Naresh");
		hmap.forEach((k, v) -> System.out.println("Empid: " + k + " " + "Name: " + v));
	}
}
