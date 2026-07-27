package com.kodewala.bean;

public class Payment {
	
	private String refID;
	
	
	
	public void paymentInfo() {
		
		System.out.println("REF id "+refID);
		
	}



	public String getRefID() {
		return refID;
	}



	public void setRefID(String refID) {
		this.refID = refID;
	}

}
