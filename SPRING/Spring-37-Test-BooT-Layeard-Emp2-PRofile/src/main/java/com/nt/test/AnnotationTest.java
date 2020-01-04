package com.nt.test;

import java.sql.SQLException;
import java.util.Scanner;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Import;

import com.nt.config.AppConfig;
import com.nt.controller.MainController;
import com.nt.vo.EmployeeVO;

@SpringBootApplication
@Import(AppConfig.class)
public class AnnotationTest {

	public static void main(String[] args) {
		String empNo = null;
		String empName = null;
		String addrs = null;
		String basciSalary = null;
		BeanFactory Factory = null;
		String result = null;
		ApplicationContext ctx = null;

		// get values from end user
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Employee empNO..");
		empNo = sc.next();
		System.out.println("Enter Employee Name...");
		empName = sc.next();
		System.out.println("Enter Employee addrs...");
		addrs = sc.next();
		System.out.println("Enter Employee salary...");
		basciSalary = sc.next();

		// get bean Factory obj
		try {

			EmployeeVO vo = new EmployeeVO();
			vo.setEmpid(empNo);
			vo.setEmpName(empName);
			vo.setEmpAddrs(addrs);
			vo.setBasicSalary(basciSalary);

			ctx = SpringApplication.run(AnnotationTest.class, args);
			MainController controller = ctx.getBean("controller", MainController.class);
			result = controller.ProcessEmployee(vo);
			System.out.println(result);

		} catch (SQLException se) {
			se.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("internal Problemm...!!!" + e);
		}
		// close
		((ConfigurableApplicationContext) ctx).close();
	}
}