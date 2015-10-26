package com.infor.web;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class RegistrationServlet extends HttpServlet {
	@Override
	public void doPost(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException {
		String email = request.getParameter("email");
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		//RequestDispatcher requestDispatcher = null;
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			String url = "jdbc:oracle:thin:@inhydaghatiki1.infor.com:1521:payroll";
			String dbusername = "akhil";
			String dbpassword = "akhil";
			Connection connection = DriverManager.getConnection(url, dbusername, dbpassword);
			PreparedStatement ps=connection.prepareStatement(  
					"insert into user12 values(SEQ_USER_ID.NEXTVAL,?,?,?)");  
					  
					ps.setString(1,username);  
					ps.setString(2,password);  
					ps.setString(3,email);  
					          
					int i=ps.executeUpdate();  
					if(i>0)  
						out.print("You are successfully registered...");  
					      
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		doPost(req, resp);
	}
	
}
	

