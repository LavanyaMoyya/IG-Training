package com.HashSet;

import java.util.HashSet;

public class EmployeeHashSetMain {
	public static void main(String[] args) {
		HashSet<EmployeeHashSet> employee = new HashSet<EmployeeHashSet>();
		employee.add(new EmployeeHashSet(52060184, "Lavanya", "Vijayawada"));
		employee.add(new EmployeeHashSet(52060185, "Srikanth", "Hyderabad"));
		employee.add(new EmployeeHashSet(52060186, "Bhuvi Chaitra", "Pune"));
		employee.add(new EmployeeHashSet(52060187, "Khyathi", "Banglore"));

		for (EmployeeHashSet e : employee) {
			System.out.println(e.getEmpid() + "," + e.getName() + "," + e.getCity());
		}

	}
}
