package com.List;

import java.util.ArrayList;

public class ArrayListAddAll {
	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		al.add("A");
		al.add("B");
		al.add(20);
		al.add("A");
		al.add(null);
		System.out.println(al);

		ArrayList al1 = new ArrayList();
		al1.add("a");
		al1.add("b");
		al1.add("c");
		System.out.println(al1);
		al.addAll(al1);
		System.out.println(al);

	}
}
