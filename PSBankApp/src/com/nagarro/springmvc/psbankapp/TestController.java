package com.nagarro.springmvc.psbankapp;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/test")
public class TestController {
	
	@RequestMapping(value= {"","/index","/index/*"})
	public String index() {
		return "testRequestmapping";
		}

}
