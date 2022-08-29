//Rule2: Overridden method is not throwing an exception. 
//overriding method is throwing an unchecked exception. 
package com.polymorphism;

class Parent1 {
	void msg() {
		System.out.println("Parent class Method");
	}
}

class Child1 extends Parent {
	@Override
	void msg() throws ArithmeticException {
		System.out.println("Child class Method");
	}
}

public class OverridingException2 {
	public static void main(String[] args) {
		Parent1 p;
		p = new Parent1();
		p.msg();
		Child1 c= new Child1();
		c.msg();
	}
}

