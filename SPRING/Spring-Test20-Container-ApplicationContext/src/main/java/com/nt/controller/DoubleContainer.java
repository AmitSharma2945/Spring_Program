package com.nt.controller;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import com.nt.beans.India;

public class DoubleContainer {

	public static void main(String[] args) {
	   DefaultListableBeanFactory factory=null;
	   XmlBeanDefinitionReader reader=null;
	   India india=null;
	   
	   factory=new DefaultListableBeanFactory();
	   reader=new XmlBeanDefinitionReader(factory);
	    reader.loadBeanDefinitions("com/nt/cfgs/applicationContext.xml");
	    india=factory.getBean("India",India.class);
	    System.out.println(india);
	    	
	}

}
