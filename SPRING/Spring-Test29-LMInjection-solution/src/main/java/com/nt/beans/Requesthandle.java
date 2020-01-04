package com.nt.beans;

public class Requesthandle {
	
	private static int count;
	
	public Requesthandle() {
	System.out.println("Requesthandle.O-paramConstructor");
	}
	
	public void handle(String data) {
		count++;
    System.out.println("Handle Request."+count+".with data");
	}

}
