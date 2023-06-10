package com.account.number.accountservice;

import java.util.ArrayList;

import com.account.number.accountmodel.AccountModel;
import com.account.number.accountmodel.BalanceModel;

public interface AccountService {
	ArrayList<AccountModel> getDetails();
	 String withDrawAmout(AccountModel request ,long accNum);	 
	 String depositeAMount(AccountModel request,long accNum);
	 
	 BalanceModel getAccountBalance(long accNum);
	

	

}
