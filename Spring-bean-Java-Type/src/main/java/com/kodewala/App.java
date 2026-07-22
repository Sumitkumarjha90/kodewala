package com.kodewala;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.kodewala.account.bean.Account;
import com.kodewala.account.bean.Student;
import com.kodewala.account.config.SpringConfig;

public class App {
	public static void main(String[] args) {

		ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);

		Account account = (Account) context.getBean("acc1");

		account.displayAccountInfo();
		// System.out.println( "Hello World!" );

		ApplicationContext context1 = new AnnotationConfigApplicationContext(SpringConfig.class);

		Student account1 = (Student) context.getBean("Student");
		
		
		account1.displayStudentInfo();
	}
}
