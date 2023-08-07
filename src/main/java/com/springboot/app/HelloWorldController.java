package com.springboot.app;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
	
	// GET HTTP Method
	// http://localhost:9090/hello-world
	@GetMapping("/hello-world")
	public String helloWorld() {
		return "Bonjour chers étudiants!";
	}
}