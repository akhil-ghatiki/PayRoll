package com.infor.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class DetailsServlets extends GenericServlet {
	String FirstName;
	String LastName;
	String Gender;
	String age;
	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		super.destroy();
	}
	@Override
	public void init() throws ServletException {
		// TODO Auto-generated method stub
		super.init();
	}
	@Override
	//public void service(ServletRequest request, ServletResponse response)
		//	throws ServletException, IOException {
		// TODO Auto-generated method stub
		/*System.out.println("successfully running the web applications");

	      String USERNAME= request.getParameter("T ext1");
	      String PASSWORD= request.getParameter("Password2");
	      RequestDispatcher reqdes = null;
	      if(USERNAME.equals("akhil") && PASSWORD.equals("asdfghjkl"))
	      {
	    	  FirstName = request.getParameter("Text1");
	    	  LastName = request.getParameter("Text2");
	    	  age = request.getParameter("Text3");
	    	  Gender = request.getParameter("Text4");
	    	  
	    	  
	    	  reqdes = request.getRequestDispatcher("welcome.html");
	    	  reqdes.forward(request, response);
	    	  PrintWriter writer = response.getWriter();
	    	  writer.println("<h1>First Name : "+ FirstName +"</h1>");
	    	  writer.println("<h2>Last Name : "+ LastName +"</h2>");
	    	  writer.println("<h3>age : "+ age +"</h3>");
	    	  writer.println("<h4>Gender : "+ Gender+"</h4>");
	    	  reqdes = request.getRequestDispatcher("details.html");
	    	  reqdes.forward(request, response);
	    	  
	    	  
	      }
	      else
	      {
	    	  PrintWriter writer = response.getWriter();
	    	  writer.println("<h1>unsuccessful login!!!Please try again!!!</h1>");
	    	  reqdes = request.getRequestDispatcher("Login.html");
	    	  reqdes.include(request, response);
	      }
}*/
	public void service(ServletRequest request, ServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("successfully running the web applications");

	      String USERNAME= request.getParameter("Text1");
	      String PASSWORD= request.getParameter("Password2");
	      RequestDispatcher reqdes = null;
	     // reqdes = request.getRequestDispatcher("details.html");
    	  //reqdes.forward(request, response);
    	  FirstName = request.getParameter("Text1");
    	  LastName = request.getParameter("Text2");
    	  age = request.getParameter("Text3");
    	  Gender = request.getParameter("Text4");
    	  PrintWriter writer = response.getWriter();
    	  writer.println("<h1>First Name : "+ FirstName +"</h1>");
    	  writer.println("<h2>Last Name : "+ LastName +"</h2>");
    	  writer.println("<h3>age : "+ age +"</h3>");
    	  writer.println("<h4>Gender : "+ Gender+"</h4>");
	}
	

}
