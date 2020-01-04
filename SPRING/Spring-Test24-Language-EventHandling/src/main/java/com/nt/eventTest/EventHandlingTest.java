package com.nt.eventTest;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EventHandlingTest {

	public static void main(String[] args) {
		ApplicationContext ctx=null;
		
		//container create 
		ctx=new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");
		System.out.println("AC container...."+ctx);
		//close
		((AbstractApplicationContext) ctx).close();
	}

}
