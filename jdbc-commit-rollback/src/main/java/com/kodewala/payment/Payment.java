package com.kodewala.payment;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Payment {

	public void doPay() throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/8TH_MARCH", "root",
				"Sumit@123");

		System.out.println(connection.getAutoCommit());

		Statement stmt = connection.createStatement();

		String studentCourse = "INSERT INTO STUDENT_COURSE(id ,subject,marks) values(101,'java',90)";

		int query = stmt.executeUpdate(studentCourse);

		if (query > 0) {
			System.out.println("create the data ");
		}

		stmt.close();
		connection.close();

	}

}
