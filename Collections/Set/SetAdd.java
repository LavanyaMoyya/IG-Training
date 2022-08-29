package com.set;

import java.util.HashSet;
import java.util.Set;


public class SetAdd {
	public static void main(String[] args) {
		Set<String> s = new HashSet<String>();
		int size = s.size();
		System.out.println("Size before adding the elements: " + size);
		s.add("Lavanya");
		s.add("Srikanth");
		s.add("Bhuvi");
		s.add("Khyathi");
		s.add("Naresh");
		s.add("Srikanth");
		s.add("Khyathi");
		System.out.println("Unordered list of set elements: " + s);
		if (s.equals("Aasha")) {
			System.out.println("Name is present in the set");
		} else {
			s.add("Aasha");
			System.out.println("Name added Successfully");
			System.out.println("Set elements after adding: " + s);
			Set<String> s1 = new HashSet<String>();
			s1.add("Mouli");
			s1.add("Sudheer");
			s1.add("Lavanya");
			s.addAll(s1);
			System.out.println("Set elemnts after adding elements from given collection: " + s);
		}
	}
}
