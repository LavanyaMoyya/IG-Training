package com.function;

interface TestInterface {
	public void square(int a);

	default void show() {
		System.out.println("Default Method Executed");
	}
}

class DefaultMethod implements TestInterface {

	public void square(int a) {
		System.out.println(a * a);
	}

	public static void main(String args[]) {
		DefaultMethod d = new DefaultMethod();
		d.square(4);

		d.show();
	}
}
