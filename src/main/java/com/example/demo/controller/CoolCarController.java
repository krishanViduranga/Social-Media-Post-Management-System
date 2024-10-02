package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CoolCarController {

	@GetMapping("/coolCar")
	public String getCoolCar(){
		return "Cool Car List";
	}
	
	
}
