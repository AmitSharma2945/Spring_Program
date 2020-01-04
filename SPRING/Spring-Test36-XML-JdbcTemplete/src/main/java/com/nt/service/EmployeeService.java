package com.nt.service;

import java.util.List;
import java.util.Map;

import com.nt.dao.EmployeeDAO;

public class EmployeeService {

	private EmployeeDAO dao;

	public void setDao(EmployeeDAO dao) {
		this.dao = dao;
	}

	public String registerEmp(int eid, String ename, String job, long salary, String email) {
		int result = dao.InsertEmployee(eid, ename, job, salary, email);

		if (result == 0)
			return "Registered Failed Employee";
		else
			return "Employee Registered Succsess";
	}

	public int showSalary(int no) {
		int salary = dao.getSalary(no);
		return salary;
	}

	public String hikeSalary(int no) {
		int salary = showSalary(no);
		int newsal = 0;
		if (salary >= 5000)
			newsal = Math.round(salary + (salary * 0.1f));
		else
			newsal = Math.round(salary + (salary * 0.1f));
		// use Dao
		int sal = dao.UpdateEmpSalary(no, newsal);
		if (sal == 0)

			return "Employee not hiked";
		else
			return "Employee Salary hiked";

	}

	public Map<String, Object> getEmpDetails(int no) throws Exception {
		Map<String, Object> map = dao.listEmpDetails(no);
		if (map != null)
			return map;
		else
			throw new Exception(no + " Emp not found");
	}

	public List<Map<String, Object>> getAllEmpDetails() throws Exception {

		List<Map<String, Object>> list = dao.listAllEmpDetails();
		if (list != null)
			return list;
		else
			throw new Exception("Employees not found");
	}

	public String fireEmp(int eno) {
		int result = dao.deleteEmp(eno);
		if (result == 0)
			return eno + " Employee not found";
		else
			return "Employee deleted";
	}

}
