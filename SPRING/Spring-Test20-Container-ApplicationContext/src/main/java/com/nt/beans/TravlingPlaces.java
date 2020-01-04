package com.nt.beans;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
public class TravlingPlaces {
	private String Indore;
	private String agara;
	private String ayodhya;
	private String chainnai;
	
	public TravlingPlaces() {
    System.out.println("TravlingPlaces.O-paramConstructer");
    }

}
