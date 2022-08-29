package com.set;

import java.util.HashSet;
import java.util.Set;

public class SetSearch {
	public static void main(String[] args) {
		Set<String> s = new HashSet<String>();
		s.add("Lavanya");
		s.add("Srikanth");
		s.add("Bhuvi");
		s.add("Khyathi");
		s.add("Naresh");
		s.add(null);
		System.out.println("unordered set elements: " + s);
		boolean search = s.contains("Bhuvi");
		System.out.println(search);
		if (s.contains("Srikanth")) {
			System.out.println("Element is present in set");
		} else {
			System.out.println("Element is not present in set");
		}
		int hashcode = s.hashCode();
		System.out.println("Hashcode: " + hashcode);
	}
}
