package com.collections;

import java.util.HashMap;
import java.util.Map;

public class HashMapRemove {
	public static void main(String[] args) {
		Map<Integer, String> hmap = new HashMap<>();
		hmap.put(101, "Lavanya");
		hmap.put(102, "Srikanth");
		hmap.put(103, "Bhuvi");
		hmap.put(104, "Khyathi");
		hmap.put(105, "Naresh");
		System.out.println("Entries in the map before remove: " + hmap);
		hmap.remove(104);
		System.out.println("Entries in the map after removing entry based on key: " + hmap);
		hmap.remove(105, "Naresh");
		System.out.println("Entries in the map after removing entry based on key and value: " + hmap);
		hmap.clear();
		System.out.println("Entreies after clearing the map: " + hmap);
	}
}