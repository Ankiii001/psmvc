package com.nagarro.springmvc.psbankapp.model;

public class Account {
	private Integer accountNo;
	private String accountHolderName;
	private double balance;
	
	public Account() {
		this.accountNo = 0;
		this.accountHolderName = "";
		this.balance = 0;
	}
	
	/**
	 * @param accountNo
	 * @param accountHolderName
	 * @param balance
	 */
	public Account(Integer accountNo, String accountHolderName, double balance) {
		super();
		this.accountNo = accountNo;
		this.accountHolderName = accountHolderName;
		this.balance = balance;
	}

	/**
	 * @return the accountNo
	 */
	public Integer getAccountNo() {
		return accountNo;
	}

	/**
	 * @param accountNo the accountNo to set
	 */
	public void setAccountNo(Integer accountNo) {
		this.accountNo = accountNo;
	}

	/**
	 * @return the accountHolderName
	 */
	public String getAccountHolderName() {
		return accountHolderName;
	}

	/**
	 * @param accountHolderName the accountHolderName to set
	 */
	public void setAccountHolderName(String accountHolderName) {
		this.accountHolderName = accountHolderName;
	}

	/**
	 * @return the balance
	 */
	public double getBalance() {
		return balance;
	}

	/**
	 * @param balance the balance to set
	 */
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
}
