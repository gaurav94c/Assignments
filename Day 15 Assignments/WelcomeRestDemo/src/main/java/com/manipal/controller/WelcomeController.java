package com.manipal.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.manipal.model.MessageBean;

//Should be in same package or sub package of Spring Boot Application Class.

@RestController
@RequestMapping("/rest")
public class WelcomeController {
	
	@RequestMapping(value="/welcome", method =RequestMethod.GET)
	public String welcome() {
		return "Welcome to Spring REST Application";
		
	}
	
	
	@RequestMapping(value="welcome/{name}")
	public String welcomeMesasge(@PathVariable String name){
		return "Welcome to Spring REST Application "+name;
	}
	
	// Since the request is GET , so we can access from Browser.
	//But,If request is POST , then we go for POSTMAN app.

	  //Using Anonymous Objects
	  //Instead of returning a String , we are returning an Object here
	  @RequestMapping(value="wel-message") public MessageBean welcomeMesasge(){
	  return new MessageBean("Welcome to Messaging....."); }
	 
	
	/* ANOTHER WAY by creating normal objects
	 * @RequestMapping(value="wel-message") public String welcomeMesasge(){
	 * MessageBean mb=new MessageBean("Welcome to Messaging....."); return
	 * mb.getMessage(); //return new MessageBean("Welcome to Messaging....."); }
	 */

}



