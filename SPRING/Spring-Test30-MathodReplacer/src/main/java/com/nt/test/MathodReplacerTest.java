package com.nt.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.beans.BankService;

public class MathodReplacerTest {
	
	public  static void main(String[] args) {
		ApplicationContext ctx=null;
		BankService bank=null;
		
		//container create 
		ctx=new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");
		bank=ctx.getBean("bankService", BankService.class);
		System.out.println(bank.getClass());
		System.out.println("bankService.."+bank.calcIntrAmt(1000, 5, 365));
		
		
	}

}
