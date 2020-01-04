package com.nt.controller;

import com.nt.dto.EmployeeDTO;
import com.nt.service.EmployeeService;
import com.nt.vo.EmployeeVO;

public class MainController {

	private EmployeeService service;

	public MainController(EmployeeService service) {
		this.service = service;
	}

	public String ProcessEmployee(EmployeeVO vo) throws Exception {
		// vo to Dto convert
		EmployeeDTO dto = new EmployeeDTO();
		dto.setEmpNo(Integer.parseInt(vo.getEmpid()));
		dto.setEmpName(vo.getEmpName());
		dto.setEmpAddrs(vo.getEmpAddrs());
		dto.setBasicsalary(Float.parseFloat(vo.getBasicSalary()));

		String result = service.registerEmployee(dto);

		return result;

	}
}
