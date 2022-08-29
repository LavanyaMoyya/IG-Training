package com.designpatterns;

abstract class Vehicle {
	abstract int getWheel();

	@Override
	public String toString() {
		return "Wheel: " + this.getWheel();
	}

}

class car extends Vehicle {
	int wheel;

	public car(int wheel) {
		this.wheel = wheel;
	}

	@Override
	int getWheel() {
		return this.wheel;
	}

}

class Bike extends Vehicle {
	int wheel;

	public Bike(int wheel) {
		this.wheel = wheel;
	}

	@Override
	int getWheel() {
		return this.wheel;
	}

}

class VehicleFactory {
	public static Vehicle getInstance(String type, int wheel) {
		if (type == "car") {
			return new car(wheel);
		} else if (type == "Bike") {

			return new Bike(wheel);
		}
		return null;
	}
}

public class FactoryDesignPatternExample {
	public static void main(String[] args) {
		Vehicle car = VehicleFactory.getInstance("car", 4);
		System.out.println(car);
		Vehicle bike = VehicleFactory.getInstance("Bike", 2);
		System.out.println(bike);

	}
}
