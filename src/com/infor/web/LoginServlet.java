package com.infor.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class LoginServlet extends GenericServlet {

	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		super.destroy();
		System.out.println("---calling destroy---");
	}

	@Override
	public void init() throws ServletException {
		// TODO Auto-generated method stub
		super.init();
		System.out.println("---calling init function---");
	}

	@Override
	public void service(ServletRequest request, ServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("successfully running the web applications");

	      String USERNAME= request.getParameter("Text1");
	      String PASSWORD= request.getParameter("Password2");
	      RequestDispatcher reqdes = null;
	      if(USERNAME.equals("akhil") && PASSWORD.equals("asdfghjkl"))
	      {
	    	  reqdes = request.getRequestDispatcher("department");  //department?action=get_all got get all departments
	    	  reqdes.forward(request, response);
	      }
	      else
	      {
	    	  PrintWriter writer = response.getWriter();
	    	  writer.println("<h1>unsuccessful login!!!Please try again!!!</h1>");
	    	  reqdes = request.getRequestDispatcher("Login.html");
	    	  reqdes.include(request, response);
	      }
	}
}
