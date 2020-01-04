package com.nt.single;

public class Singleton {

    private static Singleton INSTANCE;
    
    public Singleton() {
	System.out.println("Singleton.O-paramConstructor");
    }
    
    public static Singleton getInstance() {
    	if(INSTANCE==null) {
    		INSTANCE= new Singleton();
    	}
  
		return INSTANCE;
    	
    }
   

}
