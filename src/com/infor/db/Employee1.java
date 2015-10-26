package com.infor.db;

import java.util.ArrayList;
import java.util.List;

import com.infor.data.Employee;

public class Employee1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee1 emp = new Employee1();
		EmployeeDao empdao = new EmployeeDao();
		List<Employee> empl = new ArrayList<Employee>();
        Employee e1 = new Employee(1025L,"AKHIL","zdjhsdf","3254", "12-JUL-2015",60000L,1071L);
        Employee e2 = new Employee(1033L , "Mano","var","5632","12-AUG-2016",60000L,1071L);
        Employee e3 = new Employee(1032L,"asdasd","asda","6562","25-FEB-2013",6532L,1089L);
        Employee eNew = new Employee("AKHIL","zdjhsdf","3254", "12-JUL-2015",60000L);
        empl.add(e1);
        empl.add(e2);
        empl.add(e3);
      /* System.out.println(empdao.createEmployees(empl, 1022L));
       System.out.println(empdao.getEmployeeById(1022L));
       System.out.println(empdao.getEmployeesByDepartmentId(1022L));
       System.out.println(empdao.getAllEmployees());*/
       empdao.CreateEmployee(eNew, 1022L);

	}

}
