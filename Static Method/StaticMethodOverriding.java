package com.staticmethod;

interface GreetInterface1 {

	static void wish(String user) {

		System.out.println("Hello " + user + "!");
	}
}

public class StaticMethodOverriding implements GreetInterface1 {

	static void wish(String user) {

		System.out.println("Welcome " + user + "!");
	}

	public static void main(String[] args) {

		StaticMethodOverriding smt = new StaticMethodOverriding();
		smt.wish("Lavanya");

		GreetInterface1 gi = new StaticMethodOverriding();
		// gi.wish("Peter");
		GreetInterface.wish("Lavanya");
	}
}
