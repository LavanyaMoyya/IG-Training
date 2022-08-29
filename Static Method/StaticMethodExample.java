package com.staticmethod;

interface GreetInterface {
	static void wish(String user) {
		System.out.println("Hello " + user + "!");
	}
}

public class StaticMethodExample implements GreetInterface {

	public static void main(String[] args) {

		StaticMethodExample smt = new StaticMethodExample();
		// smt.wish("Peter");
		// StaticMethodExample.wish("Lavanya");
		GreetInterface.wish("Lavanya");
	}
}
