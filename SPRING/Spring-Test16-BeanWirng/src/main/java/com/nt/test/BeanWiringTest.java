package com.nt.test;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import com.nt.beans.Tournament;
import com.nt.beans.Travling;

public class BeanWiringTest {

public static void main(String[] args) {
    DefaultListableBeanFactory	factory=null;
    XmlBeanDefinitionReader reader=null;
    Tournament event =null;
     Travling  tour=null;	
    
    factory=new DefaultListableBeanFactory();
    reader=new XmlBeanDefinitionReader(factory);
    reader.loadBeanDefinitions("com/nt/cfgs/appllicationContext.xml");
    
     event=factory.getBean("event",Tournament.class);
     System.out.println("Tournament.."+event.hashCode());
	 System.out.println("..................");
     
     tour=factory.getBean("tour",Travling.class);
     System.out.println("Travling.."+tour.hashCode());
     
	
	
	
	
 }	
	
	
	
	
	
}
