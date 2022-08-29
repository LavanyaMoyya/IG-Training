package com.List;

import java.util.ArrayList;
import java.util.List;

public class ListGet {
public static void main(String[] args) {
	List<String> list1 = new ArrayList<String>();
	list1.add("Lavanya");
	list1.add("Srikanth");
	list1.add("Bhuvi");
	list1.add("Khyathi");
	list1.add("Naresh");
	list1.add("Mouli");
	list1.add("Ramya");
	System.out.println("List1 Contains: " + list1);
	
	System.out.println("First Element: "+list1.get(0));
	System.out.println("Sixth Element: "+list1.get(6));

}
}
