package com.linkedList;

import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListListIterator {
public static void main(String[] args) {
	 LinkedList<Integer> list = new LinkedList<Integer>(); 
	    list.add(10); 
	    list.add(20); 
	    list.add(30); 
	    list.add(40); 
	    list.add(50); 
	  
	System.out.println("LinkedList original order"); 
	System.out.println(list); 
	 
	ListIterator<Integer> litr = list.listIterator(); 
	System.out.println("Interating in forward direction"); 
	 while(litr.hasNext())
	 { 
	   Object obj = litr.next(); 
	   System.out.println(obj); 
	  } 
	  System.out.println("Iterating in backwrd direction"); 
	  while(litr.hasPrevious())
	  { 
	    Object obj1 = litr.previous(); 
	    System.out.println(obj1); 
	     list.add(60); 
	   } 
	  System.out.println(list); 
	 } 
	 
}
