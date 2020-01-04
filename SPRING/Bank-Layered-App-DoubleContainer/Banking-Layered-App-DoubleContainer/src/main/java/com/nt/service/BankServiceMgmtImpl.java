package com.nt.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;

import com.nt.bo.BankBO;
import com.nt.dao.BankDAO;
import com.nt.dto.BankDTO;

public class BankServiceMgmtImpl implements BankServiceMgmt {

	private BankDAO dao;
	public BankServiceMgmtImpl(BankDAO dao) {
		this.dao = dao;
	}

	public List<BankDTO> findBanksByArea(String desg[]) throws Exception {
		List<BankDTO> listdto=null;
		List<BankBO> listbo=null;
		
		BankDTO dto=null;
		StringBuffer sb=new StringBuffer("(");
		
		int length=desg.length;
		System.out.println(length);
		
		for(int j=0;j<length;j++){
			
			if(j==length-1) {
				sb.append("'"+desg[j]+"'");
			}
			else {
				sb.append("'"+desg[j]+"',");
			}
			
		
		}
		sb.append(")");
		System.out.println(sb);
        
		
		
		//use dao
		listbo=dao.getBankDetails(sb);
		listdto=new ArrayList();
		//convert listbo to listdto
		for(BankBO bo:listbo) {
		   dto=new BankDTO();
		   BeanUtils.copyProperties(bo, dto);
		   dto.setSrNo(listdto.size()+1);
		   listdto.add(dto);
		}
		return listdto;
	}//method

}//classs
