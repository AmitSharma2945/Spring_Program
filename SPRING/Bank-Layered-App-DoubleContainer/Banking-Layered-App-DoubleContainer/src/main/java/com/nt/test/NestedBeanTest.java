package com.nt.test;

import java.util.List;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import com.nt.controller.MainController;
import com.nt.dto.BankDTO;

public class NestedBeanTest {

	public static void main(String[] args){
		DefaultListableBeanFactory pfactory=null,cfactory=null;
		XmlBeanDefinitionReader preader=null,creader=null;
		MainController mainc=null;
		List<BankDTO> listdto=null;
		
		
		//get ioc contailner
		pfactory=new DefaultListableBeanFactory();
		preader=new XmlBeanDefinitionReader(pfactory);
		preader.loadBeanDefinitions("com/nt/cfgs/buisness-bean.xml");
		
		cfactory=new DefaultListableBeanFactory(pfactory);
		creader=new XmlBeanDefinitionReader(cfactory);
		creader.loadBeanDefinitions("com/nt/cfgs/presentation-beans.xml");
		
		
	
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
