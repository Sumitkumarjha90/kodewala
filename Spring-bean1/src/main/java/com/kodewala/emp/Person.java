package com.kodewala.emp;

public class Person {
	
	private String personName;
	private String address;
	public String getPersonName() {
		return personName;
	}
	public void setPersonName(String personName) {
		this.personName = personName;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "Person [personName=" + personName + ", address=" + address + "]";
	}
	
	

}
