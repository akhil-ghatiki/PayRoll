package com.infor.db;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.infor.data.Department;
import com.infor.data.Project;
import com.infor.data.Project_Employee;
import com.infor.util.ConnectionUtil;

public class ProjectDao {
	public Long createProject(Project project)
	{
	/*Inserts a new row in PROJECT table with values specified in Project Object
	public Long createProject(Project project)*/
		Connection conn = ConnectionUtil.getConnection();
		PreparedStatement stat = null;
		ResultSet rs= null;
		long project_id=0;
		String sql = "insert into project values(seq_dept_id.nextval,?,?)";
		try {
			stat = conn.prepareStatement(sql);
			//stat.setLong(1, project.getProject_id());
			stat.setString(1, project.getProject_name());
			stat.setString(2,project.getProject_desc());
			int i = stat.executeUpdate();
			System.out.println(i);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String sql2 = "select project_id from project";
		try {
			stat = conn.prepareStatement(sql2);
			rs = stat.executeQuery();
			while(rs.next())
			{
				project_id = rs.getLong(1);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		ConnectionUtil.cleanUp(conn, stat, rs);
		return project_id;
	}
	public Long assignEmployeesToProject(Long projectId, List<Long> employeeIds)
	{
/*	Inserts multiple rows in PROJECT_EMPLOYEE Table with the employee specified in List
	 and project id specified, Start date should be current date (no time, only date), end 
	date should be left null.
	public Long assignEmployeesToProject(Long projectId, List<Long> employeeIds)*/
		//Project_Employee pe = null;
		Connection conn = ConnectionUtil.getConnection();
		PreparedStatement stat = null;
		Long return_value =0L;
		ResultSet rs= null;
		String date = "10-AUG-2015";
		String sql = "insert into Project_employee values(seq_project_member_id.nextval,?,?,'11-AUG-2015',null)";
		try {
			stat= conn.prepareStatement(sql);
			for (Long long1 : employeeIds) {
				stat.setLong(1,projectId );
				stat.setLong(2,long1);
				int i = stat.executeUpdate();
				System.out.println(i);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String sql1 ="Select project_member_id from Project_employee";
		try {
			stat=conn.prepareStatement(sql1);
			rs=stat.executeQuery();
			while(rs.next())
			{
				return_value = rs.getLong(1);
				//System.out.println(return_value);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return return_value;
	}
	public boolean unassignEmployee(Long employeeId, Long projectId)
	{
	/*Unassign employee from project i.e., update PROJECT_EMPLOYEE row with end date for 
	a row matching employee id and project id.
	public boolean unassignEmployee(Long employeeId, Long projectId)*/
		Connection conn = ConnectionUtil.getConnection();
		PreparedStatement stat = null;
		Long return_value =0L;
		ResultSet rs= null;
		int i=0;
		//String date = "10-AUG-2015";
		String sql = "update Project_employee set end_date='15-AUG-2015' where project_id=? and emp_id=?";
		try {
			stat=conn.prepareStatement(sql);
			stat.setLong(1, projectId);
			stat.setLong(2, employeeId);
			i = stat.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if(i>0)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	public boolean endProject(Long projectId) 
	{
		/*Updates PROJECT_EMPLOYEE Table with end date, updates all rows matching the project
		 id with the end date, end date is the current date (no time, only date)
		public boolean endProject(Long projectId) */
		Connection conn = ConnectionUtil.getConnection();
		PreparedStatement stat = null;
		Long return_value =0L;
		ResultSet rs= null;
		int i=0;
		//String date = "10-AUG-2015";
		String sql = "update Project_employee set end_date='15-AUG-2015' where project_id=?";
		try {
			stat=conn.prepareStatement(sql);
			stat.setLong(1, projectId);
			//stat.setLong(2, employeeId);
			i = stat.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if(i>0)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	public List<Project> getAllProjects()
	{
		/*Retrieves all rows from PROJECT table as list
		public List<Project> getAllProjects()*/

		List<Project> pros = new ArrayList<Project>();
		Project d2 = null;
		Connection conn4 = ConnectionUtil.getConnection();
		PreparedStatement stats = null;
		ResultSet rs3 = null;
		String sql4 = "select * from project";
		try {
			stats = conn4.prepareStatement(sql4);
			rs3 = stats.executeQuery();
			while (rs3.next()) {
				d2 = new Project(rs3.getLong(1), rs3.getString(2),
						rs3.getString(3));
				pros.add(d2);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return pros;
	}
	
}
