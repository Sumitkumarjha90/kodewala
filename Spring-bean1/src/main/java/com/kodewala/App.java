package com.kodewala;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.kodewala.emp.Student;
import com.kodewala.emp.Customer;
import com.kodewala.emp.Emp;
import com.kodewala.emp.Person;

public class App {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/kodewala/emp/empBean.xml");

		Emp emp1 = (Emp) context.getBean("emp");
		System.out.println(emp1);
		System.out.println(emp1.hashCode());
		// System.out.println("Hello World!");
		System.out.println("++++++++++++++++++++++++++++++++++++++++++++++");
		// ApplicationContext context1 = new
		// ClassPathXmlApplicationContext("empBean.xml");

		Student stud = (Student) context.getBean("student");
		System.out.println(stud);
		System.out.println(stud.hashCode());
		System.out.println("++++++++++++++++++++++++++++++++++++++++++++++");

		Person per = (Person) context.getBean("person");
		System.out.println(per);
		System.out.println(per.hashCode());

		System.out.println("++++++++++++++++++++++++++++++++++++++++++++++");
		
		Customer cus = (Customer)context.getBean("cus");
		System.out.println(cus);
		

	}
}
