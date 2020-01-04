package com.nt.beans;

import java.util.Date;

public class WishGenerator {
	//bean propertise
	private String name;
	private Date date;
	
	public void setName(String name) {
		this.name = name;
	}
	public void setDate(Date date) {
		this.date = date;
	}
 //b logic
   public String generatorWishMsg() {
	   return "GoOD MoOrNig"+name+"---"+date;
   }
}
