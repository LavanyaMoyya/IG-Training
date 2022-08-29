package com.linkedList;

import java.util.ArrayList;
import java.util.LinkedList;

public class LinkedListRemove {
	public static void main(String[] args) {
		LinkedList<String> list = new LinkedList<String>();
		int size = list.size();
		System.out.println("Size of Linkedlist: " + size);
		list.add("Zero");
		list.add("First");
		list.add("Second");
		list.add(null);
		list.add("Fourth");
		list.add("25");
		System.out.println("Initial LinkedList order: " + list);

		list.removeFirst();
		System.out.println("LinkedList Elements after removing the first element");
		System.out.println(list);

		System.out.println("LinkedList Elements after removing the last element");
		list.removeLast();
		System.out.println(list);

		list.remove(2);
		System.out.println("LinkedList Elements after removing the element at index position 2 ");
		System.out.println(list);

		ArrayList<String> al = new ArrayList<String>();
		al.add("Third");
		al.add("Fourth");

		list.addAll(2, al);
		list.removeLastOccurrence("Fourth");

		System.out.println("LinkedList Elements after removing last occurrence");
		System.out.println(list);
	}
}
