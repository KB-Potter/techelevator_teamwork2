package com.techelevator;

import java.math.BigDecimal;
import java.text.NumberFormat;

public class BankAccount {
	
	//variables
	private BigDecimal dollarFormat;
	private String accountNumber;
	public BigDecimal balance; 

	BankAccount() {
	//constructor, doesn't need anything in it? , self-contained, don't put anything in those brackets
	}
	
	//getters and setters
	public String getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}
	public BigDecimal getBalance() {
		return balance;
	}
	
	BankAccount credit = new BankAccount(); 
	BankAccount savings = new BankAccount(); 
	
	//methods
	public BigDecimal deposit( BigDecimal amountToDeposit) {
		return getBalance().add(amountToDeposit); 
	}
	public BigDecimal withdraw( BigDecimal amountToWithdraw) {
		return getBalance().subtract(amountToWithdraw);
	}
	public void transfer( BankAccount destinationAccount, BigDecimal transferAmount ) {
		withdraw(transferAmount); 
		destinationAccount.deposit(withdraw(transferAmount));
	}
	//the bank account class should make destinationAccount a new variable...I think? 
	//right now it's not doing that, possibly b/c the value is immutable
	
	public BigDecimal dollarFormat(BigDecimal n) {
		return dollarFormat = n.setScale(2);
	}
	
}


