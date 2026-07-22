package com.kodewala.emp;

public class Emp {
	private String name;
	private String empId;
	private int salary;

	public String getName() {
		return name;
	}

	public int getSalary() {
		return salary;

	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public void displayEmpInfo() {
		System.out.println("Emp [name=" + name + ", empId=" + empId + ", salary=" + salary + "]");
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmpId() {
		return empId;
	}

	public void setEmpId(String empId) {
		this.empId = empId;
	}

	@Override
	public String toString() {
		return "Emp [name=" + name + ", empId=" + empId + ", salary=" + salary + "]";
	}

}
