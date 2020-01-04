package com.nt.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import javax.sql.DataSource;
import com.nt.bo.BankBO;

public class BankDAOImpl implements BankDAO {
   private DataSource ds;
   public BankDAOImpl(DataSource ds) {
		this.ds = ds;
	}

	public List<BankBO> getBankDetails(StringBuffer cond) throws Exception {
		List listbo=null;
		Connection con=null;
		PreparedStatement ps=null;
		ResultSet rs=null;
		BankBO bo=null;
		
		try {
		//get con obj
		con=ds.getConnection();
		System.out.println("dao===="+cond);
		ps=con.prepareStatement("SELECT * FROM BANK_DETAILS WHERE AREA IN"+cond);
		//ps=con.prepareStatement("SELECT * FROM BANK_DETAILS WHERE AREA IN('Ameerpet','sec')");

		//execute the query
		rs=ps.executeQuery();
		listbo=new ArrayList();
		while(rs.next()) {
			bo=new BankBO();
			//copy each record to bo class obj
			bo.setBankid(rs.getInt(1));
			bo.setBankname(rs.getString(2));
			bo.setBranch(rs.getString(3));
			bo.setIfsc(rs.getString(4));
			bo.setManagername(rs.getString(5));
			bo.setArea(rs.getString(6));
			//add list
			listbo.add(bo);
		}
	}//try
     catch(Exception e) {
    	 throw e;
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
		
		
		return listbo;
	}//method

}//class
