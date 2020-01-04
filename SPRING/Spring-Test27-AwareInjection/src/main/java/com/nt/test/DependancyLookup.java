package com.nt.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.beans.Vehicle;

public class DependancyLookup {
	public static void main(String[] args) {
		ApplicationContext ctx=null;
		Vehicle bike=new Vehicle("bike");
		ctx=new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");
		bike=ctx.getBean("bike" ,Vehicle.class);
		bike.entertainment();
		bike.journey("hyd","goa");
	}

}
