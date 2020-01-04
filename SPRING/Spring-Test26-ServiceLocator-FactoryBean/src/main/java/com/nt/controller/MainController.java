package com.nt.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.service.FindScoreService;

public class MainController extends HttpServlet {

	ApplicationContext ctx = null;

	@Override
	public void init() {
		// container
		ctx = new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");

	}

	@Override
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		int mid;
		FindScoreService service = null;
		String scoreCard = null;
		RequestDispatcher rd = null;

		// read mid
		mid = Integer.parseInt(req.getParameter("mid"));
		// get container
		service = ctx.getBean("scoreService", FindScoreService.class);
		// use service
		scoreCard = service.getScore(mid);
		// keep the
		req.setAttribute("scoreCard", scoreCard);
		// use dispather
		rd = req.getRequestDispatcher("/view_score.jsp");
		rd.forward(req, res);
	}

	@Override
	public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {

		doGet(req, res);
	}

	@Override
	public void destroy() {
		((AbstractApplicationContext) ctx).close();

	}

}
