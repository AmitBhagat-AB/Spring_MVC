package com.cjc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;



@Controller
public class HomeController 
{

	@RequestMapping("/log")
	public String loginCheck(@RequestParam("uname")String uname,@RequestParam ("pass")String pswd,Model m,ModelMap mm)
	{
		System.out.println(uname);
		System.out.println(pswd);
		
		m.addAttribute("data", uname).addAttribute("data1", pswd);
		mm.addAttribute("uname", uname).addAttribute("pass",pswd);
		
		return "success";
	}
	
}


