package com.linkedHashSet;

public class EmployeeLinkedHashSet {
	private Integer empid;
	private String name;
	private String city;
	public EmployeeLinkedHashSet(Integer empid, String name, String city) {
		super();
		this.empid = empid;
		this.name = name;
		this.city = city;
	}
	public Integer getEmpid() {
		return empid;
	}
	public void setEmpid(Integer empid) {
		this.empid = empid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	
	
}
