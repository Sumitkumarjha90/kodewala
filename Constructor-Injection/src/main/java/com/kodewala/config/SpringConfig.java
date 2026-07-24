package com.kodewala.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.kodewala.address.Address;
import com.kodewala.emp.Employee;

@Configuration
public class SpringConfig {
	@Bean("add")
	public Address address() {
		
		Address address = new Address("28th march","17th cross","BLR","Karnataka");
		
		return address;
		
		
	}
	
	@Bean("emp")
	public Employee emp(Address address) {
		
		Employee emp =new Employee("sumit","s123",address);
		
		return emp;
		
	}

}
