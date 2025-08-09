package com.wipro.logdemo.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class HomeController {
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	@GetMapping("/greet")
	String greet() {
		String str = "Janhvee";
		System.out.println("-- HomeController --");
		
		logger.error("--Error--" + str);
		logger.warn("--WARN--" + str);
		logger.info("--INFO--" + str);
		logger.debug("--DEBUG--" + str);
		logger.trace("-TRACE--" + str);
 
		return "Hii Hello";
	}
	
	@GetMapping("/hello")
	String helo() {
		logger.debug("--HomeController : Hello");
		return "Hello!!!!";
	}
}
