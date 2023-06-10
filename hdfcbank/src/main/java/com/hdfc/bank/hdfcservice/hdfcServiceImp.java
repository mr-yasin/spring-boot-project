
package com.hdfc.bank.hdfcservice;

import java.util.ArrayList;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hdfc.bank.hdfcentity.HdfcEntity;
import com.hdfc.bank.hdfcmodel.HdfcModel;
import com.hdfc.bank.hdfcrepository.HdfcRepository;

@Service

public class hdfcServiceImp implements HdfcService {
	@Autowired
	HdfcRepository repo;
	
	
	/*
	 * get method
	 */
	@Override
	public List<HdfcModel> getBankDetails() {

		List<HdfcModel> list = new ArrayList<>();

		List<HdfcEntity> allAccounts = (List<HdfcEntity>) repo.findAll();

		for (HdfcEntity account : allAccounts) {
			HdfcModel model = new HdfcModel();

			model.setAccNum(account.getAccNum());
			model.setName(account.getName());
			model.setAccType(account.getAccType());
			model.setAvlBal(account.getAvlBal());
			model.setMobileNum(account.getMobileNum());
			
			list.add(model);

		}

		return list;

	}
	
	/* getbyId method */

	@Override
	public HdfcModel loadByAccNum(long accNum) {
		
		
		Optional<HdfcEntity> allAccount= repo.findById(accNum);
		HdfcEntity account=allAccount.get();
		HdfcModel accDetails= new HdfcModel();
		accDetails.setAccNum(account.getAccNum());
		accDetails.setName(account.getName());
		accDetails.setAccType(account.getAccType());
		accDetails.setAvlBal(account.getAvlBal());
		accDetails.setMobileNum(account.getMobileNum());
		System.out.println(accDetails.getAccNum());
				
		return accDetails;
		
		
	}
	
	
	/* post method */

	@Override
	public String insertHdfcAccountDetails(HdfcModel request) {
		
		HdfcEntity newUser =new HdfcEntity();
		newUser.setAccNum(request.getAccNum());
		newUser.setAccType(request.getAccType());
		newUser.setAvlBal(request.getAvlBal());
		newUser.setMobileNum(request.getMobileNum());
		newUser.setName(request.getName());
		
		repo.save(newUser);
		
				
		return "Account is Created" ;
	}

	

	@Override
	public String updateHdfcDetails(HdfcModel request, long accNum) {
		
	Optional<HdfcEntity> account = repo.findById(accNum);
	
	HdfcEntity saved=account.get();
	saved.setName(request.getName());
    HdfcEntity save= repo.save(saved);
    return "User is update";
     
	
	
	
		
		
	}

	@Override
	public String deleteHdfcAccount(long accNum) {	
	repo.deleteById(accNum);	
		return "Accont is Deleted";
	}

	

}
