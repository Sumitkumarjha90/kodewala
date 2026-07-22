package com.kodewala;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.kodewala.emp.Emp;

public class App {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/kodewala/emp/empBean.xml");

		Emp emp = (Emp) context.getBean("emp");
		System.out.println(emp);
		//System.out.println("Hello World!");
	}
}
