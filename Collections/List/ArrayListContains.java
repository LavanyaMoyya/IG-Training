package com.List;

import java.util.ArrayList;

public class ArrayListContains {
	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		al.add("Apple");
		al.add("Orange");
		al.add("Banana");
		al.add("Gauva");
		System.out.println(al);
		String fruitsName = (String) al.get(2);
		System.out.println(fruitsName);
		int numberOfElements = al.size();
		System.out.println(numberOfElements);
		boolean check = al.contains("Apple");
		System.out.println(check);
	}
}
