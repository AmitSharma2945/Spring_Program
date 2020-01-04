package com.nt.single;

public class BeanScope {

    private static BeanScope INSTANCE;
    
    public BeanScope() {
	System.out.println("Singleton.O-paramConstructor");
    }
    
    public static BeanScope getInstance() {
    	if(INSTANCE==null) {
    		INSTANCE= new BeanScope();
    	}
  
		return INSTANCE;
    	
    }
   

}
