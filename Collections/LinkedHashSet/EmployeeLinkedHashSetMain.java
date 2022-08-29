package com.linkedHashSet;

import java.util.LinkedHashSet;

public class EmployeeLinkedHashSetMain {
	public static void main(String[] args) {
		LinkedHashSet<EmployeeLinkedHashSet> employee = new LinkedHashSet<EmployeeLinkedHashSet>();
		employee.add(new EmployeeLinkedHashSet(52060184, "Lavanya", "Vijayawada"));
		employee.add(new EmployeeLinkedHashSet(52060185, "Srikanth", "Hyderabad"));
		employee.add(new EmployeeLinkedHashSet(52060186, "Bhuvi Chaitra", "Pune"));
		employee.add(new EmployeeLinkedHashSet(52060187, "Khyathi", "Banglore"));

		for (EmployeeLinkedHashSet e : employee) {
			System.out.println(e.getEmpid() + "," + e.getName() + "," + e.getCity());
		}

	}
}
