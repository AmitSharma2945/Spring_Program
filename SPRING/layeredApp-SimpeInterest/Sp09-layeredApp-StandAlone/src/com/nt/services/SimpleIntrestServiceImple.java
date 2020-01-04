package com.nt.services;

import org.springframework.beans.propertyeditors.CustomBooleanEditor;

import com.nt.bo.CustomerSIntrestBO;
import com.nt.dao.SimpleIntrestDAO;
import com.nt.dao.SimpleIntrestDAOImpl;
import com.nt.dto.CustomerSIntrestDTO;

public final class SimpleIntrestServiceImple implements SimpleInterestService {

	SimpleIntrestDAO dao;
	public SimpleIntrestServiceImple(SimpleIntrestDAO dao) {
		this.dao=dao;
	}
	@Override
	public String register(CustomerSIntrestDTO dto) throws Exception {
		int cno=0;
		String cname=null;
		float amt=0;
		float rate=0;
		float time=0;
		float si=0;
		float totalAmt=0;
		int count=0;
		CustomerSIntrestBO bo=null;
		
		//get values from vo
		cno=dto.getCustNo();
		cname=dto.getCustName();
		amt=dto.getPAmount();
		rate=dto.getRateOfAmount();
		time=dto.getTime();
		//get buisness logic
		si=(amt*rate*time)/100;
		//gettotal amt
		totalAmt=amt+si;
	   //set into bo
	    bo=new CustomerSIntrestBO();
	    bo.setCustNo(cno);
	    bo.setCustName(cname);
	    bo.setSimpleIntrest(si);
	    bo.setTotalAmount(totalAmt);
		//use dao
	     count=dao.insert(bo);
	     
	    if(count==0) {
	    	return "Customer Details not inserted";
	    }else {
	    	return "Customer Details inserted successfully";
	    }

	    
	}

}
