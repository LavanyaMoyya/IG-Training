//Rule2: Overridden method is throwing checked exception. 
//overriding method is throwing the same subclass exception or no exception 
//but cannot declare parent exception 
package com.polymorphism;

class Parent3 {
	void msg() throws ArithmeticException {
		System.out.println("Parent class Method");
	}
}

class Child3 extends Parent {
	@Override
	void msg() throws Exception {
		System.out.println("Child class Method");
	}
}

public class OverridingException4 {
	public static void main(String[] args) throws Exception {
		Parent3 p;
		p = new Parent3();
		p.msg();
		Child3 c= new Child3();
		c.msg();
	}
}

