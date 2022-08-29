package com.singleton;

public class EagerInitializationSingleton {
	public static final EagerInitializationSingleton instance = new EagerInitializationSingleton();

	private EagerInitializationSingleton() {
	}

	public static EagerInitializationSingleton getInstance() {
		return instance;
	}
}
