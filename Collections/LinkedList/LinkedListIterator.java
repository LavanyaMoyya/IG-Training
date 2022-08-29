package com.linkedList;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListIterator {
	public static void main(String[] args) {
		LinkedList<Character> list = new LinkedList<Character>();

		list.add('A');
		list.add('B');
		list.add('C');
		list.add('D');
		list.add('E');

		Iterator<Character> itr = list.iterator();
		while (itr.hasNext()) {
			Object obj = itr.next();
			System.out.println(obj);
		}
	}

}
