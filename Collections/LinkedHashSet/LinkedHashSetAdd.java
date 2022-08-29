package com.linkedHashSet;

import java.util.LinkedHashSet;

public class LinkedHashSetAdd {
	public static void main(String[] args) {
		LinkedHashSet<String> lhset = new LinkedHashSet<String>();
		int size = lhset.size();
		System.out.println("Size of LinkedHashSet before adding elements: " + size);
		lhset.add("Lavanya");
		lhset.add("Srikanth");
		lhset.add("Bhuvi");
		lhset.add("Khyathi");
		lhset.add("Naresh");
		lhset.add("Srikanth");
		lhset.add("Khyathi");
		lhset.add(null);
		lhset.add(null);
		System.out.println("Elements in Set: " + lhset);
		int size2 = lhset.size();
		System.out.println("Size of LinkedHashSet after adding elements: " + size2);
		LinkedHashSet<String> lhset2 = new LinkedHashSet<String>();
		lhset2.add("Mouli");
		lhset2.add("Ramya");
		lhset.addAll(lhset2);
		System.out.println("Elements in Set after adding: " + lhset);
	}
}
