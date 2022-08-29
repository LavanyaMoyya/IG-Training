//Rule-1: If the abstract method in the interface throws certain exception. 
//The implemented method can throw the same exception
package com.exception;

import java.io.IOException;

abstract interface MyInterface {
	public abstract void display() throws IOException;
}

public class SameException implements MyInterface {

	@Override
	public void display() throws IOException {
		System.out.println("This is the implementation of subclass");

	}

	public static void main(String[] args) {
		try {
			new SameException().display();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
