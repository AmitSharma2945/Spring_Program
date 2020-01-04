package com.nt.beans;

import java.util.Date;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;


@ToString
@Setter
@Getter
public class AadharDetails {
	private int id;
	private String name;
	private Date dob;
	private String[] varifiers;
	private String photopath;
	
	

}
