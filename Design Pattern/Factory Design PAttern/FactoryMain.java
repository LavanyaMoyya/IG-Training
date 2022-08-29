package com.designpatterns;

import java.util.ArrayList;
import java.util.List;

public class FactoryMain {
	public static void main(String[] args) {
		List<Employee> empList = createEmpList();
		CommunicationFactory factory = new CommunicationFactory();
		Communication comm;
		for (Employee emp : empList) {
			 comm = factory.getProcess(emp.getModeOfContact());
			comm.process(emp);

		}

	}

	private static List<Employee> createEmpList() {
		List<Employee> empList = new ArrayList();
		Employee e1 = new Employee(1, "Lavanya", 28, "Vijayawada", "email", "lavanyamoyya3@gmail.com", "8096343303");
		Employee e2 = new Employee(2, "Srikanth", 30, "Hyderabad", "mobile", "srikanth.g@gmail.com", "8099249209");
		Employee e3 = new Employee(3, "Naresh", 31, "Banglore", "email", "naresh.goli@gmail.com", "8096146601");
		Employee e4 = new Employee(4, "Bhuvi Chaitra", 25, "Pune", "mobile", "bhuvi.chaitra@gmail.com", "9701463660");
		empList.add(e1);
		empList.add(e2);
		empList.add(e3);
		empList.add(e4);
		return empList;
	}
}
