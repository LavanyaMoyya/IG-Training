package com.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetIterator {
	public static void main(String[] args) {
		Set<String> s = new HashSet<String>();

		int size = s.size();
		System.out.println("Size before adding the elements: " + size);
		s.add("Lavanya");
		s.add("Srikanth");
		s.add("Bhuvi");
		s.add("Khyathi");
		s.add("Naresh");
		System.out.println("Unordered list of set elements: " + s);
		Iterator<String> itr = s.iterator();
		System.out.println("Iteration using iterator method");
		while (itr.hasNext()) {
			Object str = itr.next();
			System.out.println(str);
		}

	}
}