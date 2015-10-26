package com.infor.web;
import java.sql.*;
import java.io.*;


public class InsertImage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{  
			Class.forName("oracle.jdbc.driver.OracleDriver"); 
			String url = "jdbc:oracle:thin:@inhydaghatiki1.infor.com:1521:payroll";
			String dbusername = "akhil";
			String dbpassword = "akhil";
			Connection con=DriverManager.getConnection(url,dbusername,dbpassword);  
			              
			PreparedStatement ps=con.prepareStatement("update user12 set image=? where email='akhil.ghatiki@gmail.com'");   
			FileInputStream fin=new FileInputStream("C:/Users/aghatiki/Desktop/payroll/FCB.jpg");  
			ps.setBinaryStream(1,fin,fin.available());  
			int i=ps.executeUpdate();  
			System.out.println(i+" records affected");  
			          
			con.close();  
			}
		catch (Exception e)
		{
			e.printStackTrace();
		}  
			}  

	}
