package com.infor.db;

import java.sql.*;

import com.infor.data.Department;

public class DepartmentDB {
	public static void main(String[] args) {
		DepartmentDB db = new DepartmentDB();
		Department dept1 = new Department("Developement",
				"Software developement process id implemented in this department");
		// Department dept2 = new Department(dept_id, dept_name, dept_desc);
		db.CreateDepartment(dept1);
	}

	private void CreateDepartment(Department dept1) {
		String sql;
		String sql2;
		String name = "Testing";
		String Descrip = "Tesing the software product";
		sql = "SELECT Dept_name , Dept_desc from Department";// this is the
																// query
		sql2 = "INSERT into department values(seq_dept_id.nextval,'" + name
				+ "','" + Descrip + "')";
		Connection conn = null;
		Statement stm = null;
		String username = "akhil";
		String password = "akhil";
		String url = "jdbc:oracle:thin:@inhydaghatiki1.infor.com:1521:payroll";
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection(url, username, password);
			stm = conn.createStatement(); // / creating the statement
			int i = stm.executeUpdate(sql2); // / execute update is to insert
												// the new rows i.e., for all
												// the DML statements;
			ResultSet rs = stm.executeQuery(sql);// Result set is for executing
													// the query
			System.out.println(i);

			while (rs.next()) {
				// String name2 = rs.getDept_name(1);
				// String desc = rs.getDept_desc(2);
				String name2 = rs.getString(1);
				String desc = rs.getString(2);
				System.out.println(name2);
				System.out.println(desc);
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}
}

/*
 * finally { try{ if(conn!=null) { conn.close(); } } catch(SQLException e) {
 * e.printStackTrace(); } }
 */

