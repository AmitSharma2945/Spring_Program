package com.nt.test;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import com.nt.beans.Persons;

public class PersonsTest {

	public static void main(String[] args) {
	
		DefaultListableBeanFactory factory=null;  
		XmlBeanDefinitionReader reader=null;
		Persons per=null;
			
		factory=new DefaultListableBeanFactory();
		reader=new XmlBeanDefinitionReader(factory);
			
		reader.loadBeanDefinitions("com/nt/cfgs/applicationContext.xml");
		per=factory.getBean("per",Persons.class);
		per.eating();
		per.dansing();
		per.weakup();
		
	}
}
