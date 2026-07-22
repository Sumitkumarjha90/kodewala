package com.kodewala.account.bean;

public class Account {

	private String aaccountHolderName;
	private String ifscCode;
	private String accountNumber;

	public String getAaccountHolderName() {
		return aaccountHolderName;
	}

	public void setAaccountHolderName(String aaccountHolderName) {
		this.aaccountHolderName = aaccountHolderName;
	}

	public String getIfscCode() {
		return ifscCode;
	}

	public void setIfscCode(String ifscCode) {
		this.ifscCode = ifscCode;
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public void displayAccountInfo() {
		System.out.println("Account [aaccountHolderName=" + aaccountHolderName + ", ifscCode=" + ifscCode
				+ ", accountNumber=" + accountNumber + "]");
	}

}
