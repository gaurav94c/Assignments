package com.manipal.spring_core_demo3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.manipal.spring_core_demo3.model.Employee;

public class App{
	
    public static void main( String[] args ){
    	
    	ApplicationContext context = new FileSystemXmlApplicationContext("src\\main\\java\\spring3.xml");
    	
    	Employee emp = (Employee) context.getBean("employee");    	
    	
    	System.out.println(emp.getAddress()); //Returns null if no address is provided
    	
    	System.out.println(emp.getEmpName() + "\t" +
    			emp.getSalary() + "\t" + emp.getAddress().getCity() +"\t" + emp.getAddress().getPin());
    	
    	    	
    }
}
