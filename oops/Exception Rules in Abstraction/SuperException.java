//Rule-4:If the abstract method in the interface throws certain exception. 
//The implemented method should not throw its super type
package com.exception;

import java.io.IOException;

abstract interface MyInterface4 {
	public abstract void display() throws IOException;
}

public class SuperException implements MyInterface4 {

	@Override
	public void display() throws Exception {
		System.out.println("This is the subclass implementation which throws SuperException");

	}

	public static void main(String[] args) {
		try {
			new SuperException().display();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}