package com.nagarro.springmvc.psbankapp;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/test")
public class TestController {
	
	@RequestMapping(value= {"","/index","/index/*"})
	public String index() {
		return "testRequestmapping";
		}

	@RequestMapping(value= "/name")
	public String methodWithParams(@RequestParam String userName, Model model) {
	model.addAttribute("userName",userName);	
	System.out.println("Page requested by " + userName);
	return "testRequestmapping";
	}

}
