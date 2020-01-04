package com.nt.service;


import com.nt.bo.EmployeeBO;
import com.nt.dao.EmployeeDAO;
import com.nt.dto.EmployeeDTO;

public final  class EmployeeServiceImpl implements EmployeeService{
	    private EmployeeDAO dao;

	public EmployeeServiceImpl(EmployeeDAO dao) {
				this.dao = dao;
	}
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
			    	return "Employee Details not inserted";
			    }
			    else{
			    	return "Employee Details inserted successfully";
			    }
	}
	

}
