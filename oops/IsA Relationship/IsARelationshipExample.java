package com.isA;

public class IsARelationshipExample {
public static void main(String[] aargs) {
	System.out.println("Honda Specific Implementation: ");
	System.out.println("*******************************");
	Honda h=new Honda();
	h.startHondaCar();
	System.out.println("Honda car has max speed: "+h.getMaxSpeed());
	System.out.println("Honda car Color: "+h.defaultColor());
	System.out.println("Honda car has No of gears: "+h.getNoOfGears());
	h.stopHondaCar();
	
	System.out.println("Maruti Specific Implementation: ");
	System.out.println("*******************************");
	Maruti m=new Maruti();
	m.startMarutiCar();;
	System.out.println("Maruti car has max speed: "+m.getMaxSpeed());
	System.out.println("Maruti car Color: "+m.defaultColor());
	System.out.println("Maruti car has No of gears: "+m.getNoOfGears());
	m.stopMarutiCar();
}
}
