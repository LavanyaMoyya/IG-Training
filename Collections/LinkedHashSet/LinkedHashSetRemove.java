package com.linkedHashSet;

import java.util.LinkedHashSet;

public class LinkedHashSetRemove {
	public static void main(String[] args) {
		LinkedHashSet<String> lhset = new LinkedHashSet<String>();
		lhset.add("Lavanya");
		lhset.add("Srikanth");
		lhset.add("Bhuvi");
		lhset.add("Khyathi");
		lhset.add("Naresh");
		System.out.println("Elements in Set: " + lhset);
		lhset.remove(null);
		System.out.println("Elements in set after removing: " + lhset);
		System.out.println(lhset.size() + " elements in set");
		LinkedHashSet<String> lhset2 = new LinkedHashSet<String>();
		lhset2.add("Mouli");
		lhset2.add(null);
		System.out.println("Elements in lhset2: " + lhset2);
		System.out.println(lhset2.size() + " elements in lhset2");
		lhset.addAll(lhset2);
		if (lhset.contains("Ramya")) {
			System.out.println("Element is exist");
		} else {
			System.out.println("Element doesn't exist");
		}
		lhset.removeAll(lhset2);
		System.out.println("Elements in set after removing lhset2: " + lhset);
		lhset.retainAll(lhset2);
		System.out.println("After removing common elements in lhset2 " + "from set, set is " + lhset);

	}
}
