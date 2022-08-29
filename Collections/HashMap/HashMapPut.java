package com.collections;

import java.util.HashMap;
import java.util.Map;

public class HashMapPut {
	public static void main(String[] args) {
		Map<Integer, String> hmap = new HashMap<>();
		boolean isEmpty = hmap.isEmpty();
		System.out.println("Is Map is empty? " + isEmpty);
		hmap.put(101, "Lavanya");
		hmap.put(102, "Srikanth");
		hmap.put(103, "Bhuvi");
		hmap.put(104, "Khyathi");
		hmap.put(105, "Naresh");
		System.out.println("Entries in the map: " + hmap);
		int size = hmap.size();
		System.out.println("Number of entries in the map: " + size);

		Map<Integer, String> hmap1 = new HashMap<>();
		hmap1.put(106, "Raju");
		hmap1.put(107, "Ramya");
		hmap1.put(108, "Mouli");
		hmap.putAll(hmap1);
		System.out.println("Entries in updated map: " + hmap);
	}
}
