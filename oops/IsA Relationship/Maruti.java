package com.isA;

public class Maruti extends Car {
	public void startMarutiCar() {
		setAvgSpeed(100);
		System.out.println("Started Maruti Car with Average Speed of: " + getAvgSpeed());
	}

	public int getMaxSpeed() {
		return 100;
	}

	public void stopMarutiCar() {
		System.out.println("Maruti car has Stopped");
	}
}
