package com.nt.test;

import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import com.nt.controller.MainController;
import com.nt.dto.EmployeeDTO;

public class TestNestedBeanFactories2 {

	public static void main(String[] args) throws Exception {
	   MainController controller=null;
	
	   List<EmployeeDTO> listDTO=null;
		DefaultListableBeanFactory	factory=null;
	    XmlBeanDefinitionReader reader=null;
	    
	    factory=new DefaultListableBeanFactory();
	    reader=new XmlBeanDefinitionReader(factory);
	    reader.loadBeanDefinitions("com/nt/cfgs/applicationContext.xml");
	    
	  controller=factory.getBean("controller",MainController.class);
	     System.out.println("show.."+controller);
		 System.out.println("..................");
	   try { 
	   //inveked mathode
	   listDTO=controller.fetchEmplByjob(new String[]{"manager","tea"});
	   
	   listDTO.forEach(dto->{
		   System.out.println(dto);
	   } );	
	   }//try
	   catch (SQLException e) {
		e.printStackTrace();
	   }
	   catch (Exception e) {
           e.printStackTrace();
	 }
  }//method
}//class