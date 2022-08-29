package com.singleton;

public class BillPughSingleton {
	private BillPughSingleton() {
	}

	private static class SingletonHelper {
		private static BillPughSingleton instance = new BillPughSingleton();
	}

	private static BillPughSingleton getInstance() {
		return SingletonHelper.instance;
	}
}
