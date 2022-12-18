package com.cjc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import com.model.Employee;



@Controller
public class HomeController 
{

	@RequestMapping("/log")
	public String loginCheck(@ModelAttribute("e") Employee emp)
	{
		System.out.println(emp.getEid());
		System.out.println(emp.getEname());
		System.out.println(emp.getEaddress().getCityname());
		System.out.println(emp.getEaddress().getAreaname());
				
		return "success";
	}

}

