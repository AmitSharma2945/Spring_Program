package com.nt.controller;

import java.io.IOException;
import java.util.Date;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.dto.EmployeeDTO;
import com.nt.dto.StudentDTO;
import com.nt.service.NITServiceImple;



public class BeanPostProcescontroller  extends HttpServlet{
    
	ApplicationContext ctx;
    private NITServiceImple niservice;
    public BeanPostProcescontroller() {
		System.out.println("BeanPostProcescontroller.BeanPostProcescontroller()");
	}
    
    
	public void init() throws ServletException {
    ctx=new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");
	  niservice=ctx.getBean("service",NITServiceImple.class); 
		
    }
	@Override
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
	    EmployeeDTO edto=new EmployeeDTO(); 
	    StudentDTO sdto=new StudentDTO();
	    RequestDispatcher rd=null;
	    
		String vals1=req.getParameter("s1");  
      if(vals1.equalsIgnoreCase("StudentRegistration")) {
    	//get the data form 
    	  sdto.setId(Integer.parseInt(req.getParameter("id")));
    	  sdto.setName(req.getParameter("name"));
    	  sdto.setAddrs(req.getParameter("addrs"));
    	  sdto.setCourse(req.getParameter("course"));
    	  sdto.setQlfy(req.getParameter("qlfy"));
 
    	  String result=niservice.ProcessStudeent(sdto);
    	  req.setAttribute("resMsg",result);
    	   
    	  rd=req.getRequestDispatcher("result.jsp");
          rd.forward(req, res);
       
      }
      else {
    	//get the data form 
    	  edto.setId(Integer.parseInt(req.getParameter("id")));
    	  edto.setName(req.getParameter("name"));
    	  edto.setAddrs(req.getParameter("addrs"));
    	  edto.setJob(req.getParameter("job"));
    	  edto.setSalary(Integer.parseInt(req.getParameter("salary")));
          edto.setExp(Integer.parseInt(req.getParameter("exp")));
    	  
          System.out.println("EmployeeDetails"+edto);

          String result=niservice.ProcessEmployee(edto);
    	  
          req.setAttribute("resMsg",result);
          rd=req.getRequestDispatcher("result.jsp");
          rd.forward(req, res);
          
      }
	
	}
	
	@Override
	public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
	  doGet(req, res);
	
	}
	
}
