package com.hdfc.bank.hdfcmodel;

public class HdfcModel {

	private long AccNum;
	private String name;
	private long avlBal;
	private String accType;
	private long mobileNum;

	public long getAccNum() {
		return AccNum;
	}

	public void setAccNum(long accNum) {
		AccNum = accNum;
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
