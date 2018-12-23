package com.nagarro.springmvc.psbankapp.servicesimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.nagarro.springmvc.psbankapp.dao.AccountDAO;
import com.nagarro.springmvc.psbankapp.model.Account;
import com.nagarro.springmvc.psbankapp.services.AccountService;

@Service("AccountService")
public class AccountServiceImpl implements AccountService {
	
	@Autowired
	AccountDAO accountDAO;
	
	@Override
	@Transactional
	public boolean saveAccount(Account account) {
		return accountDAO.saveAccount(account);
	}

	@Override
	@Transactional
	public List<Account> getAccounts() {
		return accountDAO.getAccounts();
	}

}
