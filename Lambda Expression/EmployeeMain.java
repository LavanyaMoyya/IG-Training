package com.lambda;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.ArrayList;
import java.util.Collections;

public class EmployeeMain {
	public static void main(String[] args) {

		List<Employee> employees = new ArrayList<Employee>();
		employees.add(new Employee(10, "Srikanth", 30, 400000));
		employees.add(new Employee(20, "Lavanya", 29, 350000));
		employees.add(new Employee(30, "Bhuvi Chaitra", 59, 45000));
		employees.add(new Employee(40, "Khyathi", 60, 500000));

		/*
		 * List<Employee> employeesSortedList1 =
		 * employees.stream().sorted(Comparator.comparing(Employee::getName))
		 * .collect(Collectors.toList()); System.out.println(employeesSortedList1);
		 * List<Employee> employeesSortedList2 = employees.stream()
		 * .sorted(Comparator.comparing(Employee::getName).reversed()).collect(
		 * Collectors.toList()); System.out.println(employeesSortedList2);
		 * employees.stream().filter(emp -> emp.getSalary() > 50000 && emp.getAge() >
		 * 50).forEach(System.out::println);
		 */
		System.out.println("Original List :");
		for (Employee e : employees) {
			System.out.println(e.getId() + " : " + e.getName());
		}
		System.out.println("Sort Employee List using Lambda");
		Collections.sort(employees, (e1, e2) -> {
			return e1.getName().compareTo(e2.getName());
		});
		for (Employee e : employees) {
			System.out.println(e.getId() + " : " + e.getName());
		}
	}
}
