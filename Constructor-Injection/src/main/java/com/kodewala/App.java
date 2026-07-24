package com.kodewala;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.kodewala.config.SpringConfig;
import com.kodewala.emp.Employee;

public class App 
{
    public static void main( String[] args )
    {
      ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
      
      Employee emp = (Employee)context.getBean("emp");
      
     emp.printInfo();;
    }
}
