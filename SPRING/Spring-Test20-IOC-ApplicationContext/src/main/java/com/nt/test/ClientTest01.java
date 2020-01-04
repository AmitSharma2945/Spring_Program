package com.nt.test;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import com.nt.beans.TourPlane;
import com.nt.beans.TravelAgent;

public class ClientTest01 {

	public static void main(String[] args) {
		TourPlane tp = null, tp2 = null,tp3=null;

		XmlBeanDefinitionReader reader = null;
		DefaultListableBeanFactory factory = null;

		factory = new DefaultListableBeanFactory();
		reader = new XmlBeanDefinitionReader(factory);
		reader.loadBeanDefinitions("com/nt/cfgs/applicationContext.xml");

		tp = factory.getBean("tp", TourPlane.class);
		System.out.println(tp);
		System.out.println("....................");

		tp2 = factory.getBean("tp2", TourPlane.class);
		System.out.println(tp2);
		System.out.println("....................");

		tp3 = factory.getBean("tp3", TourPlane.class);
		System.out.println(tp3);
		System.out.println("....................");

		
		TravelAgent agent=factory.getBean("agent",TravelAgent.class);
		System.out.println(agent);
		  
		 
	}

}
