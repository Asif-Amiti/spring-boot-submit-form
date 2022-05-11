package com.submitform.app.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.submitform.app.dto.RegisterDetails;

@RestController
public class RegisterController {
	
	@GetMapping("/register")
	public String register() {
		
		return "register";
	}
	
	
	@GetMapping("/saveDetails")
	public void saveDetails(@RequestBody RegisterDetails details) {
		System.out.println("Registerd"+details);
		
	}
}
