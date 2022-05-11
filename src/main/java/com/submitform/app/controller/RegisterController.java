package com.submitform.app.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RegisterController {
	
	@GetMapping("/register")
	public void register(RegisterDetails details) {
		System.out.println("Registerd");
	}
}
