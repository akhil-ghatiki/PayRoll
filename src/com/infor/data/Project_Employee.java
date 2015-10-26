package com.infor.data;

public class Project_Employee {
	Long Project_member_id;
	Long Project_id;
	Long emp_id;
	String start_date;
	String end_date;
	public Long getProject_member_id() {
		return Project_member_id;
	}
	public void setProject_member_id(Long project_member_id) {
		Project_member_id = project_member_id;
	}
	public Long getProject_id() {
		return Project_id;
	}
	public Project_Employee(Long project_member_id, Long project_id,
			Long emp_id, String start_date, String end_date) {
		super();
		Project_member_id = project_member_id;
		Project_id = project_id;
		this.emp_id = emp_id;
		this.start_date = start_date;
		this.end_date = end_date;
	}
	public void setProject_id(Long project_id) {
		Project_id = project_id;
	}
	public Long getEmp_id() {
		return emp_id;
	}
	public void setEmp_id(Long emp_id) {
		this.emp_id = emp_id;
	}
	public String getStart_date() {
		return start_date;
	}
	public void setStart_date(String start_date) {
		this.start_date = start_date;
	}
	public String getEnd_date() {
		return end_date;
	}
	public void setEnd_date(String end_date) {
		this.end_date = end_date;
	}

}
