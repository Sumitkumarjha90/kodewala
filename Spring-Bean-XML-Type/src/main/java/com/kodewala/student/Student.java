package com.kodewala.student;

public class Student {
	
	
	private String name;
	private String id;
	private String course;
	
	
	public void displayStudentInfo() {
		
		//System.out.println("this will work and display the student info ");
		
		System.out.println("[name=" + name + ", id=" + id + ", course=" + course + "]");
		
	}


	@Override
	public String toString() {
		return "Student [name=" + name + ", id=" + id + ", course=" + course + "]";
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getId() {
		return id;
	}


	public void setId(String id) {
		this.id = id;
	}


	public String getCourse() {
		return course;
	}


	public void setCourse(String course) {
		this.course = course;
	}

}
