package com.kodewala.account.bean;

public class Student {
	
	private String name;
	private String course;
	private String rollNumber;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	public String getRollNumber() {
		return rollNumber;
	}
	public void setRollNumber(String rollNumber) {
		this.rollNumber = rollNumber;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", course=" + course + ", rollNumber=" + rollNumber + "]";
	}
	
	public void displayStudentInfo() {
		System.out.println("Student [name=" + name + ", course=" + course + ", rollNumber=" + rollNumber + "]");
	}
	

}
