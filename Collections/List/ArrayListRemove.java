package com.List;

import java.util.ArrayList;

public class ArrayListRemove {
	public static void main(String[] args) {

		ArrayList<String> al = new ArrayList<String>();
		al.add("A");
		al.add("B");
		al.add("C");
		al.add("D");
		al.add(null);
		al.add("D");
		System.out.println(al);

		al.remove("D");
		System.out.println(al);
		al.remove(3);
		System.out.println(al);
		al.set(3, null);
		System.out.println(al);
	}
}
