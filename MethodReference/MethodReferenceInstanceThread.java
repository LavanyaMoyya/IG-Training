package com.methodReference;

public class MethodReferenceInstanceThread {
	public void msg() {
		System.out.println("Hello, This is non-static method");
	}

	public static void main(String[] args) {
		Thread t = new Thread(new MethodReferenceInstanceThread()::msg);
		t.start();
	}
}
