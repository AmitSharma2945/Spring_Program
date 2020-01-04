package com.nt.dao;

import java.util.List;
import java.util.Map;

public interface EmployeeDAO {

	public int InsertEmployee(int eid, String ename, String job, long salary, String email);

	public int getSalary(int no);

	public Map<String, Object> listEmpDetails(int no);

	public List<Map<String, Object>> listAllEmpDetails();

	public int UpdateEmpSalary(int no, int newsal);

	public int deleteEmp(int no);

}
