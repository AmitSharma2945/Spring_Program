package com.nt.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.service.NITServiceImple;

public class BeanPostProcescontroller  extends HttpServlet{
    ApplicationContext ctx;
	
    private NITServiceImple service;
    
    
	public void init() throws ServletException {
    ctx=new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");
		
    }
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
      ctx.getBean("service",NITServiceImple.class); 
      
	
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	  
	
	}
	
	@Override
	public void destroy() {
	((AbstractApplicationContext) ctx).close();
	
	}

}
