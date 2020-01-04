package com.nt.bo;

import java.util.Date;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
public class BaseBO {
	
	private int id;
	private String name;
	private String addrs;
	private Date doj;

}
