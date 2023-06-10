package com.account.number.accountentity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table(name="accout")
public class AccountEntity {
	@Column(name="WITHDRAW")
	public float withdraw;
	
	@Column(name = "DEPOSITE")
	public float deposite;
	
	@Column(name="BALANCE")
	public float balance;
	
	@Id
	@Column(name="ACCNUM")
	public long accNum;

	

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

	public long getAccNum() {
		return accNum;
	}

	public void setAccNum(long accNum) {
		this.accNum = accNum;
	}

}
