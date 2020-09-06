package com.manipal.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.manipal.dao.UserDao;
import com.manipal.model.User;

@Controller
public class WelcomeController {
	
	
	// For Display the UserForm on the Webpage.
	@RequestMapping(value="userform")// or "/userform" By default , it is GET Method.
	public String getForm() 
	
	{
		return "userform"; 
	}
	
	//Best way:For Submitting the UserForm.( NAME WITH LOCATION)
	@RequestMapping(value="/userform_URLID", method=RequestMethod.GET)	
	public ModelAndView greetWithName(@RequestParam String userName, @RequestParam String userLocation)
	{
		ModelAndView modelAndView = new ModelAndView("greeting-user"); // view name
		User user = new User();
		user.setUserName(userName);
		user.setUserLocation(userLocation);
		
		UserDao userDao = new UserDao();
		userDao.verifyUser(userName);
		
		modelAndView.addObject("user", user); //model object name-value
		
		return modelAndView;
	}
	
		
	// For Submitting the UserForm ( Only NAME)
	@RequestMapping(value="/name/{username}", method=RequestMethod.GET)	
	public ModelAndView greetWithName1(@PathVariable("username") String name) {
		ModelAndView modelAndView = new ModelAndView("greeting-name","uname", name);
								  //new ModelAndView(viewname, modelName, modelObject)
		return modelAndView;
	}
	
	
}
