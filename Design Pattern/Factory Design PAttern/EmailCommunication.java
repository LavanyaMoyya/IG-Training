package com.designpatterns;

public class EmailCommunication implements Communication {

	@Override
	public void process(Employee emp) {
	System.out.println(emp.getName()+" communicated via email: "+emp.getEmail());
		
	}

}
