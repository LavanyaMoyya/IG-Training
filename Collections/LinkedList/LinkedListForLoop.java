package com.linkedList;

import java.util.LinkedList;

public class LinkedListForLoop {
	public static void main(String[] rags) {
		LinkedList<String> list = new LinkedList<String>();

		list.add("Red");
		list.add("Yellow");
		list.add("Green");
		list.add("White");

		for (int i = 0; i < list.size(); i++) {
			Object element = list.get(i);
			System.out.println(element);
		}

		for (String str : list) {
			System.out.println(str);
		}

		int num = 0;
		while (list.size() > num) {
			System.out.println(list.get(num));
			num++;
		}
	}

}
