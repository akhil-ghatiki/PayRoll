package com.infor.data;

public class Project {
	Long project_id;
	String project_name;
	String project_desc;
	public Long getProject_id() {
		return project_id;
	}
	public void setProject_id(Long project_id) {
		this.project_id = project_id;
	}
	public String getProject_name() {
		return project_name;
	}
	public void setProject_name(String project_name) {
		this.project_name = project_name;
	}
	public String getProject_desc() {
		return project_desc;
	}
	public void setProject_desc(String project_desc) {
		this.project_desc = project_desc;
	}
	public Project(Long project_id, String project_name, String project_desc) {
		super();
		this.project_id = project_id;
		this.project_name = project_name;
		this.project_desc = project_desc;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.project_id+this.project_name+this.project_desc;
	}
	
}
