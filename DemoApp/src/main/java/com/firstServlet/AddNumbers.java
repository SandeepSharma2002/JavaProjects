package com.firstServlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
//import javax.servlet.http.HttpServlet;

@WebServlet(urlPatterns="/add")
public class AddNumbers implements Servlet{

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		
		int i = Integer.parseInt(req.getParameter("val1"));
		int j = Integer.parseInt(req.getParameter("val2"));
		
		int k = i + j;
		PrintWriter out = res.getWriter();
		out.println("Result is :" + k);
		
	}

	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public ServletConfig getServletConfig() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getServletInfo() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void init(ServletConfig arg0) throws ServletException {
		// TODO Auto-generated method stub
		
	}
	
}
