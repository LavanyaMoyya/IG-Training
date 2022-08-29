package com.set;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SetDuplicate {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		int size = list.size();
		System.out.println("Size before adding elements: " + size);
		list.add(5);
		list.add(10);
		list.add(5);
		list.add(15);
		list.add(20);
		list.add(10);
		list.add(20);
		list.add(30);
		System.out.println("Original order of List Elements: " + list);
		Set<Integer> set = new HashSet<>(list);
		System.out.println("Unodered List Elements after removing duplicates: " + set);

	}
}
