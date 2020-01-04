package com.nt.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

import com.nt.beans.Flipkart;

public class LooselyCuplingTest {

	public static void main(String[] args) {
   
		BeanFactory factory;
		FileSystemResource res = null;
		
	 res=new FileSystemResource("src/com/nt/cfgs/applictionContext.xml");
		
		factory=new XmlBeanFactory(res);
		
		Flipkart bean=factory.getBean("fpk",Flipkart.class);
		
		String billamt=bean.Shopping(new String[]{"shirt","mobile","books"},
		                              new float[]{55.0f,88.0f,555.9f});
	 	System.out.println(billamt);		
	
	}//main

}//class
