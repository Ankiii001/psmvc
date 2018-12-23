package com.nagarro.springmvc.psbankapp;

import javax.validation.Valid;

import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.nagarro.springmvc.psbankapp.model.Account;

@Controller
public class AccountController {
	
	@InitBinder
	public void initBinder(WebDataBinder dataBinder) {
		StringTrimmerEditor ste = new StringTrimmerEditor(true);
		dataBinder.registerCustomEditor(String.class, ste);
	}
	
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
	public String saveAccount(@Valid @ModelAttribute("account") Account account,
			BindingResult result) {

		if (result.hasErrors()) {
			return "newAccount";
		} else {
			return "showAccount";
		}
	}

	@RequestMapping("*")
	public String fallBackPage() {
		return "fileNotFound";
	}
}