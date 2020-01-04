package com.nt.dao;

import java.sql.SQLException;

import com.nt.bo.EmployeeBO;

public interface EmployeeDAO {
	
	public int insert(EmployeeBO bo)throws Exception ,SQLException;

}
