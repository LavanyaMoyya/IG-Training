package com.TreeSet;

import java.util.HashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class TreeSetMethods {
	public static void main(String[] args) {
		Set<String> s = new HashSet<>();
		s.add("Lavanya");
		s.add("Srikanth");
		s.add("Bhuvi");
		s.add("Khyathi");
		s.add("Naresh");

		TreeSet<String> ts = new TreeSet<>(s);
		System.out.println("Sorted TreeSet: " + ts);

		System.out.println("First Element: " + ts.first());
		System.out.println("Last Element: " + ts.last());
		System.out.println("HeadSet Elements: " + ts.headSet("Khyathi"));
		System.out.println("TailSet Elements: " + ts.tailSet("Khyathi"));

		SortedSet<String> subSet = ts.subSet("Lavanya", "Naresh");
		System.out.println("SubSet Elements: " + subSet);
		System.out.println("Sorted Set: " + ts.comparator());

	}
}
