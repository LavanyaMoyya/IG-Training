package com.inheritance;

class Person {
	int id = 52060184;
	String name = "Lavanya";
	int age = 27;
	String city = "Vijayawada";

	public void show() {
		System.out.println("Child class aquiring the properties from Parent Class:");
	}
}

class Student extends Person {
	int marks=90;

	public static void main(String[] args) {
		Student s = new Student();
		s.show();
		System.out.println("Id of the Student is:" + s.id);
		System.out.println("Name of the Student is:" + s.name);
		System.out.println("Age of the Student is:" + s.age);
		System.out.println("City of the Student is:" + s.city);
		System.out.println("Marks of the Student is:" + s.marks);
       
	}
}
