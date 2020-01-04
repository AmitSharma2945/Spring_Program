package com.nt.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.nt.service.EmployeeService;

public class EmployeeTest {

	public static void main(String[] args) throws Exception {
		ApplicationContext ctx = null;
		EmployeeService service = null;

		ctx = new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");
		service = ctx.getBean("service", EmployeeService.class);
		service.registerEmp(1014, "gopal", "manager", 55555, "gopal@gmail");
		System.out.println(service.showSalary(102));
		System.out.println(service.getAllEmpDetails());
		System.out.println(service.fireEmp(102 ));
		System.out.println(service.hikeSalary(1015));
		System.out.println(service.getEmpDetails(1011));

	}

}
