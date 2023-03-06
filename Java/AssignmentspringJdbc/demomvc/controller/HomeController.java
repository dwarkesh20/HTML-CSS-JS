package com.einfochips.demomvc.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
	
	@RequestMapping("/hello")
	public String hello(@RequestParam(value = "name", defaultValue = "World") String name) 
	{
		return String.format("Hello %s!", name);
	}
	
	@RequestMapping("/hi")
	public String hi(@RequestParam(value = "name", defaultValue = "World") String name) 
	{
		return String.format("Hi %s!", name);
	}
	
	
}
