package com.nt.test;

import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import com.nt.beans.EnngCourse;

public class CollectionMergingTest01 {
	
	public static void main(String[] args) {
		DefaultListableBeanFactory factory=null;  
		XmlBeanDefinitionReader reader=null;
		EnngCourse engg=null;
		
		factory=new DefaultListableBeanFactory();
		reader=new XmlBeanDefinitionReader(factory);
		
	reader.loadBeanDefinitions("com/nt/cfgs/applicationContext.xml");
	engg=factory.getBean("CSEst1Year",EnngCourse.class);
	System.out.println(engg);
		
		
		
		
		
	}

}
