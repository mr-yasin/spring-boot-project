package com.account.number.accountmodel;

public class AccountModel {
	private long accNum;
	private float withdraw;
	private float deposite;
	private float balance;
	
	
	
	
	public AccountModel(long accNum, float withdraw, float deposite, float balance) {
		super();
		this.accNum = accNum;
		this.withdraw = withdraw;
		this.deposite = deposite;
		this.balance = balance;
	}
	public AccountModel() {
		// TODO Auto-generated constructor stub
	}
	public long getAccNum() {
		return accNum;
	}
	public void setAccNum(long accNum) {
		this.accNum = accNum;
	}
	public float getWithdraw() {
		return withdraw;
	}
	public void setWithdraw(float withdraw) {
		this.withdraw = withdraw;
	}
	public float getDeposite() {
		return deposite;
	}
	public void setDeposite(float deposite) {
		this.deposite = deposite;
	}
	public float getBalance() {
		return balance;
	}
	public void setBalance(float balance) {
		this.balance = balance;
	}
	
	





	
	

}
