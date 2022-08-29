package com.hasA;

public class OneToOneRelationship {
	public static void main(String[] args) {
		Person p1 = new Person();
		p1.setName("Lavanya");
		Passport pn1 = new Passport();
		pn1.setPassportno(12345);

		Person p2 = new Person();
		p2.setName("Srikanth");
		Passport pn2 = new Passport();
		pn2.setPassportno(67890);

		System.out.println(p1.getName() + " has a US Passport whose Passport Number is: " + pn1.getPassportno());
		System.out.println(p2.getName() + " has a Germany Passport whose Passport Number is: " + pn2.getPassportno());
	}
}
