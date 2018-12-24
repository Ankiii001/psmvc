package com.nagarro.springmvc.psbankapp.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

import com.nagarro.springmvc.psbankapp.dao.AccountDAO;
import com.nagarro.springmvc.psbankapp.model.Account;

@Aspect
@Component
public class AccountAspect {
	
	@Before("execution(* com.nagarro.springmvc.psbankapp.daoimpl.AccountDAOImpl.saveAccount(..))")
	public void validateAccount(JoinPoint joinPoint) {
		System.out.println("Method: Validation is being Processed.");
		Object []args = joinPoint.getArgs();
		Account account = (Account)args[0];
		AccountDAO accountDAO = (AccountDAO) joinPoint.getTarget();
		int accountNo = account.getAccountNo();
		if(accountDAO.getAccount(accountNo)!= null) {
			throw new RuntimeException("Accounts with Account Number" + accountNo + " is already exist");
		}
	}
}
