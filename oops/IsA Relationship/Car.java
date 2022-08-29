package com.isA;

public class Car {
	int avgSpeed;
	int currentSpeed;

	public int getAvgSpeed() {
		return avgSpeed;
	}

	public void setAvgSpeed(int avgSpeed) {
		this.avgSpeed = avgSpeed;
	}

	public int getCurrentSpeed() {
		return currentSpeed;
	}

	public void setCurrentSpeed(int currentSpeed) {
		this.currentSpeed = currentSpeed;
	}

	public int getNoOfGears() {
		return 6;
	}

	public String defaultColor() {
		return "Blue";
	}
}
