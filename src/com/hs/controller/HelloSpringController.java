package com.hs.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value="/hello")
public class HelloSpringController {

	@RequestMapping(method=RequestMethod.GET)
	protected String execute(ModelMap model){
		System.out.println("in execute  method");
		
		model.addAttribute("message", "hello Spring MVC");
 
		return "welcome";
	
			
	}
	

	
}
