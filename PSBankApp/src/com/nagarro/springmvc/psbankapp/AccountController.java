package com.nagarro.springmvc.psbankapp;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.nagarro.springmvc.psbankapp.model.Account;

@Controller
public class AccountController {
	@RequestMapping("/")
	public String showHomePage() {
		return "index";
	}

	@RequestMapping("/newaccount")
	public String newAccount(Model model) {
		model.addAttribute("account", new Account());
		return "newAccount";
	}

	@RequestMapping("/showAccount")
	public String showAccount() {
		return "showAccount";
	}

	@RequestMapping(value = "/saveAccount", method = RequestMethod.POST)
	public String saveAccount(Model model, 
		Account account) {
		
		model.addAttribute("account", account);
		
		return "showAccount";
	}
}