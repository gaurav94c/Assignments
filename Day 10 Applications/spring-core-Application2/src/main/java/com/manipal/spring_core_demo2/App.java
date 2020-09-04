package com.manipal.spring_core_demo2;

import java.nio.file.Path;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.manipal.spring_core_demo2.model.Employee;

/**
 * Hello world!
 *
 */
public class App{
    public static void main( String[] args ){
    	
    	
    	ApplicationContext context = new FileSystemXmlApplicationContext("spring.xml");
    	
    	Employee emp = (Employee) context.getBean("employee");
    	
    	System.out.println("Employee Name: "+emp.getEmpName() + " , Salary: " +emp.getSalary());
    	System.out.println("Employee City: "+emp.getAddress().getCity() +"\n"+" Employee Address: " + emp.getAddress().getPin());
    	
    	System.out.println(emp);
    	
    }
}
