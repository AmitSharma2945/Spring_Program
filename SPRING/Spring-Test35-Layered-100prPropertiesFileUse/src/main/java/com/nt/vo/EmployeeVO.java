package com.nt.vo;

import java.io.Serializable;

import lombok.Data;

@Data
public class EmployeeVO implements Serializable{ 
	
	private String empid;
	private String empName;
	private String empAddrs;
	private String basicSalary; 

}
