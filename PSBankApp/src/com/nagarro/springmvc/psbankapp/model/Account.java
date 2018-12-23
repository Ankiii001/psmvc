package com.nagarro.springmvc.psbankapp.model;

import java.util.Date;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.springframework.format.annotation.DateTimeFormat;

public class Account {
	@NotNull(message = "Account# can't be blank")
	private Integer accountNo;

	@NotNull(message = "Account Holder Name can't be blank")
	@Size(min = 3, max = 50, message = "Invalid Length for Account holder name")
	@Pattern(regexp = "[A-Za-z(\\s)]+", message = "Invalid Account Holder Name")
	private String accountHolderName;

	@NotNull(message = "Balance amount is required")
	@Min(value = 5000, message = "Minimum balance must nt be less than 5000")
	private double balance;

	@DateTimeFormat(pattern = "dd/MM/yyyy")
	@NotNull(message = "Date Of Birth can't be blank")
	@Past(message = "cant open account for one who is not born")
	private Date dateOfBirth;

	@NotNull(message = "Account type can't be blank")
	private String accountType;

	@NotNull(message = "PS Code is required")
	private String psCode;

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
