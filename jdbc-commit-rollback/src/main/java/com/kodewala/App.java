package com.kodewala;

import java.sql.SQLException;

import com.kodewala.payment.Payment;
import com.kodewala.payment.StudentInfoUpdate;

public class App 
{
    public static void main( String[] args ) 
    {
       StudentInfoUpdate set=new StudentInfoUpdate();
       
       try {
		//pay.doPay();
    	   set.updateStudentInfo("block", 1);
    	   
    	   
	} catch (ClassNotFoundException | SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
    }
}
