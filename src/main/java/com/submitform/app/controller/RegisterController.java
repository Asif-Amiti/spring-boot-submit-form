package com.submitform.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.submitform.app.dto.Persons;
import com.submitform.app.dto.RegisterDetails;
import com.submitform.app.service.impl.UserServiceImpl;

@Controller
public class RegisterController {
	
	@Autowired
	private UserServiceImpl userService;
	
	
	@GetMapping("/register")
	public String register() {
		Persons person=userService.findPersonById(12546);
		System.out.println("person found="+person);
		return "register";
		
	}
	
	
	@GetMapping("/saveDetails")
	public void saveDetails(@RequestBody RegisterDetails details) {
		System.out.println("Registerd"+details);
		
	}
}
