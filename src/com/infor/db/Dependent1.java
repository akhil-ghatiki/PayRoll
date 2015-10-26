package com.infor.db;

import java.util.ArrayList;
import java.util.List;

import com.infor.data.Dependent;

public class Dependent1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dependent1 dep = new Dependent1();
		List<Dependent> dlist = new ArrayList<Dependent>();
		Dependent d = new Dependent(123L,"Jhon", "father",1022L);
		Dependent d2 = new Dependent(123L,"Silva", "mother",125L);
		Dependent d3 = new Dependent(235L,"Murphy", "sister",452L);
		dlist.add(d);
		dlist.add(d2);
		dlist.add(d3);
		DependentDao Ddao = new DependentDao();
		System.out.println(Ddao.createDependents(dlist, 1022L));
		System.out.println(Ddao.getDependentsByEmployeetId(1022L));
		System.out.println(Ddao.getAllDependents());
		
		
		

	}

}
