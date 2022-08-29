package com.HashSet;

import java.util.HashSet;

public class HashSetEmpty {
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
	}
}
