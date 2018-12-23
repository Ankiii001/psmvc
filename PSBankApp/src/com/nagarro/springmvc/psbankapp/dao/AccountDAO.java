package com.nagarro.springmvc.psbankapp.dao;

import java.util.List;

import com.nagarro.springmvc.psbankapp.model.Account;

public interface AccountDAO {
	public boolean saveAccount(Account account);
	
	public List<Account> getAccounts();
}
