package com.infor.web;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.naming.ldap.Rdn;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginServlet2 extends HttpServlet {

	  protected void doPost(HttpServletRequest request, HttpServletResponse response)
	            throws ServletException, IOException {
	        response.setContentType("text/html;charset=UTF-8");
	        PrintWriter out = response.getWriter();
	        RequestDispatcher requestDispatcher = null;
	        String email = request.getParameter("email");
	        String password = request.getParameter("password");
	        if(validate(email,password)){
	        	requestDispatcher = request.getRequestDispatcher("Upload.html");
	        	requestDispatcher.forward(request,response);
	        	request.setAttribute("email",email);
	        }
	        else{
	        	out.write("Invalid Email/Password");
	        	requestDispatcher = request.getRequestDispatcher("index.html");
				requestDispatcher.include(request, response);
	        }
	        
	        
	    }

	private boolean validate(String email, String password) {
		boolean success = false;
		ResultSet rs = null;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			String url = "jdbc:oracle:thin:@inhydaghatiki1.infor.com:1521:payroll";
			String dbusername = "akhil";
			String dbpassword = "akhil";
			Connection connection = DriverManager.getConnection(url, dbusername, dbpassword);
			PreparedStatement preparedStatement =  connection.prepareStatement("select count(*) as totalUsers from user12 where email =? and password = ?");
			preparedStatement.setString(1,email);
			preparedStatement.setString(2,password);
			rs = preparedStatement.executeQuery();
			rs.next();
			if(rs.getInt("totalUsers") == 1){
				
				success = true;
			}
		
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	return success;
	}  
	
}
