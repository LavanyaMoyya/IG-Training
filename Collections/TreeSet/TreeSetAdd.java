package com.TreeSet;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetAdd {
	public static void main(String[] args) {
		Set<String> ts = new TreeSet<>();
		boolean empty = ts.isEmpty();
		System.out.println("Is TreeSet empty: " + empty);
		int size = ts.size();
		System.out.println("Size of TreeSet: " + size);
		ts.add("Lavanya");
		ts.add("Srikanth");
		ts.add("Bhuvi");
		ts.add("Khyathi");
		ts.add("Naresh");
		System.out.println("Sorted TreeSet: " + ts);
		int size2 = ts.size();
		System.out.println("Size of TreeSet after adding elements: " + size2);

	}
}
