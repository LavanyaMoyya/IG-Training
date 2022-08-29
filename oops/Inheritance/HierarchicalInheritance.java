package com.inheritance;

class Person3 {
	public void show() {
		System.out.println("I am a Person");
	}
}

class Student2 extends Person3 {
	public void show1() {
		System.out.println("I am a Student who is Person ");
	}
}

class Teacher extends Person3 {

	public void show2() {
		System.out.println("I am a Teacher who is a Person");
	}
}

class Doctor extends Person3 {

	public void show3() {
		System.out.println("I am a Doctor who is a Person");
	}
}

public class HierarchicalInheritance {
	public static void main(String args[]) {
		Teacher teacher = new Teacher();
		Student2 student = new Student2();
		Doctor doctor = new Doctor();
		teacher.show();
		student.show1();
		teacher.show2();
		doctor.show3();
	}
}