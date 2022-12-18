package com.cjc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController 
{
	@RequestMapping("/log/{uname}/{pass}")
	public String loginCheck(@PathVariable("uname")String usname,@PathVariable("pass")String pswd)
	{
		System.out.println(usname);
		System.out.println(pswd);
		return "success";
	}
	
}


