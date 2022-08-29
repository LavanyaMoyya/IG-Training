package com.methodReference;

interface SayableI {
	void say();
}

public class MethodReferenceInstance {
	public void saySomething() {
		System.out.println("Hello,This is non-static Method");
	}

	public static void main(String[] args) {
		MethodReferenceInstance instance = new MethodReferenceInstance();
		SayableI sayable = instance::saySomething;
		sayable.say();

		SayableI sayable1 = new MethodReferenceInstance()::saySomething;
		sayable1.say();
	}
}
