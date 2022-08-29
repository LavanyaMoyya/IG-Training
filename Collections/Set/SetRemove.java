package com.set;

import java.util.HashSet;
import java.util.Set;

public class SetRemove {
	public static void main(String[] args) {
		Set<String> s = new HashSet<String>();
		boolean check = s.isEmpty();
		System.out.println("Is Set Empty: " + check);
		s.add("Lavanya");
		s.add("Srikanth");
		s.add("Bhuvi");
		s.add("Khyathi");
		s.add("Naresh");
		if (s.isEmpty()) {
			System.out.println("Set is Empty");
		} else {
			System.out.println("Set is not empty.");
			System.out.println("Elements in the Set");
			System.out.println(s);
			s.remove("Naresh");
			System.out.println("Set elements after removing:");
			System.out.println(s);
		}

	}
}
