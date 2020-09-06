package com.manipal.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.manipal.dao.UserDao;
import com.manipal.model.Student;
import com.manipal.model.User;

@Controller
public class StudentLoginController {
	
	
	// For Display the UserForm on the Webpage.
	@RequestMapping(value="loginform")// or "/userform" By default , it is GET Method.
	public String getForm() 
	
	{
		return "loginform"; 
	}
	
	
	  @RequestMapping(value="/name/{studentName}",method=RequestMethod.GET) public
	  ModelAndView form(@PathVariable("studentName") String studentName) {
	  ModelAndView modelAndView= new
	  ModelAndView("student-name","student",studentName);
	  
	  
	  return modelAndView;
	  
	  }
	 


	@RequestMapping(value="/loginform_url")
	public ModelAndView form(@RequestParam String studentName, @RequestParam String studentPassword)
	{
		
		
		Student student=new Student();
		student.setStudentName(studentName);
		student.setStudentPassword(studentPassword);
		
		
		UserDao userDao = new UserDao();
		boolean b =userDao.verifyUser(studentName,studentPassword);
		
		if(b) {

		ModelAndView modelAndView1= new ModelAndView("student-user");
		modelAndView1.addObject("student",student);
		return modelAndView1;
		}
		
		else {
			ModelAndView modelAndView2= new ModelAndView("loginform");
			//modelAndView2.addObject("student",student);
			return modelAndView2;
		}
		
	}
	

		
}
