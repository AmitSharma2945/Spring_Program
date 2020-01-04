package com.nt.controller;

import java.util.List;

import com.nt.dto.EmployeeDTO;
import com.nt.service.EmployeeService;

public class MainController {
	
	private EmployeeService service;

	public MainController(EmployeeService service) {
		this.service = service;
	}
	
	public List<EmployeeDTO> fetchEmplByjob(String[] cond)throws Exception {
     //use serice
		System.out.println(cond);
    List<EmployeeDTO> listDTO=service.findEmpByJob(cond);
		
     return listDTO;
	}
	
}
