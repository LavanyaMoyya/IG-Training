package com.HashSet;

import java.util.HashSet;

public class HashSetAddAll {
	public static void main(String[] args) {

		HashSet<String> set = new HashSet<String>();
		set.add("Lavanya");
		set.add("Srikanth");
		set.add("Bhuvi");
		set.add("Khyathi");
		set.add("Naresh");
		set.add("Srikanth");
		set.add("Khyathi");
		HashSet<String> hset = new HashSet<String>();
		hset.addAll(set);
		System.out.println("Unordered HashSet Elements without Duplicate elements");
		System.out.println(hset);

	}
}