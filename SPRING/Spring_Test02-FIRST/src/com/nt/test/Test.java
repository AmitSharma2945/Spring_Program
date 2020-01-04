package com.nt.test;

import java.lang.reflect.Constructor;

import com.nt.dao.First;

public class Test {
	public static void main(String[] args) {
	Class c1=null,c2=null;
    Object obj1=null,obj2=null,obj3=null;
	Constructor cons[]=null;
    try {
    	
    //load java class at runtime
    c1=Class.forName(args[0]);	
    //create object
	obj1=c1.newInstance();
    System.out.println(obj1.toString());
       
    c2=Class.forName(args[1]);	
    obj2=c2.newInstance();
    System.out.println(obj2.toString());
    First f1=(First)obj2;
          f1.disp("amit");
    System.out.println("................");
          
     cons=c2.getDeclaredConstructors();
     obj3=cons[0].newInstance(100);
     System.out.println(obj3.toString());
     System.out.println("................");      
    
	}//try
    
    catch (Exception e) {
	     e.printStackTrace();
    }
	
   }
}
