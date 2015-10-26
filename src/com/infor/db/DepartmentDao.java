package com.infor.db;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.infor.data.Department;
import com.infor.util.ConnectionUtil;

public class DepartmentDao {
	int i=0;
	public long CreateDepartment(Department d) {
		/*
		 * Inserts a row in DEPARTMENT with values specified in Department
		 * object and returns DEPT_ID of the row created public Long
		 * createDepartment(Department department)
		 */
		
		Connection conn = ConnectionUtil.getConnection();
		PreparedStatement stm = null;
		String name = d.getDept_name();
		String Descrip = d.getDept_desc();
		long deptId = 0;
		String sql = "insert into Department values(seq_dept_id.nextval,?,?)";
		try {
			stm = conn.prepareStatement(sql);
			stm.setString(1, name);
			stm.setString(2, Descrip);
			i = stm.executeUpdate();
			//System.out.println(i);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		String sql1 = "select dept_id from department where dept_name = ?";
		try {
			PreparedStatement stmt = conn.prepareStatement(sql1);
			stmt.setString(1, d.getDept_name());
			ResultSet rs = stmt.executeQuery();
			while (rs.next()) {
				deptId = rs.getLong(1);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		ConnectionUtil.cleanUp(conn, stm, null);
		// System.out.println(deptId);
		return deptId;

	}

	public Department getDepartmentById(long departmentId) {

		/*
		 * Retrieves a row from DEPARTMENT Table with the id specified and
		 * returns Department Object public Department getDepartmentById(Long
		 * departmentId)
		 */
		Department d = null;
		Connection conn = ConnectionUtil.getConnection();
		PreparedStatement stm = null;
		ResultSet rs = null;
		String sql = "select * from department where dept_id =? ";
		try {
			stm = conn.prepareStatement(sql);
			stm.setLong(1, departmentId);
			rs = stm.executeQuery();
			while (rs.next()) {
				d = new Department(rs.getLong(1), rs.getString(2),
						rs.getString(3));

			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		ConnectionUtil.cleanUp(conn, stm, rs);
		return d;
	}

	public Department getDepartmentByName(String departmentName) {
		/*
		 * Retrieves a row from DEPARTMENT Table with the department name
		 * specified and returns Department Object public Department
		 * getDepartmentByName(String departmentName)
		 */
		Department d = null;
		Connection conn2 = ConnectionUtil.getConnection();
		PreparedStatement statement = null;
		ResultSet rs1 = null;
		String SqlNew = "select * from department where dept_name =?";
		try {
			statement = conn2.prepareStatement(SqlNew);
			statement.setString(1, departmentName);
			rs1 = statement.executeQuery();
			while (rs1.next()) {
				d = new Department(rs1.getLong(1), rs1.getString(2),
						rs1.getString(3));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		ConnectionUtil.cleanUp(conn2, statement, rs1);
		return d;
	}

	public List<Department> getDepartmentsByIds(List<Long> departmentIds) {
		List<Department> depts = new ArrayList<Department>();
		/*
		 * Retrieves rows from DEPARTMENT Table with the ids specified and
		 * returns List of Department Objects public List<Department>
		 * getDepartmentsByIds(List<Long> departmentIds)
		 */
		Department d = null;
		Connection conn3 = ConnectionUtil.getConnection();
		PreparedStatement stat = null;
		ResultSet rsNew = null;
		String Sql3 = "select * from department where dept_id = ?";
		for (Long long1 : departmentIds) {
			try {
				stat = conn3.prepareStatement(Sql3);
				stat.setLong(1, long1);
				rsNew = stat.executeQuery();
				while (rsNew.next()) {
					d = new Department(rsNew.getLong(1), rsNew.getString(2),
							rsNew.getString(3));
					depts.add(d);
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

		ConnectionUtil.cleanUp(conn3, stat, rsNew);
		return depts;
	}

	public List<Department> getAllDepartments() {
		/*
		 * Retrieves all rows from DEPARTMENT Table as a List public
		 * List<Department> getAllDepartments()
		 */
		List<Department> depts2 = new ArrayList<Department>();
		Department d2 = null;
		Connection conn4 = ConnectionUtil.getConnection();
		PreparedStatement stats = null;
		ResultSet rs3 = null;
		String sql4 = "select * from department";
		try {
			stats = conn4.prepareStatement(sql4);
			rs3 = stats.executeQuery();
			while (rs3.next()) {
				d2 = new Department(rs3.getLong(1), rs3.getString(2),
						rs3.getString(3));
				depts2.add(d2);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return depts2;
		}
	public String SuccessOrFail()
	{
		if (i>0)
		{
			return "success";
		}
		else
		{
			return "failed";
		}
	}
}
