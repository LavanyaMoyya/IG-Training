package com.singleton;

import java.lang.reflect.Constructor;

public class ReflectionAchieve {
	public static void main(String[] args) {
		EnumSingleton instanceOne = EnumSingleton.INSTANCE;
		EnumSingleton instanceTwo = null;
		try {
			Constructor[] constructors = EnumSingleton.class.getDeclaredConstructors();
			for (Constructor constructor : constructors) {
				constructor.setAccessible(true);
				instanceTwo = (EnumSingleton) constructor.newInstance();

			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("Hashcode of Object 1 - " + instanceOne.hashCode());
		System.out.println("Hashcode of Object 2 - " + instanceTwo.hashCode());
	}
}
