package com.designpatterns;

public class Employee {
	private int empid;
	private String name;
	private int age;
	private String city;
	private String modeOfContact;
	private String email;
	private String phoneNumber;
	public Employee(int empid, String name, int age, String city, String modeOfContact, String email,
			String phoneNumber) {
		super();
		this.empid = empid;
		this.name = name;
		this.age = age;
		this.city = city;
		this.modeOfContact = modeOfContact;
		this.email = email;
		this.phoneNumber = phoneNumber;
	}
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getModeOfContact() {
		return modeOfContact;
	}
	public void setModeOfContact(String modeOfContact) {
		this.modeOfContact = modeOfContact;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	


}
