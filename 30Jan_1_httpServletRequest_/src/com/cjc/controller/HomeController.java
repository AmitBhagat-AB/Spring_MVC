package com.cjc.controller;

import javax.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController 
{
	@RequestMapping("/log")
	public String m1(HttpServletRequest req)
	{
		String uname=req.getParameter("uname");
		String pass=req.getParameter("pass");
		
		System.out.println(uname);
		System.out.println(pass);
		
		return "success";
	}
	
}




