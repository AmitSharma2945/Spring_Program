package com.nt.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.beans.ServletContainer;

public class DependencyLookup {

	public static void main(String[] args) {
	   ApplicationContext ctx=null;
	   ServletContainer sc=null;
	   
	   sc=new ServletContainer();
	   ctx=new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");
	   sc=ctx.getBean("container",ServletContainer.class);
	   sc.ProcessRequest("hello"); 		
	   sc.ProcessRequest("hai"); 		
	   	}

}
