package com.nt.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.beans.AadharDetails;

public class ClientTest {

	public static void main(String[] args) {
         ApplicationContext ctx=null;
         AadharDetails details=null;
         
         ctx=new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");
         //get bean
         details=ctx.getBean("details",AadharDetails.class);
         System.out.println("Aadhar"+details);
		 
		
		
	}

}
