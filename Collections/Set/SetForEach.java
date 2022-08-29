package com.set;

import java.util.HashSet;
import java.util.Set;

public class SetForEach {
	public static void main(String[] args) {
		Set<String> s = new HashSet<String>();
		int size = s.size();
		System.out.println("Size before adding the elements: " + size);
		s.add("Lavanya");
		s.add("Srikanth");
		s.add("Bhuvi");
		s.add("Khyathi");
		s.add("Naresh");
		System.out.println("Iterating using foreach loop");
		s.forEach(System.out::println);
	}
}
