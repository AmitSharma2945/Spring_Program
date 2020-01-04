package com.nt.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.beans.WishMessageGenreter;
import com.nt.cfgs.AppConfig;

public class WishTest {

	public static void main(String[] args) {
		ApplicationContext ctx = null;
		WishMessageGenreter wish = null;

		// ioc container
		ctx = new AnnotationConfigApplicationContext(AppConfig.class);
		wish = ctx.getBean("wish",WishMessageGenreter.class);
		System.out.println("wish::" + wish.genrete("raju"));

		//close container
		((AbstractApplicationContext) ctx).close();
	}

}
