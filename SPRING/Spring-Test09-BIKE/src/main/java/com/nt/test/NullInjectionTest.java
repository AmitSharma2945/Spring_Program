package com.nt.test;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import com.nt.beans.PersonProfile;

public class NullInjectionTest {

public static void main(String[] args) {
	
XmlBeanFactory factory = null;
PersonProfile  nul=null;
ClassPathResource res=null;

    res=new ClassPathResource("com/nt/cfgs/applicationContext.xml");
    factory= new XmlBeanFactory(res); 
    nul=factory.getBean("ph",PersonProfile.class);
     System.out.println(nul);
  } 
}

