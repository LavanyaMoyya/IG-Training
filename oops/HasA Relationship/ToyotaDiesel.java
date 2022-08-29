package com.hasA;

public class ToyotaDiesel {
	public Engine engine;

	public Engine getEngine() {
		return engine;
	}

	public void setEngine(Engine engine) {
		this.engine = engine;
	}

	public ToyotaDiesel() {
		System.out.println("Toyota diesel Car has Constructed");
	}

	public void startEngine() {
		engine.startWithDieselEngine();
	}
}
