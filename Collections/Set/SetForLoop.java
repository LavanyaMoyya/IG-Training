package com.set;

import java.util.HashSet;
import java.util.Set;

public class SetForLoop {
	public static void main(String[] args) {
		Set<Integer> set = new HashSet<Integer>();
		for (int i = 10; i <= 30; i++) {
			if (i % 2 == 0) {
				set.add(i);

			}
		}
		System.out.println("Even numbers between 10 to 30: " + set);
		System.out.println("Iteration using enhanced for loop");
		for (Integer it : set) {
			System.out.println(it);
		}
	}
}
