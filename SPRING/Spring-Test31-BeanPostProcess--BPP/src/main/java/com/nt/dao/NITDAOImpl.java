package com.nt.dao;

import com.nt.bo.EmployeeBo;
import com.nt.bo.StudentBO;

public class NITDAOImpl implements NITDAO {

	@Override
	public int StudentRegister(StudentBO bo) {
        System.out.println("StudentRegister(--)");
        return 1;
	}

	@Override
	public int EmployeeRegister(EmployeeBo bo) {
	System.out.println("EmployeeRegister(--)");
		return 1;
	}

}
