package com.linkedList;

import java.util.LinkedList;

public class LinkedListStack {
	public static void main(String[] args) {
		LinkedList<Character> list = new LinkedList<Character>();
		list.add('A');
		list.add('B');
		list.add('C');
		list.add('D');
		list.add('E');

		System.out.println("Original LinkedList :");
		System.out.println(list);
		Object element = list.pop();

		System.out.println("Pops Element: " + element);
		list.push('B');
		System.out.println("LinkedList Element after pushing");
		System.out.println(list);
	}
}
