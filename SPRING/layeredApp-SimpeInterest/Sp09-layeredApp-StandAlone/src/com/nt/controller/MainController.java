package com.nt.controller;

import java.util.Scanner;

import com.nt.dto.CustomerSIntrestDTO;
import com.nt.services.SimpleInterestService;
import com.nt.vo.CustomerSIntrestVO;

public final class MainController {

	private SimpleInterestService service;
	
	public MainController(SimpleInterestService service) {
		this.service=service;
	}
	public String processInterest(CustomerSIntrestVO vo)throws Exception {
		
		
		//vo to Dto Convert values\
		CustomerSIntrestDTO dto=new CustomerSIntrestDTO();
		dto.setCustNo(Integer.parseInt(vo.getCustNo()));
		dto.setCustName(vo.getCustName());
		dto.setPAmount(Float.parseFloat(vo.getPAmount()));
		dto.setRateOfAmount(Float.parseFloat(vo.getRateOfAmount()));
		dto.setTime(Float.parseFloat(vo.getTime()));
		
		//use dto
		String result=service.register(dto);
		
		//get vo class values
		return result;
		
	}
}
