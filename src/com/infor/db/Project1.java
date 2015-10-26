package com.infor.db;

import java.util.ArrayList;
import java.util.List;

import com.infor.data.Employee;
import com.infor.data.Project;

public class Project1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Long> empIds = new ArrayList<Long>();
		ProjectDao Pdao = new ProjectDao();
		Project pro = new Project(123L,"ProjectLoon","Free internet to rural areas");
		empIds.add(1022L);
		empIds.add(1023L);
		empIds.add(1024L);
		empIds.add(1025L);
		System.out.println(Pdao.createProject(pro));
		System.out.println(Pdao.assignEmployeesToProject(1081L, empIds));
		System.out.println(Pdao.assignEmployeesToProject(1082L, empIds));
		System.out.println(Pdao.unassignEmployee(1024L, 1082L));
		System.out.println(Pdao.endProject(1082L));
		System.out.println(Pdao.getAllProjects());

	}
	
}
