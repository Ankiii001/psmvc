package com.nagarro.springmvc.psbankapp.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.nagarro.springmvc.psbankapp.model.Account;
import com.nagarro.springmvc.psbankapp.services.AccountService;

@Controller
public class AccountController {
	
	@Autowired
	AccountService accountService;
	
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
		return "account-form";
	}

	@RequestMapping("/showAccount")
	public String showAccount() {
		return "showAccount";
	}

	@RequestMapping(value = "/saveAccount", method = RequestMethod.POST)
	public String saveAccount(@Valid @ModelAttribute("account") Account account,
			BindingResult result, Model model) {

		if (result.hasErrors()) {
			return "account-form";
		} else {
			String message = "";
			boolean flag = true;
			try {
				flag = accountService.saveAccount(account);
			} catch (Exception e) {
				message = e.getMessage();
				flag = false;
			}
			if(!flag) {
				model.addAttribute("message",message);
				return "account-form";
			}
			model.addAttribute("account",account);
			return "redirect:/list";
		}
	}
	
	@GetMapping("/list")
	public String listAccounts(Model model) {
		List<Account> accounts = accountService.getAccounts();
		model.addAttribute("accounts", accounts);
		return "listAccounts";
	}

	@GetMapping("/edit")
	public String updateAccount(@RequestParam("accountNo") int accountNo, Model model) {
		Account account = accountService.getAccount(new Integer(accountNo));
		model.addAttribute("account", account);
		return "account-form";
		
	}
	
	@GetMapping("/delete")
	public String deleteAccount(@RequestParam("accountNo") int accountNo, Model model) {
		accountService.deleteAccount(accountNo);
		return "redirect:/list";
		
	}
	
	@RequestMapping("*")
	public String fallBackPage() {
		return "fileNotFound";
	}
}