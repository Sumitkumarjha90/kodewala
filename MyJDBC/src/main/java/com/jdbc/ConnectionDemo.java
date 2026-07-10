package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			String url="jdbc:mysql://localhost:3306/8TH_MARCH ";
			String username = "root";
			 String password = "Sumit@123";
			 
			 Connection con =
	                    DriverManager.getConnection(
	                            url,
	                            username,
	                            password);
			 System.out.println("Connected Successfully");
			  con.close();

	            System.out.println("Connection Closed");

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
