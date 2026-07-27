package com.kodewala;

//import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.kodewala.bean.Payment;
import com.kodewala.config.SpringConfig;

public class App {
	public static void main(String[] args) {

		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);

		Payment pay1 = (Payment) context.getBean("pay1");
		
		Payment pay2 = (Payment) context.getBean("pay1");
		pay1.paymentInfo();
		
		//System.out.println(pay1 == pay2);
		
		context.close();
	}
}
