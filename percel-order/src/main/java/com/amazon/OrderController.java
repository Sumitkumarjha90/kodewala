package com.amazon;

import org.springframework.stereotype.Controller;

@Controller
public class OrderController {
	
	public String orderId() {
		
		System.out.println("Order id ");
		return "order id";
	}
	
	
	

}
