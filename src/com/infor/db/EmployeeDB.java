package com.infor.db;

import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Connection;
import java.util.HashSet;
import java.util.Set;

import com.infor.data.Employee;
import com.infor.util.ConnectionUtil;

public class EmployeeDB {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EmployeeDB edb = new EmployeeDB();
		Employee e1 = new Employee("Akhil", "Ghatiki", "12345", 60000);
		Employee e2 = new Employee("Ravikanth","Daram", "5236", 60000);
		Employee e3 = new Employee("Manoj","Varanasi","25698",60000);
		Set<Employee> emp = new HashSet<Employee>();
		emp.add(e1);
		emp.add(e2);
		emp.add(e3);
		edb.CreateEmployee(emp);
	}
	private void CreateEmployee(Set<Employee> emp)
	{
		Connection conn1=ConnectionUtil.getConnection();
		Statement stm= null;
		for (Employee employee : emp) {
			String fname = employee.getEmp_fname();
			String lname = employee.getEmp_lname();
			String ssn = employee.getEmp_ssn();
			long sal = employee.getEmp_salary();
			String sql = "insert into employee values(SEQ_EMP_ID.NEXTVAL,'"+ fname+"','"+lname+"','" + ssn + "','07-JUL-2015',"+sal+",1030)";
			try {
				stm = conn1.createStatement();
				int rs = stm.executeUpdate(sql);
				System.out.println(rs);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		ConnectionUtil.cleanUp(conn1, stm, null);
	}
	//private void 

}
