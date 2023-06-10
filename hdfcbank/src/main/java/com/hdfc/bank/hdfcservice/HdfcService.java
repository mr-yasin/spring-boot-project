package com.hdfc.bank.hdfcservice;

import java.util.List;

import com.hdfc.bank.hdfcmodel.HdfcModel;

public interface HdfcService {
	
	 List<HdfcModel> getBankDetails();
	 
	HdfcModel loadByAccNum(long accNum);
	String insertHdfcAccountDetails(HdfcModel request);
	String updateHdfcDetails(HdfcModel request, long accNum);
	String deleteHdfcAccount(long accNum);
	

}
