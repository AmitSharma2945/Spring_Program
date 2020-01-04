package com.nt.beans;

import java.util.Calendar;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

public class Persons {
	
	public void eating() {
	System.out.println("Persons.eating()");
	}
	
	public void dansing() {
		System.out.println("Persons.dansing()");
	}
	
	public void sleping() {
		System.out.println("Persons.sleping()");
	}
	
	public void weakup() {
		System.out.println("Persons.weakup()");
	}
	
	public void travlingUK() {
		System.out.println("Persons.travlingUK()");
       XmlBeanDefinitionReader reader=null;
       DefaultListableBeanFactory factory=null;
       UKVisa visa=null;
       
       factory=new DefaultListableBeanFactory();
      reader.loadBeanDefinitions("com/nt/cfgs/applicationContext.xml");
      visa=factory.getBean("visa",UKVisa.class);
   	  System.out.println(visa);
   	  visa.isApprovedVisaUK(); 
       
	}
	

}
