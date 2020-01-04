package com.nt.test;

import java.util.Calendar;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

public class ClientApp {

	public static void main(String[] args) {
	    Calendar cal=null;
		Class c1=null;
		String c2=null,sb=null,c4=null,c5=null;
		
		XmlBeanDefinitionReader reader=null;
		DefaultListableBeanFactory factory=null;
		
		factory=new DefaultListableBeanFactory();
		reader= new XmlBeanDefinitionReader(factory);
		reader.loadBeanDefinitions("com/nt/cfgs/applicationContext.xml");
	
		c1=factory.getBean("c1",Class.class);
		System.out.println("Class.."+c1.getClass()+".."+c1.toString());
		System.out.println(".................");
		
		cal=factory.getBean("cal",Calendar.class);
		System.out.println("All date"+cal.getClass()+".."+cal.toString());
		System.out.println(".................");
		
		
		c2=factory.getBean("c2",String.class);
		System.out.println("String.."+c2.getClass()+".."+c2.toString());
		System.out.println(".................");
		
		sb=factory.getBean("sb",String.class);
		System.out.println("String.."+sb.getClass()+".."+sb.toString());
		System.out.println(".................");
		
		c4=factory.getBean("c4",String.class);
		System.out.println("String.."+c4.getClass()+".."+c4.toString());
		System.out.println(".................");
		
		c5=factory.getBean("c5",String.class);
		System.out.println("String.."+c5.getClass()+".."+c5.toString());
		System.out.println(".................");
		
	}

}
