package com.nt.dao;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.sql.DataSource;

import com.nt.bo.CustomerSIntrestBO;

public final class SimpleIntrestDAOImpl implements SimpleIntrestDAO {

	private static final String INSERT_QUERY="INSERT INTO SI_TABLE VALUES(?,?,?,?)";
	private DataSource ds;
	
	public SimpleIntrestDAOImpl(DataSource ds) {
		this.ds=ds;
	}
	@Override
	public int insert(CustomerSIntrestBO bo) throws SQLException,Exception {
		int cno=0;
		String cname=null;;
		float si=0;
		float tAmt=0;
		PreparedStatement ps=null;
		Connection con=null;
		int result=0;
		//get values from dto
		cno=bo.getCustNo();
		cname=bo.getCustName();
		si=bo.getSimpleIntrest();
		tAmt=bo.getTotalAmount();
		
		
		//make connection
		con=ds.getConnection();
        //create prepared statement
		ps=con.prepareStatement(INSERT_QUERY);
		ps.setInt(1, cno);
		ps.setString(2,cname);
		ps.setFloat(3,si);
		ps.setFloat(4, tAmt);
		//execute query
		result=ps.executeUpdate();
		
		return result;
	}

}
