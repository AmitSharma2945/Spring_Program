package com.nt.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import com.nt.bo.EmployeeBO;

public class EmployeeDAOImpl implements EmployeeDAO {
          
	private DataSource ds;
		
	public EmployeeDAOImpl(DataSource ds) {
		this.ds = ds;
	}

	public List<EmployeeBO> searchEmpByJob(StringBuffer cond)throws Exception {
         List<EmployeeBO> listBO=null;
         Connection con=null;
         ResultSet rs=null;	 	
		 PreparedStatement ps=null;
          
		  try {
		   //ds connection
		   con=ds.getConnection();
		   //create prepeard statement
		   ps=con.prepareStatement("SELECT EID,ENAME,JOB,SALARY,EMAIL FROM EMPLOYEEHQL WHERE JOB IN('MANAGER','TEA')");
		   //resultset
		   rs=ps.executeQuery();
		 //copy result obj to list bo class object
		   listBO=new ArrayList();
		while(rs.next()) {
		//result object copy bo object
		EmployeeBO bo=new EmployeeBO();
		bo.setEid(rs.getInt(1));
		bo.setEname(rs.getString(2));
		bo.setJob(rs.getNString(3));
		bo.setSalary(rs.getFloat(4));
		bo.setEmail(rs.getString(5));
		//each bo class obj list collection
		listBO.add(bo);	
		System.out.println("dao======"+listBO);
		}//while
		     
		}//try 
		catch (SQLException se) {
			   throw se;
		}
         finally {
				if(rs!=null) { 
				rs.close();
				}
				if(ps!=null) { 
					ps.close();
				}
				if(con!=null) { 
					con.close();
				}		
		}
		return listBO;
	}
}
