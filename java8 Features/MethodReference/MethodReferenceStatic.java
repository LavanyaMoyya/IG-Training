package com.methodReference;

interface Sayable {
	void say();
}

public class MethodReferenceStatic {
	public static void saySomething() {
		System.out.println("Hello, This is Static Method Reference");

	}

	public static void main(String[] args) {
		Sayable sayable = MethodReferenceStatic::saySomething;
		sayable.say();
	}
}
