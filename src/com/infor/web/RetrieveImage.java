package com.infor.web;
import java.sql.*;
import java.io.*;

public class RetrieveImage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{  
			Class.forName("oracle.jdbc.driver.OracleDriver");  
			String url = "jdbc:oracle:thin:@inhydaghatiki1.infor.com:1521:payroll";
			String dbusername = "akhil";
			String dbpassword = "akhil";
			Connection con=DriverManager.getConnection(url,dbusername,dbpassword);  
			      
			PreparedStatement ps=con.prepareStatement("select * from user12");  
			ResultSet rs=ps.executeQuery();  
			if(rs.next()){
			              
			Blob b=rs.getBlob(5);
			byte barr[]=b.getBytes(1,(int)b.length());  
			              
			FileOutputStream fout=new FileOutputStream("C:/Users/aghatiki/Desktop/payroll/FCBNew.jpg");  
			fout.write(barr);  
			              
			fout.close();  
			}
			System.out.println("ok");  
			              
			con.close();  
			}catch (Exception e) {e.printStackTrace();  }  
			}  

	}
