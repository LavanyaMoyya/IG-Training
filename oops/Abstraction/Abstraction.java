package com.abstraction;

abstract class Identity {
	abstract void getName(String name);

	abstract void getGender(String gender);

	abstract void getCity(String city);
}

class Person extends Identity {
	void getName(String name) {
		System.out.println("Name : " + name);
	}

	void getGender(String gender) {
		System.out.println("Gender : " + gender);
	}

	void getCity(String city) {
		System.out.println("City: " + city);
	}

	// Newly added method in subclass.
	void getCountry(String country) {
		System.out.println("Country: " + country);
	}
}

public class Abstraction {
	public static void main(String[] args) {
		Identity i = new Person();
		i.getName("Lavanya");
		i.getGender("Female");
		i.getCity("Vijayawada");
		 // i.getCountry("INDIA"); // Compile-time error because we cannot access newly added method in subclass using superclass reference.
		Person p=new Person();
		p.getCountry("India");
	}
}
