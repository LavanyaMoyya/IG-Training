package com.List;

import java.util.ArrayList;


public class EmployeeMain {
	public static void main(String[] args) {
		ArrayList<Employee> list = new ArrayList<>();
		list.add(new Employee(52060184, "Lavanya", "Vijayawada"));
		list.add(new Employee(52060185, "Srikanth", "Hyderabad"));
		list.add(new Employee(52060186, "Bhuvi Chaitra", "Pune"));
		list.add(new Employee(52060187, "Khyathi", "Banglore"));
		for (Employee e : list) {
			System.out.println(e.getEmpid() + "," + e.getName() + "," + e.getCity());
		}
	}
}
