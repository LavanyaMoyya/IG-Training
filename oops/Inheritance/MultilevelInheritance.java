package com.inheritance;

class Person1
{
	int id = 52060184;
	String name = "Lavanya";
	int age = 27;
	String city = "Vijayawada";
  public void show()
  {
    System.out.println("Student inheriting properties from Person");
  }
}
class Student1 extends Person1
{
	int marks=90;
  public void show1()
  {
      System.out.println("I am a Student who belongs to Person class");
  }
}

class EngineeringStudent extends Student1
{
 String status="pass";
  public void show2()
  {
    System.out.println("Engineering Student inheriting properties from Student");
  }
}
public class MultilevelInheritance
{
  public static void main(String args[])
  {
    EngineeringStudent es = new EngineeringStudent();
    es.show();
    es.show1();
    es.show2();
    System.out.println("Id of the Student is:" + es.id);
	System.out.println("Name of the Student is:" + es.name);
	System.out.println("Age of the Student is:" + es.age);  
	System.out.println("City of the Student is:" + es.city);
	System.out.println("Marks of the Student is:" + es.marks);
  }
}