package com.nt.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.bo.EmployeeBO;
import com.nt.dao.EmployeeDAO;
import com.nt.dto.EmployeeDTO;

@Service("siService")
public final  class EmployeeServiceImpl implements EmployeeService{
	
	@Autowired
	private EmployeeDAO dao;

	public String registerEmployee(EmployeeDTO dto) throws Exception {
		    int count=0;
		    int empNo=0;
		    String empName=null;
		    String addrs=null;
		    float basicSalary=0;
		    float grosSalary=0;
		    float netSalary=0;
		    EmployeeBO bo= null;
		    
		    //get vo class values
		    empNo=dto.getEmpNo();
		    empName=dto.getEmpName();
		    addrs=dto.getEmpAddrs();
		    basicSalary=dto.getBasicsalary();
		
		  //get buisness logic
		    grosSalary=(basicSalary*grosSalary*netSalary)/100;
			//gettotal amt
		    netSalary=basicSalary+grosSalary;
			
		    //set into BO object
		     bo=new EmployeeBO ();
		     bo.setEmpNo(dto.getEmpNo());
		     bo.setEmpName(dto.getEmpName());
		     bo.setEmpAddrs(dto.getEmpAddrs());
		     bo.setBasicsalary(dto.getBasicsalary());
		     bo.setGrosSalary(grosSalary);
		     bo.setNetsalary(netSalary);
		 
		     //invoke
             count=dao.insert(bo);		     
		
			    if(count==0) {
			    	return "Employee Not inserted CareOn";
			    }
			    else{
			    	return "Employee Details inserted successfully";
			    }
	}
	

}
