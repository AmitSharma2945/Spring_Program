package com.nt.test;

import java.sql.SQLException;
import java.util.Scanner;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.nt.controller.MainController;
import com.nt.vo.CustomerVO;

public class RealtimeDITest01 {
	public static void main(String[] args) {

		String cno=null;
		String cname=null;
		String pAmt=null;
		String pRate=null;
		String pTime=null;
		BeanFactory factory=null;
		ClassPathResource res=null;
		String result=null;
		//get values from end user
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Customer Number..");
		cno=sc.next();
		System.out.println("Enter Customer Name...");
		cname=sc.next();
		System.out.println("Enter Customer Amount...");
		pAmt=sc.next();
		System.out.println("Enter Customer Rate...");
		pRate=sc.next();
		System.out.println("Enter Customer Time...");
		pTime=sc.next();
		
		
		try {
			
		CustomerVO vo=new CustomerVO();
		
		vo.setCustNo(cno);
		vo.setCustName(cname);
		vo.setRateOfAmount(pRate);
		vo.setCustAmount(pAmt);
		vo.setTime(pTime);
		
		
		 res=new ClassPathResource("com/nt/cfg/applicationContext.xml");
		 //get bean Factory obj
		
		 factory=new XmlBeanFactory(res);
		 MainController controller=factory.getBean("controller",MainController.class);
		 result=controller.processInterest(vo);
		 System.out.println(result);
		}
		catch(SQLException se) {
			se.printStackTrace();
		}
		catch(Exception e) {
			e.printStackTrace();
			System.out.println("internal Problemm ");
		}
	}



}
