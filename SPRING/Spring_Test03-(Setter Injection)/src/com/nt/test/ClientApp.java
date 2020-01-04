package com.nt.test;

import com.nt.beans.WishGenerator;

public class ClientApp {

	public static void main(String[] args) {
		System.out.println("ClientApp.main()");
		
		FileSystemResource res=new 
     
	  FileSystemResource("src/com/nt/cfgs/applicationContext.xml");				

	   //active Bean Factory
		XmlBeanFactory factory=new XmlBeanFactory(res);
      //get bean class obj
		//wish genrator
	    //WishGenerator bean=(WishGenerator)factory.getBean("wsg");
	   WishGenerator bean=(WishGenerator)factory.getBean("wsg",WishGenerator.class);
	
	//call b.methode
		String result=bean.generatorWishMsg();
		System.out.println(result);
	
	}
}
