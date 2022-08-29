package com.singleton;

import java.lang.reflect.Constructor;

public class ReflectionDestroy {
	public static void main(String[] args) {
		LazyInitialization instanceOne = LazyInitialization.getInstance();
		LazyInitialization instanceTwo = null;
		try {
			Constructor[] constructors = LazyInitialization.class.getDeclaredConstructors();
			for (Constructor constructor : constructors) {
			constructor.setAccessible(true);
			instanceTwo = (LazyInitialization) constructor.newInstance();
			break;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("Hashcode of Object 1 - " + instanceOne.hashCode());
		System.out.println("Hashcode of Object 2 - " + instanceTwo.hashCode());
	}
}
