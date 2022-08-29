package com.lambda;

interface Sayable {
	public String say(String name);
}

public class LambdaSingle {
	public static void main(String[] args) {
		Sayable s1 = (name) -> {
			return "Hello, " + name;
		};
		System.out.println(s1.say("Bhuvi"));

		Sayable s2 = name -> {
			return "Hello, " + name;
		};
		System.out.println(s2.say("Bhuvi"));
	}
}
