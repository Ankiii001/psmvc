package com.nagarro.springmvc.psbankapp.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity //makes this class entity beans
@Table(name="account")
public class AccountEntity {
	@Id // make this primary key
	@Column(name="accountNo")
	private int accNo;
	
	@Column(name="accountHolderName")
	private String accHolderName;
	
	@Column(name="balance")
	private double balance;
	
	@Column(name="accountType")
	private String accountType;
	
	@Column(name="psCode")
	private String psCode;
	
	@Column(name="dateOfBirth")
	private Date dateOfBirth;
	
	public AccountEntity() {
		
	}
	/**
	 * @return the accNo
	 */
	public int getAccNo() {
		return accNo;
	}
	/**
	 * @param accNo the accNo to set
	 */
	public void setAccNo(int accNo) {
		this.accNo = accNo;
	}
	/**
	 * @return the accHolderName
	 */
	public String getAccHolderName() {
		return accHolderName;
	}
	/**
	 * @param accHolderName the accHolderName to set
	 */
	public void setAccHolderName(String accHolderName) {
		this.accHolderName = accHolderName;
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
	/**
	 * @return the accountType
	 */
	public String getAccountType() {
		return accountType;
	}
	/**
	 * @param accountType the accountType to set
	 */
	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}
	/**
	 * @return the psCode
	 */
	public String getPsCode() {
		return psCode;
	}
	/**
	 * @param psCode the psCode to set
	 */
	public void setPsCode(String psCode) {
		this.psCode = psCode;
	}
	/**
	 * @return the dateOfBirth
	 */
	public Date getDateOfBirth() {
		return dateOfBirth;
	}
	/**
	 * @param dateOfBirth the dateOfBirth to set
	 */
	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	
	

}
