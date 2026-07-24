package com.kodewala.bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component

public class Person {
	
	@Value("Sumit")
	private String name;
	@Value("Bihar")
	private String address;
	
	
	public void displayPersonInfo() {
		
		System.out.println("Person [name=" + name + ", address=" + address + "]");
		
	}

}
