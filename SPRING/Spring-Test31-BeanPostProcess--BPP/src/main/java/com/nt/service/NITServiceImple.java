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
	System.out.println("NITServiceImple.NITServiceImple()");
		this.dao = dao;
	}
	
	public abstract StudentBO getStudentBO();
	public abstract EmployeeBo getEmployeeBo();
	
	public String ProcessStudeent(StudentDTO dto) {
		int count=0;
		
	StudentBO bo= getStudentBO();
	BeanUtils.copyProperties(dto,bo);
	//invoke the method
	 count=dao.StudentRegister(bo);
	
	 if(count==1)	
	      return "Student Registration Sucsess ";
    else
    	  return "Student Registration Failed";
	}
	public String ProcessEmployee(EmployeeDTO dto) {
		int count=0;
		
	EmployeeBo bo=new EmployeeBo();	
	BeanUtils.copyProperties(dto, bo);
	//invoked
	 count=dao.EmployeeRegister(bo);
	if(count==1)	
	   return "Employee Registration Sucsess ";
  else
  	  return "Employee Registration Failed";
	}
}
