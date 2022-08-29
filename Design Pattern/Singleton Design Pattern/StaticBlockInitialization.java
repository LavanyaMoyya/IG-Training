package com.singleton;

public class StaticBlockInitialization {
	public static StaticBlockInitialization instance;

	private StaticBlockInitialization() {
	}

	static {
		try {
			instance = new StaticBlockInitialization();
		} catch (Exception e) {
			try {
				throw new Exception("Exception occured in creating singleton instance");
			} catch (Exception e1) {

				e1.printStackTrace();
			}
		}
	}

	public static StaticBlockInitialization getInstance() {
		return instance;
	}
}
