package com.infor.util;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ConnectionUtil {
	public static Connection getConnection() {
		Connection conn = null;
		// Statement stm = null;
		String username = "akhil";
		String password = "akhil";
		String url = "jdbc:oracle:thin:@inhydaghatiki1.infor.com:1521:payroll";
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection(url, username, password);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return conn;
	}

	public static void cleanUp(Connection connection, Statement statement,
			ResultSet resultSet) {
		Connection conn = connection;
		Statement stm = statement;
		ResultSet rs = resultSet;
		try {
			if (rs != null) {
				conn.close();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		try {
			if (stm != null) {
				stm.close();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		try {
			if (conn != null) {
				conn.close();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
