package com.nt.test;

import java.util.List;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.nt.controller.MainController;
import com.nt.dto.BankDTO;

public class XmlBeanFactoryNested {

	public static void main(String[] args){
		XmlBeanFactory pfactory=null,cfactory=null;
		
		MainController mainc=null;
		List<BankDTO> listdto=null;
		//get parent container
		pfactory=new XmlBeanFactory(new ClassPathResource("com/nt/cfgs/buisness-bean.xml"));
		
		cfactory=new XmlBeanFactory(new ClassPathResource("com/nt/cfgs/presentation-beans.xml"),pfactory);
		try {
		mainc=cfactory.getBean("mainC",MainController.class);
		System.out.println(mainc);
		listdto=mainc.fetchAllBanks(new String[]{"Ameerpet","indore"});
		listdto.forEach(li->{
			System.out.println(li);
		});
		}
		catch(Exception e){
			System.out.println("Internal problemm");
			e.printStackTrace();
			
		}//catch
	}//main

}//class
