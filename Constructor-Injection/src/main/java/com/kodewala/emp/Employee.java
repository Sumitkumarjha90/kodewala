package com.kodewala.emp;

import com.kodewala.address.Address;

public class Employee {
	private String empName;
	private String empId;
	private Address address;
	public Employee(String empName, String empId, Address address) {
		super();
		this.empName = empName;
		this.empId = empId;
		this.address = address;
	}
	
	
	public void printInfo() {
		address.displayAddress();
	}

}
