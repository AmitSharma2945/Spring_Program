package com.nt.controller;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class ControllerTest {

	public static void main(String[] args) {
	  ApplicationContext ac=null;
	  ac=new FileSystemXmlApplicationContext("src/main/java/com/nt/cfgs/applicationContext.xml");
	  
	}

}
