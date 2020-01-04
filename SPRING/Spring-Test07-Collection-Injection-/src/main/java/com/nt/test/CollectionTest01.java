package com.nt.test;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.nt.beans.Courses;
import com.nt.beans.FruitStore;
import com.nt.beans.Student;
import com.nt.beans.UserInfo;

public class CollectionTest01 {
	
public static void main(String[] args) {
	Student st=null;
    XmlBeanFactory factory=null;
    ClassPathResource res=null;
    Courses cs=null;
    UserInfo user=null; 
    FruitStore fruit=null;    
    
    res=new ClassPathResource("com/nt/cfgs/applicationContext.xml");
    factory= new XmlBeanFactory(res);
    
    st=factory.getBean("st",Student.class);
    System.out.println(st);
    System.out.println("....................");
    
    cs=factory.getBean("sub",Courses.class);
    System.out.println(cs);
    System.out.println("....................");    
    
    user=factory.getBean("ph",UserInfo.class);
    System.out.println(user);
    System.out.println("....................");
    
    fruit=factory.getBean("fs",FruitStore.class);
    System.out.println(fruit);
    System.out.println("....................");
    
    
    
}

}
