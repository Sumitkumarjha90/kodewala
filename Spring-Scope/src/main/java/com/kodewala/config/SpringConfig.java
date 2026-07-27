package com.kodewala.config;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import com.kodewala.bean.Payment;

@Configuration
public class SpringConfig {
	
	@Bean("pay1")
	@Scope("prototype")
	public Payment payment() {
		Payment pay = new Payment();
		
		pay.setRefID("REF123");
		return pay;
		
	}
	
	@PostConstruct
	public void init() {
		System.out.println("1 Payment - init");
	}
	
	@PreDestroy
	public void destory() {
		System.out.println("last Payment - doing the clean-up before destroy ");
	}

}
