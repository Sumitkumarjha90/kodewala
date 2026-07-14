package com.kodewala.payment;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class StudentInfoUpdate {
	
	public void updateStudentInfo(String status, int id) throws ClassNotFoundException, SQLException {
	
	Class.forName("com.mysql.cj.jdbc.Driver");
	Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/8TH_MARCH", "root",
			"Sumit@123");
	
	
	String updateQuery = "UPDATE STUDENT_INFO SET STATUS=? WHERE ID=?";
	
	
	PreparedStatement ps = connection.prepareStatement(updateQuery);
	
	
	
	ps.setString(1, status);
	ps.setInt(2, id);
	
	int prp= ps.executeUpdate();
	
	if(prp>0) {
		System.out.println("update the tables");
	}
	else {
		System.out.println("the table is not update");
	}
	
	
	}

}
