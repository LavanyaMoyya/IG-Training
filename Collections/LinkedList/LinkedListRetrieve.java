package com.linkedList;

import java.util.LinkedList;

public class LinkedListRetrieve {
	public static void main(String[] args) {
		LinkedList<String> list = new LinkedList<String>();

		list.add("INDIA");
		list.add("USA");
		list.add("JAPAN");
		list.add("UK");
		list.add("CANADA");
		System.out.println("Initial LinkedList order");
		System.out.println(list);

		Object firstElement = list.peekFirst();
		System.out.println("Retrieve the first element: " + firstElement);
		Object lastElement = list.peekLast();
		System.out.println("Retrieve the last element: " + lastElement);

		Object element2 = list.pollFirst();
		System.out.println("Retrieve and remove the First element: " + element2);
		Object element1 = list.pollLast();
		System.out.println("Retrieve and remove the last element: " + element1);
		System.out.println("LinkedList Element after using pollLast() method");
		System.out.println(list);
	}

}
