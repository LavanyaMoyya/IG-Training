package com.hasA;

public class BenzAutomatic {
	public Engine engine;

	public Engine getEngine() {
		return engine;
	}

	public void setEngine(Engine engine) {
		this.engine = engine;
	}

	public BenzAutomatic() {
		System.out.println("Benz Automatic car has Constructed");
	}

	public void startEngine() {
		engine.startWithAutomaticEngine();
	}
}
