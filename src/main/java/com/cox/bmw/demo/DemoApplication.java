package com.cox.bmw.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
//@RequestMapping("/rest")
public class DemoApplication {

	public static final Logger LOGGER = LoggerFactory.getLogger(DemoApplication.class); 
	
	public static void main(String[] args) {
		LOGGER.info("Application Started ...");
		SpringApplication.run(DemoApplication.class, args);
	}
	
	@RequestMapping(value = "/rest", method = RequestMethod.GET)
	public String sayHello()
	{
		LOGGER.info("REST API Called ...");
		return "Hello User!!";
	}
}
