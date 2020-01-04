package com.nt.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.sql.DataSource;
import com.nt.bo.CustomerBO;

public class CustomerDAOImpl implements CustomerDAO {
	
	private static final String INSERT_QUERY="INSERT INTO CUSTOMER_DETAILS VALUES(?,?,?,?)";
    	private DataSource ds;
	
	public CustomerDAOImpl(DataSource ds) {
		this.ds=ds;
	}
	public int insert(CustomerBO bo) throws SQLException,Exception {
		int cno=0;
		String cname=null;;
		float interest=0;
		float tAmt=0;
		PreparedStatement ps=null;
		Connection con=null;
		int result=0;
		//get values from dto
		cno=bo.getCustNo();
		cname=bo.getCustName();
		interest=bo.getInterest();
		tAmt=bo.getTotalAmount();
		
		
		//make connection
		con=ds.getConnection();
        //create prepared statement
		ps=con.prepareStatement(INSERT_QUERY);
		ps.setInt(1, cno);
		ps.setString(2,cname);
		ps.setFloat(3,interest);
		ps.setFloat(4, tAmt);
		//execute query
		
		result=ps.executeUpdate();
		
		return result;
	}



}
