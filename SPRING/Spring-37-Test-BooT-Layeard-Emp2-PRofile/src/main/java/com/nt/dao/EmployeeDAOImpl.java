package com.nt.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Repository;

import com.nt.bo.EmployeeBO;

@Repository("dao")
@Profile(value = {"prod","dev"})
public class EmployeeDAOImpl implements EmployeeDAO{
	
	private static final String EMPLOYEE_TABLE="INSERT INTO EMPLOYEE_TABLE VALUES (?,?,?,?,?,?)"; 
	
	@Autowired
	private DataSource ds;
	
	
	public int insert(EmployeeBO bo) throws Exception {
		 Connection con=null;
		 PreparedStatement ps=null;
	     int result=0;
	     int empNo;
		 String empName;
		 String empAddrs;
		 float basicsalary;
	     float grosSalary;
	     float netSalary;
	     //values Dto 
	     
	     empNo=bo.getEmpNo();
	     empName=bo.getEmpName();
	     empAddrs=bo.getEmpAddrs();
         basicsalary=bo.getBasicsalary();
         grosSalary=bo.getBasicsalary()+(bo.getBasicsalary());
         netSalary=bo.getBasicsalary()*(bo.getBasicsalary());
	    
	    //jdbc connection
        con=ds.getConnection();		
		//prepeard statement
         ps=con.prepareStatement(EMPLOYEE_TABLE);
     	  System.out.println("DataSource"+ds.getClass());
         ps.setInt(1,empNo);
         ps.setString(2,empName);
         ps.setString(3,empAddrs);
         ps.setFloat(4,basicsalary);
         ps.setFloat(5,grosSalary);
         ps.setFloat(6,netSalary);
            
        result=ps.executeUpdate();    
		return result;
	}
}
