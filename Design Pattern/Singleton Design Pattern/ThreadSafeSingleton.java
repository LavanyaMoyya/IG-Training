package com.singleton;

public class ThreadSafeSingleton {
	public static ThreadSafeSingleton instance;

	private ThreadSafeSingleton() {
	}

	private static synchronized ThreadSafeSingleton getInstance() {
		if (instance == null) {
			instance = new ThreadSafeSingleton();
		}
		return instance;
	}
}
