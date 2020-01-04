package com.nt.bo;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
public class EmployeeBo extends BaseBO {
	private String job;
	private float  salary;
	private String exp;
}
