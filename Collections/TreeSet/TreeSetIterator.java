package com.TreeSet;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetIterator {
	public static void main(String[] args) {
		TreeSet<String> ts = new TreeSet<>();
		ts.add("Lavanya");
		ts.add("Srikanth");
		ts.add("Bhuvi");
		ts.add("Khyathi");
		ts.add("Naresh");
		System.out.println("Sorted TreeSet: " + ts);
		Iterator<String> itr = ts.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println("Iterating elements through Iterator in descending order");
		Iterator<String> itr1 = ts.descendingIterator();
		while (itr1.hasNext()) {
			System.out.println(itr1.next());
		}
	}
}
