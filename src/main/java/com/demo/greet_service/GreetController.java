package com.demo.greet_service;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/greet")
public class GreetController {
	
	@GetMapping("/")
	public String greet() {
		return("Hello Gret service!");
	}

}
