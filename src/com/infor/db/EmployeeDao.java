package com.infor.db;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.infor.data.Department;
import com.infor.data.Employee;
import com.infor.util.ConnectionUtil;

public class EmployeeDao {
	int i;
	public void CreateEmployee(Employee e,Long deptId) {
		/*
		 * Inserts a row in DEPARTMENT with values specified in Department
		 * object and returns DEPT_ID of the row created public Long
		 * createDepartment(Department department)
		 */
		
		Connection conn = ConnectionUtil.getConnection();
		PreparedStatement stat = null;
		String sql = "insert into employee values(SEQ_EMP_ID.NEXTVAL,?,?,?,?,?,?)";
		try {
			stat = conn.prepareStatement(sql);
			stat.setString(1,e.getEmp_fname());
			stat.setString(2,e.getEmp_lname());
			stat.setString(3,e.getEmp_ssn());
			stat.setString(4,e.getEmp_doj());
			stat.setLong(5,e.getEmp_salary());
			stat.setLong(6,deptId);
			i = stat.executeUpdate();
			System.out.println(i);
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}
	public List<Employee> createEmployees(List<Employee> employees, Long departmentId)
	{
	/*Inserts a row in EMPLOYEE with values specified in Employee object and returns EMP_ID of the row created
	public Long createEmployees(List<Employee> employees, Long departmentId)*/
		List<Employee> emps = new ArrayList<Employee>();
		//Connection conn1=ConnectionUtil.getConnection();
		//Statement stm= null;
		long emp_id=0;
		ResultSet rs = null;
		
			Connection conn3 = ConnectionUtil.getConnection();
			PreparedStatement stat = null;
			String sql = "insert into employee values(SEQ_EMP_ID.NEXTVAL,?,?,?,?,?,?)";
			for (Employee employee : employees) {
			try {
				stat = conn3.prepareStatement(sql);
				stat.setString(1,employee.getEmp_fname());
				stat.setString(2,employee.getEmp_lname());
				stat.setString(3,employee.getEmp_ssn());
				stat.setString(4,employee.getEmp_doj());
				stat.setLong(5,employee.getEmp_salary());
				//stat.setLong(6,employee.getDep_id());
				stat.setLong(6,departmentId);
				//stat.executeUpdate();
				int i = stat.executeUpdate();
				System.out.println(i);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
			String sql2 = "select emp_id from employee";

			try {
				stat = conn3.prepareStatement(sql2);
				rs = stat.executeQuery();
				while(rs.next())
				{
					emp_id = rs.getLong(1);
					emps.add(new Employee(emp_id));
					//System.out.println(emp_id);
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			ConnectionUtil.cleanUp(conn3, stat, rs);
			return emps;
			
		
	}
	public Employee getEmployeeById(Long employeeId)
	{
	/*Retrieves a row from EMPLOYEE Table with the id specified and returns EMPLOYEE Object
	public Employee getEmployeeById(Long employeeId)*/
		Employee e = null;
		Long emp_id = 0L;
		Connection conn4 = ConnectionUtil.getConnection();
		PreparedStatement stat = null;
		ResultSet rs = null;
	   	String sqlNew = "select * from employee where emp_id=?";
	   	try {
			stat= conn4.prepareStatement(sqlNew);
			stat.setLong(1,employeeId);
			rs = stat.executeQuery();
			
			while(rs.next())
			{
			e = new Employee(rs.getLong(1), rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getLong(6),rs.getLong(7));
				//emp_id = rs.getLong(1);
			}
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	   	ConnectionUtil.cleanUp(conn4, stat, rs);
	   	return e;
	   	}
	
	public List<Employee> getEmployeesByDepartmentId(Long departmentId)
	{
	/*Retrieves employees from EMPLOYEE Table who are working in a department specified by argument departmentId and returns List of Department Objects
	public List<Employee> getEmployeesByDepartmentId(Long departmentId)*/
		List<Employee> emplist = new ArrayList<Employee>();
		Employee e1 = null;
		Connection conn5 = ConnectionUtil.getConnection();
		PreparedStatement stat = null;
		ResultSet rsNew = null;
		String Sql3 = "select * from employee where dept_id = ?";
			try {
				stat = conn5.prepareStatement(Sql3);
				stat.setLong(1, departmentId);
				rsNew = stat.executeQuery();
				while (rsNew.next()) {
					e1 = new Employee(rsNew.getLong(1),rsNew.getString(2),rsNew.getString(3),rsNew.getString(4),rsNew.getString(5),rsNew.getLong(6),rsNew.getLong(7));
					emplist.add(e1);
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
        ConnectionUtil.cleanUp(conn5,stat,rsNew);
		return emplist;

	}
	public List<Employee> getAllEmployees()
	{	
	/*Retrieves all rows from EMPLOYEE Table as a List
	public List<Employees> getAllEmployees()*/
		List<Employee> emplist2 = new ArrayList<Employee>();
		Employee e2 = null;
		Connection conn4 = ConnectionUtil.getConnection();
		PreparedStatement stats = null;
		ResultSet rs3 = null;
		String sql4 = "select * from Employee";
		try {
			stats = conn4.prepareStatement(sql4);
			rs3 = stats.executeQuery();
			while (rs3.next()) {
				e2 = new Employee(rs3.getLong(1),rs3.getString(2),rs3.getString(3),rs3.getString(4),rs3.getString(5),rs3.getLong(6),rs3.getLong(7));
				emplist2.add(e2);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		ConnectionUtil.cleanUp(conn4, stats, rs3);
		return emplist2;
	}
}