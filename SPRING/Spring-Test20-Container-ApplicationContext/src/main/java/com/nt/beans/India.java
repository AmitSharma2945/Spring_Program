package com.nt.beans;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
public class India {
	private int countryCode;
	private String Flage;
	private String pradhanMantri;
	private String countryForce;
	private TravlingPlaces travlingPlaces;
	
	public India() {
    System.out.println("India O-paramConstructor");
    }
	

}
