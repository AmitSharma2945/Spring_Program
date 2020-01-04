package com.nt.beans;

public class BlueDart implements Courier{

	static {
		System.out.println(" static block BlueDart.()");
	}
     
	public BlueDart() {
	System.out.println("BlueDart:o-param constructor");	
	}


	public final String deliver(int ord) {
		return "BlueDart ready to Deliver youer product"+ord;
		
	}
}

