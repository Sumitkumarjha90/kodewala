package com.kodewala.account.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.kodewala.account.bean.Account;
import com.kodewala.account.bean.Student;

@Configuration
public class SpringConfig {
	
	@Bean("acc1")
	public Account createdAccount() {
		Account account = new Account();
		account.setAaccountHolderName(" KodeWala ");
		account.setAccountNumber("8282828282");
		account.setIfscCode("SBIN12233");
		
		return account;
		
	}
	@Bean("Student")
	public Student createdStudent() {
		
		Student student = new Student();
		
		
		student.setCourse("Java");
		student.setName("Sumit");
		student.setRollNumber("ABC123");
		
		return student;
		
	}

}
