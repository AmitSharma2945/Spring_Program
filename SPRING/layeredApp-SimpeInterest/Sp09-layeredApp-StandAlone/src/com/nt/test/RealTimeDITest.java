package com.nt.test;

import java.sql.SQLException;
import java.util.Scanner;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.nt.controller.MainController;
import com.nt.vo.CustomerSIntrestVO;

public class RealTimeDITest {

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
		System.out.println("enter Customer Number");
		cno=sc.next();
		System.out.println("enter Customer Name");
		cname=sc.next();
		System.out.println("enter AMount to given Customer");
		pAmt=sc.next();
		System.out.println("enter Rate to given Customer");
		pRate=sc.next();
		System.out.println("enter Time to given Customer");
		pTime=sc.next();
		
		
		try {
		CustomerSIntrestVO vo=new CustomerSIntrestVO();
		
		vo.setCustNo(cno);
		vo.setCustName(cname);
		vo.setRateOfAmount(pRate);
		vo.setPAmount(pAmt);
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
