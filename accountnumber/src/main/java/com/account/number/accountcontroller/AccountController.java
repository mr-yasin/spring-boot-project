package com.account.number.accountcontroller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.account.number.accountmodel.AccountModel;
import com.account.number.accountmodel.BalanceModel;
import com.account.number.accountservice.AccountService;

@RestController
public class AccountController {
	
	@Autowired
	AccountService service;
	
	@RequestMapping(method=RequestMethod.GET,path="/acccount/details")
	public ArrayList<AccountModel> getDetails() {
		return service.getDetails();
		
	}
	
	@RequestMapping(method=RequestMethod.PUT,path="/account/balance/withdraw/{accNum}")
	public String withDrawAmout(@RequestBody AccountModel request, @PathVariable long accNum) {
		// TODO Auto-generated method stub
		return service.withDrawAmout(request, accNum);
	}
	
	@RequestMapping(method=RequestMethod.PUT,path="/account/balance/deposite/{accNum}")
	public String depositeAMount(@RequestBody AccountModel request,@PathVariable long accNum) {
		
		return service.depositeAMount(request, accNum);
	}
	@RequestMapping(method=RequestMethod.GET,path="/acccount/details/balance/{accNum}")
	public BalanceModel getAccountBalance(@PathVariable long accNum) {
		return service.getAccountBalance(accNum);
	}
	

	
	
}
