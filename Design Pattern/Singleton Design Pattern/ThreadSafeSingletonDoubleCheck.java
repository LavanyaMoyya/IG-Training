package com.singleton;

public class ThreadSafeSingletonDoubleCheck {
	public static ThreadSafeSingletonDoubleCheck instance;

	private ThreadSafeSingletonDoubleCheck() {
	}

	private static ThreadSafeSingletonDoubleCheck getInstanceUsingDoubleLocking() {
		if (instance == null) {
			synchronized (ThreadSafeSingletonDoubleCheck.class) {
				if (instance == null) {
					return new ThreadSafeSingletonDoubleCheck();
				}
			}
		}
		return instance;
	}
}
