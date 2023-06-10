package com.hdfc.bank.hdfccontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.hdfc.bank.hdfcmodel.HdfcModel;
import com.hdfc.bank.hdfcservice.HdfcService;
import com.hdfc.bank.hdfcservice.hdfcServiceImp;

@RestController
public class HdfcController {

	@Autowired
	HdfcService hdfcDetails;

	@RequestMapping(method = RequestMethod.GET, path = "/hdfc/details")
	public List<HdfcModel> getBankDetails() {

		List<HdfcModel> hdfc = hdfcDetails.getBankDetails();
		

		return hdfc;
	}
	
	@RequestMapping(method=RequestMethod.GET,path="/hdfc/details/id/{AccNum}")
	public HdfcModel loadByAccNum(@PathVariable("AccNum") long accNum) {
		
		return hdfcDetails.loadByAccNum(accNum);
	}
	
	
	@RequestMapping(method=RequestMethod.POST,path="/hdfc/details/new/user")
	public String insertHdfcAccountDetails(@RequestBody HdfcModel request) {		
		
		
		return hdfcDetails.insertHdfcAccountDetails(request);
	}
	@RequestMapping(method = RequestMethod.PUT,path="/hdfc/details/update/account/{accNum}")
	public String updateHdfcDetails(@RequestBody HdfcModel request,@PathVariable long accNum) {
		// TODO Auto-generated method stub
		return hdfcDetails.updateHdfcDetails(request, accNum);
	}
	
	@RequestMapping(method=RequestMethod.DELETE,path="/hdfc/details/delete/account/{accNum}")
	public String deleteHdfcAccount(@PathVariable long accNum) {
		// TODO Auto-generated method stub
		return hdfcDetails.deleteHdfcAccount(accNum);
	}
	
	
}
