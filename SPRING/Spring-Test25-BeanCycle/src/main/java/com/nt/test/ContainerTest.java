package com.nt.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.beans.BeanCycle;

public class ContainerTest {

	public static void main(String[] args) {
	   ApplicationContext ctx=null;
	   BeanCycle bc=null;
	   
	   //container
	   ctx=new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");
	   bc=ctx.getBean("bc",BeanCycle.class);
	   System.out.println("...."+bc.checkVotingEligiblity());
	       
	   ((AbstractApplicationContext) ctx).close();
	   
	}
}
