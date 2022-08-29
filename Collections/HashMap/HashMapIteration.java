package com.collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class HashMapIteration {
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

		Iterator<Integer> itr2 = hmap.keySet().iterator();
		System.out.println("Iterating keys of map :");
		while (itr2.hasNext()) {
			Object keyView = itr2.next();
			System.out.println(keyView);

		}
		Iterator<String> itr3 = hmap.values().iterator();
		System.out.println("Iterating values of map: ");
		while (itr3.hasNext()) {
			Object valuesView = itr3.next();
			System.out.println(valuesView);
		}

	}

}
