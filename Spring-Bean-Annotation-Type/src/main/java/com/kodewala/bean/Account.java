package com.kodewala.bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Account {
	@Value("sumit")
	private String accountHolderName;
	@Value("28228282822")
	private String accountNumber;
	@Value("SBIN12282")
	private String ifscCode;

	public void displayAccountInfo() {
		System.out.println("Account [accountHolderName=" + accountHolderName + ", accountNumber=" + accountNumber
				+ ", ifscCode=" + ifscCode + "]");
	}

}
