package com.cjc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
 
@Controller
public class HomeController 
{

	@RequestMapping("/log/{uname}/{pass}")
	public String loginCheck(@RequestParam("uname")String uname,@RequestParam ("pass")String pass)
	{
		System.out.println(uname);
		System.out.println(pass);
		return "success";
	}
	
}


