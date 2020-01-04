package com.nt.dto;

import java.io.Serializable;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;


@Setter
@Getter
@ToString
public class EmployeeDTO implements Serializable {
	private int eid;
	private String ename;
	private String job;
	private float salary;
	private String email;
}
