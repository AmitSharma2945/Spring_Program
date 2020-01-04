package com.nt.service;

import com.nt.bo.CustomerBO;
import com.nt.dao.CustomerDAO;
import com.nt.dto.CustomerDTO;

public final class CustomerServiceImpl implements CustomerService{
	
		  private  CustomerDAO dao;
		public CustomerServiceImpl(CustomerDAO  dao) {
			this.dao=dao;
		}
		public String register(CustomerDTO dto) throws Exception {
			int cno=0;
			String cname=null;
			float amt=0;
			float rate=0;
			float time=0;
			float interest=0;
			float totalAmt=0;
			int count=0;
			CustomerBO bo=null;
			
			//get values from vo
			 cno=dto.getCustNo();
		   cname=dto.getCustName();
			 amt=dto.getCustAmount();
			rate=dto.getRateOfAmount();
			time=dto.getTime();
			//get buisness logic
			interest=(amt*rate*time)/100;
			//gettotal amt
			totalAmt=amt+interest;
		   //set into bo
		    bo=new CustomerBO();
		    bo.setCustNo(cno);
		    bo.setCustName(cname);
		    bo.setInterest(interest);
		    bo.setTotalAmount(totalAmt);
			//use dao
		     count=dao.insert(bo);
		     
		    if(count==0) {
		    	return "Customer Details not inserted";
		    }
		    else{
		    	return "Customer Details inserted successfully";
		    }

		    
		}

	}

