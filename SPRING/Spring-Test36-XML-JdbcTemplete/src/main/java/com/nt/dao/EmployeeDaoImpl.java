package com.nt.dao;

import java.util.List;
import java.util.Map;

import org.springframework.jdbc.core.JdbcTemplate;

public class EmployeeDaoImpl implements EmployeeDAO {

	private static final String INSERT_QRY = "insert into employeeHQL(eid,ename,job,salary,email)values(?,?,?,?,?)";
	private static final String GET_EMP_SALARY = "select salary from employeeHQl where eid=?";
	private static final String GET_EMP_DETAILS_BY_NO = "select eid,ename,job,salary,email from employeeHQL where eid=?";
	private static final String GET_ALL_EMP_DETAILS = "select eid,ename,job,salary,email from EmployeeHQL";
	private static final String UPDATE_EMP_SALARY = "update employeeHQL set  salary=? where eid=?";
	private static final String DELETE_EMP = "delete from employeeHQL where eid=?";

	private JdbcTemplate jt;

	public void setJt(JdbcTemplate jt) {
		this.jt = jt;
	}

	public int InsertEmployee(int eid, String ename, String job, long salary, String email) {
		int result = jt.update(INSERT_QRY, eid, ename, job, salary, email);
		return result;
	}

	public int getSalary(int no) {
		 int result=jt.update(GET_EMP_SALARY,no);
			return result;
		}


	public Map<String, Object> listEmpDetails(int no) {
		Map<String, Object> map = jt.queryForMap(GET_EMP_DETAILS_BY_NO);
		return map;
	}

	public List<Map<String, Object>> listAllEmpDetails() {
		List<Map<String, Object>> list = jt.queryForList(GET_ALL_EMP_DETAILS);
		return list;
	}

	public int UpdateEmpSalary(int no, int newsal) {
		int result = jt.update(UPDATE_EMP_SALARY, newsal, no);
		return result;
	}

	public int deleteEmp(int no) {
		int result = jt.update(DELETE_EMP, no);
		return result;
	}

}
