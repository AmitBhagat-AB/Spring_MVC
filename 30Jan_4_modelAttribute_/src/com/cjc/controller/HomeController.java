package com.cjc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.cjc.model.Student;

@Controller
public class HomeController 
{
	@RequestMapping("/reg")
	public String loginCheck(@ModelAttribute("s") Student stu)
	{
		System.out.println(stu.getId());
		System.out.println(stu.getName());
		System.out.println(stu.getAddress());
		
		return "success";
	}
	
}


