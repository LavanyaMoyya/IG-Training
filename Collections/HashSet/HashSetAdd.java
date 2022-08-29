package com.HashSet;

import java.util.HashSet;

public class HashSetAdd {
	public static void main(String[] args) {

		HashSet<String> set = new HashSet<String>();
		set.add("Lavanya");
		set.add("Srikanth");
		set.add("Bhuvi");
		set.add("Khyathi");
		set.add("Naresh");
		set.add("Srikanth");
		set.add("Khyathi");
		set.add(null);
		set.add(null);
		System.out.println("Unordered and No Duplicate HashSet Elements: " + set);

	}
}
