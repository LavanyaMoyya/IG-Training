package com.HashSet;

import java.util.HashSet;

public class HashSetContains {
	public static void main(String[] args) {
		HashSet<String> set = new HashSet<String>();
		System.out.println("Is set empty? : " + set.isEmpty());
		System.out.println("Number of elements in HashSet before adding: " + set.size());
		set.add("Lavanya");
		set.add("Srikanth");
		set.add("Bhuvi");
		set.add("Khyathi");
		set.add("Naresh");

		System.out.println("Number of names in HashSet after adding: " + set.size());
		if (set.contains("Mouli")) {
			System.out.println("Element was exist in the HashSet");
		} else {
			System.out.println("Element was not exist in the Hashset");
		}

		if (set.contains("Naresh")) {
			System.out.println("Element was exist in the HashSet");
		} else {
			System.out.println("Element was not exist in the Hashset");
		}
	}
}
