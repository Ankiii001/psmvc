package com.nagarro.springmvc.psbankapp.daoimpl;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.nagarro.springmvc.psbankapp.dao.AccountDAO;
import com.nagarro.springmvc.psbankapp.entity.AccountEntity;
import com.nagarro.springmvc.psbankapp.model.Account;

@Repository("AccountDAO")
public class AccountDAOImpl implements AccountDAO{

	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	public boolean saveAccount(Account account) {
		boolean saveFlag=true;
		AccountEntity accountEntity = new AccountEntity();
		accountEntity.setAccNo(account.getAccountNo());
		accountEntity.setAccHolderName(account.getAccountHolderName());
		accountEntity.setBalance(account.getBalance());
		accountEntity.setAccountType(account.getAccountType());
		accountEntity.setDateOfBirth(account.getDateOfBirth());
		accountEntity.setPsCode(account.getPsCode());
		
		try {
			Session currentSession = sessionFactory.getCurrentSession();
			currentSession.save(accountEntity);
			
		}catch(Exception ex) {
			ex.printStackTrace();
			saveFlag = false;
		}
		return saveFlag;
	}
	

}
