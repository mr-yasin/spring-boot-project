package com.account.number.accountservice;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.account.number.accountentity.AccountEntity;
import com.account.number.accountmodel.AccountModel;
import com.account.number.accountmodel.BalanceModel;
import com.account.number.accountrepository.AccountRepository;
@Service
public class AccountServiceImp implements AccountService {
	
	@Autowired
	AccountRepository repo;

	@Override
	public ArrayList<AccountModel> getDetails() {
		ArrayList<AccountModel> list = new ArrayList<>();
		
		ArrayList<AccountEntity> accounts=(ArrayList<AccountEntity>)repo.findAll();
		
		for(AccountEntity each : accounts) {
			AccountModel user= new AccountModel();
			user.setAccNum(each.getAccNum());
			user.setWithdraw(each.getWithdraw());
			user.setDeposite(each.getDeposite());
			user.setBalance(each.getBalance());
			list.add(user);
		}		
		
		return list;
	}

	public String withDrawAmout(AccountModel request, long accNum) {
		Optional<AccountEntity> model=repo.findById(accNum);
		
		AccountEntity details=model.get();
			
		if(details.getBalance()>=request.getWithdraw()) {
			float finalBalance=details.getBalance()-request.getWithdraw();
			details.setBalance(finalBalance);
			details.setWithdraw(details.getWithdraw()+request.getWithdraw());
			AccountEntity save=repo.save(details);			
			return "amount is debited";
		}else {
			return "Insufficient Balance";
		}		
		
	}

	@Override
	public String depositeAMount(AccountModel request, long accNum) {
		
		Optional<AccountEntity> model=repo.findById(accNum);		
		AccountEntity details=model.get();
		details.setDeposite(details.getDeposite()+request.getDeposite());
		details.setBalance(details.getBalance()+request.getDeposite());
		AccountEntity save=repo.save(details);		
		return "Amount is credit";
	}

	@Override
	public BalanceModel getAccountBalance(long accNum) {
		
		Optional<AccountEntity> model=repo.findById(accNum);		
		AccountEntity details=model.get();
		BalanceModel account= new BalanceModel();
		account.setAccNum(details.getAccNum());
		account.setBalance(details.getBalance());
		
		return account;
	}

}
