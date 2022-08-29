package com.abstraction;

abstract class Employee{
	private String name;
	private String email;
	private int empid;
	public Employee(String name, String email, int empid) {
		System.out.println("Constructing an Employee");
		this.name = name;
		this.email = email;
		this.empid = empid;
	}
	
	public double computePay() {
		System.out.println("Inside Employee computePay");
		return 0.0;
		
	}
	public void mailCheck() {
		System.out.println("Mailing a check to "+this.name+" "+this.email);
		
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", email=" + email + ", empid=" + empid + "]";
	}
	public String getName() {
		return name;
		
	}
	public String getEmail() {
		return email;
		
	}
	
	public void setEmail(String newEmail) {
		email=newEmail;
	}
	public int getEmpid() {
		return empid;
		
	}
}
 class Salary extends Employee{
	 private double salary;
	public Salary(String name, String email, int empid,double salary) {
		super(name, email, empid);
		setSalary(salary);
	}
	
	public void mailCheck() {
		System.out.println("Within mail check of Salary Class");
		System.out.println("Mailing check to "+ getName() + " With Salary:" + salary);
		
	}
	public double getSalary() {
		return salary;
		
	}

	private void setSalary(double newSalary) {
		if(newSalary>=0.0) {
			salary=newSalary;
		}
		
		}
	public double computePay() {
	      System.out.println("Computing salary pay for " + getName());
	      return salary/52;
	   }

	}

public class AbstractClassDemo {
	public static void main(String[] args) {
		/*Employee e=new Employee("Lavanya","lavanyamoyya3@gmail.com",52060184);
		e.mailCheck();*/
		System.out.println("Call mailCheck using Salary reference :");
		Salary s=new Salary("Lavanya","lavanyamoyya3@gmail.com",52060184,50000);
		s.mailCheck();
		System.out.println("Call mailCheck using Employee reference: ");
		Employee e= new Salary("Srikanth","g.srikanth68@gmail.com",52060185,60000);
		e.mailCheck();
	}

}
