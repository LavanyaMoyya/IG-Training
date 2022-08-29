//Rule-1: Overridden method is not throwing an exception. 
//overriding method is throwing a checked exception. 
package com.polymorphism;

import java.io.IOException;

class Parent {
	void msg() {
		System.out.println("Parent class Method");
	}
}

class Child extends Parent {
	@Override
	void msg() throws IOException {
		System.out.println("Child class Method");
	}
}

public class OverridingException1 {
	public static void main(String[] args) {
		Parent p;
		p = new Parent();
		p.msg();
		p = new Child();
		p.msg();
	}
}
