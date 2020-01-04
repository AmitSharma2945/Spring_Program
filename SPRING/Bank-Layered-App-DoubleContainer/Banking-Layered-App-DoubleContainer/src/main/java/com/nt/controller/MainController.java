package com.nt.controller;

import java.util.ArrayList;
import java.util.List;

import com.nt.dto.BankDTO;
import com.nt.service.BankServiceMgmt;

public class MainController {
	
	private BankServiceMgmt service;

	public MainController(BankServiceMgmt service) {
		super();
		this.service = service;
	}
	
	public List<BankDTO> fetchAllBanks(String desg[])throws Exception{
		List<BankDTO> listdto=null;
		
		//get array list
		listdto=new ArrayList();
		listdto=service.findBanksByArea(desg);
		
		
		return listdto;
	}//method
}//class
