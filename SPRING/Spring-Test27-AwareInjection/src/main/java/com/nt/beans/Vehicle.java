package com.nt.beans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Vehicle{
	ApplicationContext ctx;
    
	private String beanid;
		
	public void setCtx(ApplicationContext ctx) {
  System.out.println("ApplicationContext Container");
		this.ctx = ctx;
	}

	public Vehicle(String beanid) {
	System.out.println("Vehicle.1-param Constructor()");
	this.beanid = beanid;
	}

	public void entertainment() {
    System.out.println("Vehicle.entertainment()");
	}
	
    public void journey(String start, String end) {
     Engine engg=null;
     engg=new Engine();
     
     ctx=new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");
     engg=ctx.getBean("engg",Engine.class);
     engg.start();
     System.out.println("Vichels start Journey"+start);
     engg.end();
     System.out.println("Vichels End Journey"+end);
    }
	

}
