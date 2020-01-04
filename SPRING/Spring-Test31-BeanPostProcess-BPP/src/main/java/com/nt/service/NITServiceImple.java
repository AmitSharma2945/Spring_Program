package com.nt.service;

import org.springframework.beans.BeanUtils;

import com.nt.bo.EmployeeBo;
import com.nt.bo.StudentBO;
import com.nt.dao.NITDAOImpl;
import com.nt.dto.EmployeeDTO;
import com.nt.dto.StudentDTO;

public abstract class NITServiceImple{
	
	private NITDAOImpl dao;

	public NITServiceImple(NITDAOImpl dao) {
		this.dao = dao;
	}
	
	public abstract StudentBO getStudentBO();
	public abstract EmployeeBo getEmployeeBo();
	
	
	
	public void ProcessStudeent(StudentDTO dto) {
	StudentBO bo= getStudentBO();
	BeanUtils.copyProperties(dto,bo);
	//invoke the method
	int count=dao.StudentRegister(bo);	
	}
	public void ProcessEmployee(EmployeeDTO dto) {
	EmployeeBo bo=new EmployeeBo();	
	BeanUtils.copyProperties(dto, bo);
	//invoked
	int count=dao.EmployeeRegister(bo);
	
	}
	
	

}
