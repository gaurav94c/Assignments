package def;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

import com.manipal.spring_core_demo.Employee;
import com.manipal.spring_core_demo.Welcome;

public class CoreMain {

	public static void main(String[] args) {
		
		// 2. Application Context Container for Welcome Class
		ApplicationContext context = new ClassPathXmlApplicationContext("sprinng.xml");

		Welcome welcomeObj = (Welcome) context.getBean("welcome");// welcome1 is class id, check sprinng.xml
		System.out.println(welcomeObj.getMessage()); 
		// Before Setter method, it needs to create the object . For which we need,Default Constructor

		Welcome welcomeObj1 = (Welcome) context.getBean("welcome1");// welcome2 is class id
		System.out.println(welcomeObj1.getMessage());// It already has a parameterized constructor.

		//Class Assignment: Employee Class Dependency Injection
		Employee emp = (Employee) context.getBean("employee");
		System.out.println("Employee Id: " + emp.getEmpId() + "," +" Name:"+ emp.getEmpName() + "," +" Salary:"+ emp.getSalary());

	}

}
