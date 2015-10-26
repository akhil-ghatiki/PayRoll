package com.infor.web;

import java.io.FileInputStream;
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

public class UploadServlet extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		super.doGet(request, response);
		doPost(request,response);
	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		String fileloc = request.getParameter("file");
		String emailNew = request.getParameter("emailNew");
		//RequestDispatcher requestDispatcher = null;
		response.setContentType("text/html");
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			String url = "jdbc:oracle:thin:@inhydaghatiki1.infor.com:1521:payroll";
			String dbusername = "akhil";
			String dbpassword = "akhil";
			Connection connection = DriverManager.getConnection(url, dbusername, dbpassword);
			PreparedStatement ps=connection.prepareStatement("update user12 set image=? where email=?");
			
			FileInputStream fin=new FileInputStream(fileloc);  
			ps.setBinaryStream(1,fin,fin.available()); 
			ps.setString(2,emailNew);
			ps.executeUpdate();  
			//System.out.println(i+" records affected");  */
		}
		catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}}

}
