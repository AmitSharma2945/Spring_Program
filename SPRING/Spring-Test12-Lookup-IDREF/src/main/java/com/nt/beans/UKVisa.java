package com.nt.beans;

import java.util.Calendar;

public class UKVisa {
	
	public UKVisa() {
	 System.out.println("UKVisa.UKVisa()");
	}
	
	public boolean isApprovedVisaUK() {
		System.out.println("UKVisa.isApprovedVisaUK()");
		
		Calendar cal=null;
		int month=0;
		
		cal=Calendar.getInstance();
		month=cal.get(Calendar.MONTH);
		if(month>=1 && month<=5)
		return true;
	else
		return false;
	
	}

}
