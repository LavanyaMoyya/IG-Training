package com.linkedList;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Vector;

public class LinkedListAdd {
	public static void main(String[] args) {
		LinkedList list = new LinkedList(); // empty linked list.

		list.add("One");
		list.add(2);
		list.add(null);
		list.add("Four");
		System.out.println("Initial LinkedList order: " + list);
		list.add(3, "Three");

		System.out.println("LinkedList Elements after adding the first element");
		list.addFirst("Zero");
		System.out.println(list);

		System.out.println("LinkedList Elements after adding the last element");
		list.addLast("Five");
		System.out.println(list);

		ArrayList al = new ArrayList();
		al.add("Six");
		al.add(7);
		al.add("Eight");
		list.addAll(al);
		System.out.println("LinkedList Elements after adding all elements from ArrayList");
		System.out.println(list);
		
	}
}
