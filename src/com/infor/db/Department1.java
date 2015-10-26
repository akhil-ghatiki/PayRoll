package com.infor.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import com.infor.data.Department;
import com.infor.util.ConnectionUtil;

public class Department1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Long> l = new ArrayList<Long>();
		l.add(new Long(1066));
		l.add(new Long(1067));
		l.add(new Long(1068));
		l.add(new Long(1071));
		Department1 d = new Department1();
		DepartmentDao dao = new DepartmentDao();
		Department dall = new Department(1235, "Dev",
				"Software developement process is implemented in this department");
		Department d1 = new Department("Developement",
				"Software developement process is implemented in this department");
		Department d2 = new Department("Testing",
				"Software testing process is implemented in this department");
		Department d3 = new Department("Debugging",
				"Software degugging process is implemented in this department");

		Set<Department> dept = new HashSet<Department>();
		dept.add(dall);
		dept.add(d1);
		dept.add(d2);
		dept.add(d3);
		System.out.println(dao.CreateDepartment(d1));
		System.out.println(dao.getDepartmentById(1019));
		System.out.println(dao.getDepartmentByName("Developement"));
		System.out.println(dao.getDepartmentsByIds(l));
		System.out.println(dao.getAllDepartments());
		// d.RetrieveDepartment();

	}
	/*
	 * public Connection connection() { Connection conn = null; //Statement stm
	 * = null; String username = "akhil"; String password = "akhil"; String url
	 * = "jdbc:oracle:thin:@inhydaghatiki1.infor.com:1521:payroll"; try {
	 * Class.forName("oracle.jdbc.driver.OracleDriver"); conn =
	 * DriverManager.getConnection(url,username,password); } catch
	 * (ClassNotFoundException e) { // TODO Auto-generated catch block
	 * e.printStackTrace(); } catch (SQLException e) { e.printStackTrace(); }
	 * return conn; }
	 */
	/*
	 * private void CreateDepartment(Set<Department> dept) { Connection conn =
	 * ConnectionUtil.getConnection(); Statement stm = null; for (Department
	 * department : dept) { String name=department.getDept_name(); String
	 * Descrip=department.getDept_desc(); String sql =
	 * "insert into Department values(seq_dept_id.nextval,'"
	 * +name+"','"+Descrip+"')"; try { stm = conn.createStatement(); int rs =
	 * stm.executeUpdate(sql); System.out.println(rs); } catch (SQLException e)
	 * { // TODO Auto-generated catch block e.printStackTrace(); } }
	 * ConnectionUtil.cleanUp(conn, stm, null); }
	 */

	/*
	 * private long CreateDepartment(Department d1) { Inserts a row in
	 * DEPARTMENT with values specified in Department object and returns DEPT_ID
	 * of the row created public Long createDepartment(Department department)
	 * Connection conn = ConnectionUtil.getConnection(); PreparedStatement stm =
	 * null; String name=d1.getDept_name(); String Descrip=d1.getDept_desc();
	 * long deptId = 0; String sql =
	 * "insert into Department values(seq_dept_id.nextval,?,?)"; try { stm =
	 * conn.prepareStatement(sql); stm.setString(1,name);
	 * stm.setString(2,Descrip); int i = stm.executeUpdate();
	 * System.out.println(i); } catch (SQLException e) { // TODO Auto-generated
	 * catch block e.printStackTrace(); }
	 * 
	 * String sql1="select dept_id from department where dept_name = ?"; try {
	 * PreparedStatement stmt = conn.prepareStatement(sql1); stmt.setString(1,
	 * d1.getDept_name()); ResultSet rs = stmt.executeQuery(); while(rs.next())
	 * { deptId = rs.getLong(1); } } catch (SQLException e) { // TODO
	 * Auto-generated catch block e.printStackTrace(); }
	 * ConnectionUtil.cleanUp(conn, stm, null); //System.out.println(deptId);
	 * return deptId;
	 * 
	 * 
	 * }
	 */
	/*
	 * private Department RetrieveDepartment(long ) {
	 * 
	 * Retrieves a row from DEPARTMENT Table with the id specified and returns
	 * Department Object public Department getDepartmentById(Long departmentId)
	 * Connection conn = ConnectionUtil.getConnection(); Statement stm = null;
	 * for (Department department : dept) { String
	 * name=department.getDept_name(); String Descrip=department.getDept_desc();
	 * String sql = "select * from department"; try { stm =
	 * conn.createStatement(); ResultSet rs = stm.executeQuery(sql);
	 * while(rs.next()) { System.out.println(rs.getString(1));
	 * System.out.println(rs.getString(2));
	 * 
	 * } } catch (SQLException e) { // TODO Auto-generated catch block
	 * e.printStackTrace(); } } ConnectionUtil.cleanUp(conn, stm, null); }
	 */
}