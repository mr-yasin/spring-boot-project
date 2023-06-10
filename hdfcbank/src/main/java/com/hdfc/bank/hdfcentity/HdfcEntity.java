package com.hdfc.bank.hdfcentity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "HDFCACCOUNT")
public class HdfcEntity {
	@Id
	@Column(name = "ACCNUM")
	public long accNum;
	
	@Column(name = "ACC_HOLDER_NAME")
	public String name;

	@Column(name = "ACC_HOLDER_AVL_BAL")
	public long avlBal;

	@Column(name = "ACC_HOLDER_TYPE")
	public String accType;

	@Column(name = "ACC_HOLDER_MOB_NUM")
	public long mobileNum;

	public long getAccNum() {
		return accNum;
	}

	public void setAccNum(long accNum) {
		this.accNum = accNum;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getAvlBal() {
		return avlBal;
	}

	public void setAvlBal(long avlBal) {
		this.avlBal = avlBal;
	}

	public String getAccType() {
		return accType;
	}

	public void setAccType(String accType) {
		this.accType = accType;
	}

	public long getMobileNum() {
		return mobileNum;
	}

	public void setMobileNum(long mobileNum) {
		this.mobileNum = mobileNum;
	}

}
