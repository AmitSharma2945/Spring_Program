package com.nt.bo;

import java.io.Serializable;

import lombok.Data;


@Data
public class EmployeeBO implements Serializable{
	
	private int empNo;
	private String empName;
	private String empAddrs;
	private float basicsalary;
	private float grosSalary;
	private float netsalary;

}
