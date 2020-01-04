package com.nt.dto;

import java.io.Serializable;
import java.util.Date;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
@Setter
@Getter
@ToString
public class BaseDTO implements Serializable {

	private int id;
	private String name;
	private String addrs;
	private Date doj;

	
}
