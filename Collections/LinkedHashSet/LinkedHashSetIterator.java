package com.linkedHashSet;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSetIterator {
	public static void main(String[] args) {
		LinkedHashSet<String> lhset = new LinkedHashSet<String>();
		lhset.add("Lavanya");
		lhset.add("Srikanth");
		lhset.add("Bhuvi");
		lhset.add("Khyathi");
		lhset.add("Naresh");
		System.out.println("Elements in Set: " + lhset);
		System.out.println("Iteration using iterator");
		Iterator<String> itr = lhset.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println();
		System.out.println("Iteration using enhanced for loop");
		for (String s : lhset)
			System.out.print(s + " ");
		System.out.println();
	}
}
