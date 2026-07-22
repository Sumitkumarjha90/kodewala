package com.kodewala.user;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.kodewala.student.Student;

public class App 
{
    public static void main( String[] args )
    {
       ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
       
       
       Student student =(Student)context.getBean("obj");
       
       
      // student.displayStudentInfo();
       
       student.setCourse("JAVA");
       student.setId("A123");
       student.setName("Sumit");
       student.displayStudentInfo();
       
    }
    
}
