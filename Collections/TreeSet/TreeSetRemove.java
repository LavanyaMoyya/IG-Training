package com.TreeSet;

import java.util.TreeSet;

public class TreeSetRemove {
	public static void main(String[] args) {
		TreeSet<String> ts = new TreeSet<>();
		ts.add("Lavanya");
		ts.add("Srikanth");
		ts.add("Bhuvi");
		ts.add("Khyathi");
		ts.add("Naresh");
		boolean element = ts.contains("Khyathi");
		System.out.println("Is element exist: " + element);
		ts.remove("Naresh");
		System.out.println("Sorted tree set: " + ts);
		ts.clear();
		System.out.println("Elements in tree set: " + ts);
	}
}
