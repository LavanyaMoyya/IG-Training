package com.hasA;

public class ManyToManyRelationship {
	public static void main(String[] args) {
		Person p1 = new Person();
		p1.setName("Lavanya");

		Person p2 = new Person();
		p2.setName("Srikanth");

		Address a1 = new Address();
		a1.setCity("Vijayawada");
		a1.setState("Andhra Pradesh");
		a1.setPincode(520011);

		Address a2 = new Address();
		a2.setCity("Hyderabad");
		a2.setState("Telangana");
		a2.setPincode(521403);

		System.out.println(
				p1.getName() + " lives at address " + a1.getCity() + "," + a1.getState() + "," + a1.getPincode()
						+ " but she has also address at " + a2.getCity() + "," + a2.getState() + "," + a2.getPincode());

		System.out.println(
				p2.getName() + " lives at address " + a2.getCity() + "," + a2.getState() + "," + a2.getPincode()
						+ " but he has also address at " + a1.getCity() + "," + a1.getState() + "," + a1.getPincode());

	}
}
