package com.List;

import java.util.ArrayList;
import java.util.List;

public class ListAdd {
	public static void main(String[] args) {

		List al = new ArrayList();
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		al.add("Shubh");
		al.add(4, 35);
		al.add(5, 45);

		System.out.println("Elements after adding: " + al);
	}
}
