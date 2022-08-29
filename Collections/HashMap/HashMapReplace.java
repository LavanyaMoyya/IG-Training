package com.collections;

import java.util.HashMap;
import java.util.Map;

public class HashMapReplace {
	public static void main(String[] args) {
		Map<Integer, String> hmap = new HashMap<>();
		hmap.put(101, "Lavanya");
		hmap.put(102, "Srikanth");
		hmap.put(103, "Bhuvi");
		hmap.put(104, "Khyathi");
		hmap.put(105, "Naresh");
		System.out.println("Entries in the map before Update: " + hmap);
		hmap.replace(105, "Aasha");
		System.out.println("Entries in the map after replacing based on key: " + hmap);
		hmap.replace(104, "Khyathi", "Jhanvi");
		System.out.println("Entries in the map after replacing old value with new value: " + hmap);
	}
}
