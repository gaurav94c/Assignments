package com.manipal;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//SpringBootApplication Annotation by default contains Component Scan , but
// it will scan in same package or in sub packages.

public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	//Tomcat started on port(s): 8080
	//http://localhost:8080/welcome
}
