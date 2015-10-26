package com.infor.data;

import java.sql.Date;

public class Employee {
	public Employee(String emp_fname, String emp_lname, String emp_ssn,
			 String emp_doj,long emp_salary) {
		super();
		this.emp_fname = emp_fname;
		this.emp_lname = emp_lname;
		this.emp_ssn = emp_ssn;
		this.emp_salary = emp_salary;
		this.emp_doj = emp_doj;
	}

	long emp_id;
	String emp_fname;
	String emp_lname;
	String emp_ssn;
	long emp_salary;
	String emp_doj;
	long dep_id;

	public Employee(String emp_fname, String emp_lname, String emp_ssn,
			long emp_salary) {
		super();
		this.emp_fname = emp_fname;
		this.emp_lname = emp_lname;
		this.emp_ssn = emp_ssn;
		this.emp_salary = emp_salary;
		// this.emp_doj = emp_doj;
	}

	public Employee(long emp_id, String emp_fname, String emp_lname,
			String emp_ssn, String emp_doj, long emp_salary, long dep_id) {
		super();
		this.emp_id = emp_id;
		this.emp_fname = emp_fname;
		this.emp_lname = emp_lname;
		this.emp_ssn = emp_ssn;
		this.emp_salary = emp_salary;
		this.emp_doj = emp_doj;
		this.dep_id = dep_id;
	}

	public Employee(long emp_id2) {
		// TODO Auto-generated constructor stub
		emp_id = emp_id2;
	}

	public long getEmp_id() {
		return emp_id;
	}

	public void setEmp_id(long emp_id) {
		this.emp_id = emp_id;
	}

	public String getEmp_fname() {
		return emp_fname;
	}

	public void setEmp_fname(String emp_fname) {
		this.emp_fname = emp_fname;
	}

	public String getEmp_lname() {
		return emp_lname;
	}

	public void setEmp_lname(String emp_lname) {
		this.emp_lname = emp_lname;
	}

	public String getEmp_ssn() {
		return emp_ssn;
	}

	public void setEmp_ssn(String emp_ssn) {
		this.emp_ssn = emp_ssn;
	}

	public long getEmp_salary() {
		return emp_salary;
	}

	public void setEmp_salary(long emp_salary) {
		this.emp_salary = emp_salary;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return String.valueOf(this.emp_id)+this.emp_fname + this.emp_lname+this.emp_doj+String.valueOf(this.emp_salary);
		}

	public String getEmp_doj() {
		return emp_doj;
	}

	public void setEmp_doj(String emp_doj) {
		this.emp_doj = emp_doj;
	}

	public long getDep_id() {
		return dep_id;
	}

	public void setDep_id(long dep_id) {
		this.dep_id = dep_id;
	}

}
