package com.nt.dao;

import java.util.List;

import com.nt.bo.BankBO;

public interface BankDAO {
	
	public List<BankBO> getBankDetails(StringBuffer sb)throws Exception;

	

}
