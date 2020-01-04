package com.nt.controller;

import com.nt.dto.CustomerDTO;
import com.nt.service.CustomerService;
import com.nt.vo.CustomerVO;


public class MainController {

	private CustomerService service;

	public MainController(CustomerService service) {
		this.service = service;
	}

	public String processInterest(CustomerVO vo)throws Exception {
		
		
		//vo to Dto Convert values\
		CustomerDTO dto=new CustomerDTO();

		dto.setCustNo(Integer.parseInt(vo.getCustNo()));
		dto.setCustName(vo.getCustName());
		dto.setCustAmount(Float.parseFloat(vo.getCustAmount()));
		dto.setRateOfAmount(Float.parseFloat(vo.getRateOfAmount()));
		dto.setTime(Float.parseFloat(vo.getTime()));
		
		//use dto
		String result=service.register(dto);
		
		//get vo class values
		return result;
		
	}


}
