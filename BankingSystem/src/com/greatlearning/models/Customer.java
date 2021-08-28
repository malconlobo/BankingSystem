package com.greatlearning.models;

public class Customer {
	private String password;
	private int account;
	private int bankBalance;
	private int otp = 371487;
	
	public Customer(String password, int account){
		this.account = account;
		this.password = password;
	}
	
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getAccount() {
		return account;
	}
	public void setAccount(int account) {
		this.account = account;
	}

	public int getBankBalance() {
		return bankBalance;
	}

	public void setBankBalance(int bankBalance) {
		this.bankBalance = bankBalance;
	}

	public int getOtp() {
		return otp;
	}
  
}
