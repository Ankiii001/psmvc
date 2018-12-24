package com.nagarro.springmvc.psbankapp.daoimpl;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
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
			currentSession.saveOrUpdate(accountEntity);
			
		}catch(Exception ex) {
			ex.printStackTrace();
			saveFlag = false;
		}
		return saveFlag;
	}

	@Override
	public List<Account> getAccounts() {
		List<Account> list = new ArrayList<Account>();
		try {
			Session session = sessionFactory.getCurrentSession();
			Query<AccountEntity> query = session.createQuery("From AccountEntity",AccountEntity.class);
			List<AccountEntity> accounts = query.getResultList();
			
			for(int i = 0; i < accounts.size(); i++) {
				AccountEntity accountEntity = (AccountEntity) accounts.get(i);
				Account account = new Account();
				account.setAccountNo(accountEntity.getAccNo());
				account.setBalance(accountEntity.getBalance());
				account.setAccountHolderName(accountEntity.getAccHolderName());
				account.setAccountType(accountEntity.getAccountType());
				account.setPsCode(accountEntity.getPsCode());
				account.setDateOfBirth(accountEntity.getDateOfBirth());
				list.add(account);
			}
		}catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}

	@Override
	public Account getAccount(Integer accountNo) {
		Account account = new Account();
		try {
			Session session = sessionFactory.getCurrentSession();
			AccountEntity accountEntity = (AccountEntity) session.load(AccountEntity.class, accountNo);
			account.setAccountNo(accountEntity.getAccNo());
			account.setBalance(accountEntity.getBalance());
			account.setAccountHolderName(accountEntity.getAccHolderName());
			account.setAccountType(accountEntity.getAccountType());
			account.setPsCode(accountEntity.getPsCode());
			account.setDateOfBirth(accountEntity.getDateOfBirth());
		} catch (Exception e) {
			e.printStackTrace();
		}	
		return account;
	}

	@Override
	public boolean deleteAccount(int accountNo) {
		boolean deleteFlag=true;
		try {
			Session session = sessionFactory.getCurrentSession();
			AccountEntity accountEntity = (AccountEntity) session.load(AccountEntity.class, accountNo);
			session.delete(accountEntity);
		} catch (Exception e) {
			e.printStackTrace();
			deleteFlag = false;
		}
		return deleteFlag;
	}
	

}
