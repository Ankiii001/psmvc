package com.nagarro.springmvc.psbankapp.services;

import java.util.List;

import com.nagarro.springmvc.psbankapp.model.Account;

public interface AccountService {
	public boolean saveAccount(Account account);
	
	public List<Account> getAccounts();

	public Account getAccount(Integer accountNo);

	public boolean deleteAccount(int accountNo);
}
