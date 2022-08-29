package com.collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class HashMapIteratorRemove {
	public static void main(String[] args) {
		Map<Integer, String> hmap = new HashMap<>();
		hmap.put(101, "Lavanya");
		hmap.put(102, "Srikanth");
		hmap.put(103, "Bhuvi");
		hmap.put(104, "Khyathi");
		hmap.put(105, "Naresh");

		Iterator<Entry<Integer, String>> itr1 = hmap.entrySet().iterator();
		System.out.println("Iterating entries of the map: ");
		while (itr1.hasNext()) {
			Object keyValue = itr1.next();
			System.out.println(keyValue);
		}
		itr1.remove();
		System.out.println("Entries of map after removing: " + hmap.entrySet());

	}
}
