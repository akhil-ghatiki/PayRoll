package com.infor.data;

public class Department {
	long Dept_id;
	String Dept_name;
	String Dept_desc;

	public Department(String dept_name, String dept_desc) {
		super();
		Dept_name = dept_name;
		Dept_desc = dept_desc;
	}

	public long getDept_id() {
		return Dept_id;
	}

	public void setDept_id(long dept_id) {
		Dept_id = dept_id;
	}

	public String getDept_name() {
		return Dept_name;
	}

	public void setDept_name(String dept_name) {
		Dept_name = dept_name;
	}

	public String getDept_desc() {
		return Dept_desc;
	}

	public void setDept_desc(String dept_desc) {
		Dept_desc = dept_desc;
	}

	public Department(long dept_id, String dept_name, String dept_desc) {
		super();
		Dept_id = dept_id;
		Dept_name = dept_name;
		Dept_desc = dept_desc;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.Dept_id + "--- " + this.Dept_name + "--- " + this.Dept_desc;
	}

}
