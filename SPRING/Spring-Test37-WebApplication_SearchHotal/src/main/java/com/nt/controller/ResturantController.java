package com.nt.controller;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.service.ResturantService;

public class ResturantController extends HttpServlet {
	ApplicationContext ctx;
	ResturantService service;

	@Override
	public void init() throws ServletException {
		ctx = new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");
		service = (ResturantService) ctx.getBean("service");
	}

	@Override
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		RequestDispatcher rd = null;

		// read from data
		String locations[] = req.getParameterValues("location");
		// use serive
		List<Map<String, Object>> list = service.ResturantSearch(locations);
		// keep result
		req.setAttribute("result", list);
		// forword the request
		rd = req.getRequestDispatcher("/Result.jsp");
		rd.forward(req, res);
	}

	@Override
	public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(req, res);
	}
}
