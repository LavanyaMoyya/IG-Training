package com.linkedList;

import java.util.LinkedList;

public class LinkedListGet {
	public static void main(String[] args) {
		LinkedList<Integer> list = new LinkedList<Integer>();
		for (int i = 0; i <= 20; i++) {
			if (i % 2 == 0)
				list.add(i);
		}

		Object firstEvenNumber = list.getFirst();
		System.out.println("First even number: " + firstEvenNumber);

		Object lastEvenNumber = list.getLast();
		System.out.println("Last even number: " + lastEvenNumber);
		Object getElement = list.get(5);
		System.out.println("Even number at index 5: " + getElement);
	}
}
