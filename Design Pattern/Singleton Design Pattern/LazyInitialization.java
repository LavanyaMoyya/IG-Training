package com.singleton;

public class LazyInitialization {
	public static LazyInitialization instance;

	private LazyInitialization() {
	}

	private static LazyInitialization getInstance() {
		if (instance == null) {
			instance = new LazyInitialization();

		}
		return instance;
	}
}
