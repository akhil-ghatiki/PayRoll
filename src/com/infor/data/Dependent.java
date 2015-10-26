package com.infor.data;

public class Dependent {
   long dependent_id;
   String dependent_name;
   String dependent_relation;
   long emp_id;
public Dependent(String dependent_name) {
	super();
	this.dependent_id = dependent_id;
	this.dependent_name = dependent_name;
	this.dependent_relation = dependent_relation;
	this.emp_id = emp_id;
}
public long getDependent_id() {
	return dependent_id;
}
public void setDependent_id(long dependent_id) {
	this.dependent_id = dependent_id;
}
public Dependent(long dependent_id, String dependent_name,
		String dependent_relation) {
	super();
	this.dependent_id = dependent_id;
	this.dependent_name = dependent_name;
	this.dependent_relation = dependent_relation;
}
public String getdependent_name() {
	return dependent_name;
}
public void setdependent_name(String dependent_name) {
	this.dependent_name = dependent_name;
}
@Override
public String toString() {
	// TODO Auto-generated method stub
	return this.dependent_id+this.dependent_name+this.dependent_relation+this.emp_id;
}
public Dependent(long dependent_id, String dependent_name,
		String dependent_relation, long emp_id) {
	super();
	this.dependent_id = dependent_id;
	this.dependent_name = dependent_name;
	this.dependent_relation = dependent_relation;
	this.emp_id = emp_id;
}
public Dependent(String dependent_name, String dependent_relation) {
	super();
	this.dependent_name = dependent_name;
	this.dependent_relation = dependent_relation;
}
public Dependent(String dependent_name, String dependent_relation, long emp_id) {
	super();
	this.dependent_name = dependent_name;
	this.dependent_relation = dependent_relation;
	this.emp_id = emp_id;
}
public String getDependent_relation() {
	return dependent_relation;
}
public void setDependent_relation(String dependent_relation) {
	this.dependent_relation = dependent_relation;
}
public long getEmp_id() {
	return emp_id;
}
public void setEmp_id(long emp_id) {
	this.emp_id = emp_id;
}
}
