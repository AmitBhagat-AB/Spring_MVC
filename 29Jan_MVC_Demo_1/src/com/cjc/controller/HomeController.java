package com.cjc.controller;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.RequestMapping;



@Configuration
public class HomeController {

	@RequestMapping("/log")
	public String logincheck()
	{
		System.out.println("Hello");
		
		return "success";
	}
}
