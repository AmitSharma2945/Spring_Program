package com.nt.test;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import com.nt.single.BeanScope;
import com.nt.single.Traveling;

public class ClientApp {

	
	public static void main(String[] args) {
	    BeanScope st=null;
	    Traveling tr=null;
	    
		XmlBeanDefinitionReader reader=null;
		DefaultListableBeanFactory factory=null;
		
		factory=new DefaultListableBeanFactory();
		reader= new XmlBeanDefinitionReader(factory);
		reader.loadBeanDefinitions("com/nt/cfgs/applicationContext.xml");
	
		st=factory.getBean("st",BeanScope.class);
        System.out.println(".."+st);		
		
        tr=factory.getBean("tr",Traveling.class);
        System.out.println(".."+tr );		
        
	}

}
