package com.nt.test;

import java.util.List;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.FileSystemResource;
import com.nt.controller.MainController;
import com.nt.dto.EmployeeDTO;

public class NestedBeanFactories {

	public static void main(String[] args) throws Exception {
	   MainController controller=null;
		List<EmployeeDTO> listDTO=null;
		
		//create parent container
		 BeanFactory pFactory=null;
		 pFactory=new XmlBeanFactory(new FileSystemResource("com/nt/cfgs/business-beans.xml"));
		
		//create chiled container
	    BeanFactory cFactory=null;
	    cFactory=new XmlBeanFactory(new FileSystemResource("com/nt/cfgs/presentation-beans.xml"),pFactory);
				
		//get target Bean class object
	   controller=cFactory.getBean("controller",MainController.class);
	   
	   //inveked mathode
	   listDTO=controller.fetchEmplByjob(new String[]{"manager","tea"});
	    
	   listDTO.forEach(dto->{
		   System.out.println(dto);
	   } );	
  }
}