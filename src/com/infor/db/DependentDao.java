package com.infor.db;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.infor.data.Department;
import com.infor.data.Dependent;
import com.infor.util.ConnectionUtil;

public class DependentDao {
	public List<Dependent> createDependents(List<Dependent> dependents, Long employeeId)
	{
	/*Inserts rows in DEPENDENT Table using the List and the employeeId
	public List<Dependent> createDependents(List<Dependent> dependents, Long employeeId)*/
		// d = new Dependent();
		List<Dependent> deplist = new ArrayList<Dependent>();
		Connection conn = ConnectionUtil.getConnection();
		PreparedStatement stm = null;
		ResultSet rs = null;
		String sql = "insert into Dependent values(seq_dependent_id.nextval,?,?,?)";
		for (Dependent dependent : dependents) {
		try {
			stm = conn.prepareStatement(sql);
			stm.setString(1,dependent.getdependent_name());
			stm.setString(2, dependent.getDependent_relation());
			stm.setLong(3,employeeId);
			int i = stm.executeUpdate();
			System.out.println(i);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}

		String sql1 = "select * from dependent where emp_id = ?";
		try {
			Dependent d =null;
			stm = conn.prepareStatement(sql1);
			stm.setLong(1,employeeId);
			rs = stm.executeQuery();
			while (rs.next()) {
				
				d = new Dependent(rs.getLong(1),rs.getString(2),rs.getString(3),rs.getLong(4));
				deplist.add(d);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		ConnectionUtil.cleanUp(conn, stm,null );
		// System.out.println(deptId);
		return deplist;
}
	public List<Dependent> getDependentsByEmployeetId(Long employeeId)
	{
	/*Retrieves dependents  from DEPENDENT Table who are are associated with a particular Employee
	public List<Dependents> getDependentsByEmployeetId(Long employeeId)*/
		List<Dependent> depts2 = new ArrayList<Dependent>();
		Dependent d2 = null;
		Connection conn4 = ConnectionUtil.getConnection();
		PreparedStatement stats = null;
		ResultSet rs3 = null;
		String sql4 = "select * from dependent where emp_id = ?";
		try {
			stats = conn4.prepareStatement(sql4);
			stats.setLong(1,employeeId);
			rs3 = stats.executeQuery();
			while (rs3.next()) {
				d2 = new Dependent(rs3.getLong(1), rs3.getString(2), rs3.getString(3));
				depts2.add(d2);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		ConnectionUtil.cleanUp(conn4, stats, rs3);
		return depts2;

	}
	public List<Dependent> getAllDependents()
	{
	/*Retrieves all rows from EMPLOYEE Table as a List
	public List<Dependents> getAllDependents()*/
		List<Dependent> depts2 = new ArrayList<Dependent>();
		Dependent d2 = null;
		Connection conn4 = ConnectionUtil.getConnection();
		PreparedStatement stats = null;
		ResultSet rs3 = null;
		String sql4 = "select * from dependent";
		try {
			stats = conn4.prepareStatement(sql4);
			rs3 = stats.executeQuery();
			while (rs3.next()) {
				d2 = new Dependent(rs3.getLong(1), rs3.getString(2), rs3.getString(3));
				depts2.add(d2);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		ConnectionUtil.cleanUp(conn4, stats, rs3);
		return depts2;
	}
	}