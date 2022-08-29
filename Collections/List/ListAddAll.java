package com.List;

import java.util.ArrayList;
import java.util.List;

public class ListAddAll {
	public static void main(String[] args) {
		List<String> list1 = new ArrayList<String>();
		list1.add("Lavanya");
		list1.add("Srikanth");
		list1.add("Bhuvi");
		list1.add("Khyathi");
		list1.add("Naresh");
		System.out.println("List1 Contains: " + list1);

		List<String> list2 = new ArrayList<String>();
		list2.add("Mouli");
		list2.add("Ramya");
		System.out.println("List2 Contains: " + list2);
		list1.addAll(list2);
		System.out.println("New List: " + list1);
	}
}
