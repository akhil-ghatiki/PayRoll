package com.infor.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

import com.infor.data.Employee;
import com.infor.db.EmployeeDao;

public class EmployeeServlet extends GenericServlet {
	

	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		super.destroy();
	}

	@Override
	public void init() throws ServletException {
		// TODO Auto-generated method stub
		super.init();
	}

	@Override
	public void service(ServletRequest request, ServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		EmployeeDao edao = new EmployeeDao();
		PrintWriter writer = response.getWriter();
		RequestDispatcher reqdes = null;
		response.setContentType("text/html");
		String action= request.getParameter("action");
		if(action.equals("create"))
		{
			String FirstName = request.getParameter("firstName");
			String LastName = request.getParameter("lastName");
			String ssn = request.getParameter("ssn");
			String doj = request.getParameter("doj");
			String salary =request.getParameter("salary");
			String dept = request.getParameter("deptId");
			String username = request.getParameter("username");
			String password = request.getParameter("password");
			String role = request.getParameter("userRole");
			Long salary1 = Long.parseLong(salary);
			Long dId = Long.parseLong(dept);
			Employee e = new Employee(FirstName, LastName, ssn,doj, salary1);
			
			edao.CreateEmployee(e, dId);
			writer.println("success!!!!");
			reqdes = request.getRequestDispatcher("employees.jsp");
			reqdes.include(request, response);
		}
		else if(action.equals("get_all"))
		{
			writer.println(edao.getAllEmployees());
		}
		

	}

}
