package com.nt.test;

import java.util.Calendar;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import com.nt.single.Singleton;

public class ClientApp {

	public static void main(String[] args) {
	    Singleton st=null,st1=null,st2=null;
		 
		XmlBeanDefinitionReader reader=null;
		DefaultListableBeanFactory factory=null;
		
		factory=new DefaultListableBeanFactory();
		reader= new XmlBeanDefinitionReader(factory);
		reader.loadBeanDefinitions("com/nt/cfgs/applicationContext.xml");
	
		st=factory.getBean("st",Singleton.class);
        System.out.println(".."+st.hashCode());		
		System.out.println("....................");
        
        st1=factory.getBean("st1",Singleton.class);
        System.out.println(".."+st1.hashCode());		
        System.out.println("....................");
        
        st2=factory.getBean("st2",Singleton.class);
        System.out.println(".."+st2.hashCode());		
        
	}

}
