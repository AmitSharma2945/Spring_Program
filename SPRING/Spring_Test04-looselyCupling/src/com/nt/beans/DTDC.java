package com.nt.beans;

public class DTDC implements Courier {
	
	static {
		System.out.println("Ststic Block DTDC()");
	}
	
	public DTDC() {
	System.out.println("Construct o-param DTDC");	
	}

	public final String deliver(int ord) {
		return "DTDC ready to Deliver youer product"+ord;
		
	}

}
