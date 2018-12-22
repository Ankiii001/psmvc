package com.nagarro.springmvc.psbankapp;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

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
	public String saveAccount(Model model, HttpServletRequest request) {
		String acNo = request.getParameter("accountNo");
		String customerName = request.getParameter("accountHolderName");
		String balance = request.getParameter("balance");
		
//		model.addAttribute("accountNo", acNo);
//		model.addAttribute("accountHolderName", customerName);
//		model.addAttribute("balance", balance);
		
		Account account = new Account();
		account.setAccountHolderName(customerName);
		account.setAccountNo(Integer.parseInt(acNo));
		account.setBalance(Double.parseDouble(balance));
		
		model.addAttribute("account", account);
		
		return "showAccount";
	}
}