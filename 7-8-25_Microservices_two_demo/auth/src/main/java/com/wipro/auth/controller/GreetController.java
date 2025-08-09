package com.wipro.auth.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetController {
	
	@GetMapping("/greet")
	String greet() {
		return "Hello from Greet";
	}
	
	
	@GetMapping("/hello")
	String sayhello() {
		return "Hello!!!!";
	}
}
