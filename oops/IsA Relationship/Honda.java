package com.isA;

public class Honda extends Car {
	public void startHondaCar() {
		setAvgSpeed(70);
		System.out.println("Started Honda Car with Average Speed of: " + getAvgSpeed());
	}

	public int getMaxSpeed() {
		return 120;
	}

	public void stopHondaCar() {
		System.out.println("Honda car has Stopped");
	}

}
