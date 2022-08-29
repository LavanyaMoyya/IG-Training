//Rule2: Overridden method is throwing an unchecked exception. 
//overriding method is throwing an unchecked exception. 
package com.polymorphism;

class Parent2 {
	void msg() throws ArithmeticException {
		System.out.println("Parent class Method");
	}
}

class Child2 extends Parent {
	@Override
	void msg() throws ClassCastException {
		System.out.println("Child class Method");
	}
}

public class OverridingException3 {
	public static void main(String[] args) {
		Parent2 p;
		p = new Parent2();
		p.msg();
		Child2 c= new Child2();
		c.msg();
	}
}

