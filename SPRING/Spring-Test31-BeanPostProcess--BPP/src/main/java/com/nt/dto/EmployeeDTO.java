package com.nt.dto;

import com.nt.bo.BaseBO;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
public class EmployeeDTO extends BaseBO {
	
	private String job;
	private float  salary;
	private int exp;

}
