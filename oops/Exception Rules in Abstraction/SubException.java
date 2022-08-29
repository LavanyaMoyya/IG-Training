//Rule-3: If the abstract method in the interface throws certain exception. 
//The implemented method can throw its subtype
package com.exception;

import java.io.IOException;

abstract interface MyInterface2 {
	public abstract void display() throws Exception;
}

public class SubException implements MyInterface2 {

	@Override
	public void display() throws IOException {
		System.out.println("This is the subclass implementation which throws child of Exception");
	}

	public static void main(String[] args) {
		try {
			new SubException().display();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
