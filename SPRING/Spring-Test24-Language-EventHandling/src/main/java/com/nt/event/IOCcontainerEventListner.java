package com.nt.event;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;

public class IOCcontainerEventListner implements ApplicationListener{
    private long start,end;
	 
	@Override
	public void onApplicationEvent(ApplicationEvent ae) {
	if(ae.toString().indexOf("Refreshed")!=-1) {
		start=System.currentTimeMillis();
	  System.out.println("IOCcontainerEventListner.....START");	
			
	}
	else {
		System.out.println("IOCcontainerEventListner...END");
		end=System.currentTimeMillis();
		System.out.println("container acting time.."+(end-start)+"..ms");
	}
		
	}//method	
}//class
