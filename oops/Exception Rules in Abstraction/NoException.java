//Rule-2: If the abstract method in the interface throws certain exception. 
//The implemented method can choose not to throw any exception
package com.exception;

import java.io.IOException;

abstract interface MyInterface1 {
	public abstract void display() throws IOException;
}

public class NoException implements MyInterface {

	@Override
	public void display() {
		System.out.println("This is the implementation of Subclass without thowing any Exception");

	}

	public static void main(String[] args) {
		try {
			new NoException().display();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
