package com.hasA;

public class HasARelationshipExample {
public static void main(String[] args) {
	Engine engine=new Engine();
	System.out.println("Toyota Diesel Car Implementation:");
	System.out.println("*********************************");
	ToyotaDiesel td=new ToyotaDiesel();
	td.setEngine(engine);
	td.startEngine();
	
	System.out.println("Benz Automatic Car Implementation:");
	System.out.println("*********************************");
	BenzAutomatic ba=new BenzAutomatic();
	ba.setEngine(engine);
	ba.startEngine();
}
}
