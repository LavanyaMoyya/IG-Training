package com.methodReference;

public class MethodReferenceStaticThread {
	public static void ThreadStatus() {
		System.out.println("Thread is running");
	}

	public static void main(String[] args) {
		Thread t = new Thread(MethodReferenceStaticThread::ThreadStatus);
		t.start();
	}
}
