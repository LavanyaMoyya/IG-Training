package com.HashSet;

import java.util.HashSet;

public class HashSetRemove {
	public static void main(String[] args) {
		HashSet<String> set = new HashSet<String>();
		set.add("Lavanya");
		set.add("Srikanth");
		set.add("Bhuvi");
		set.add("Khyathi");
		set.add("Naresh");
		set.add("Srikanth");
		set.add("Khyathi");
		System.out.println("Elements are: " + set);
		set.remove("Bhuvi");
		System.out.println("List of elements after removing: " + set);
		HashSet<String> hset = new HashSet<String>();
		hset.add("Mouli");
		hset.add("Ramya");
		set.addAll(hset);
		System.out.println("List of Elements after adding elements from existing collection: " + set);
		set.removeAll(hset);
		System.out.println("List of Elements after removing elements from hset: " + set);
		set.clear();
		System.out.println("After invoking clear() method: " + set);

	}
}
