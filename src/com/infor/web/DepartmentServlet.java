package com.infor.web;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.GenericServlet;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

import com.infor.data.Department;
import com.infor.db.DepartmentDao;

public class DepartmentServlet extends GenericServlet {
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
		DepartmentDao dd = new DepartmentDao();
		PrintWriter writer = response.getWriter();
		RequestDispatcher reqdes = null;
		String action= request.getParameter("action");
		reqdes = request.getRequestDispatcher("departments.jsp");
		reqdes.forward(request, response);

		if(action.equals("create"))
		{
			//reqdes = request.getRequestDispatcher("welcome.html");
			String name = request.getParameter("name");
			String description = request.getParameter("description"); 
			Department d= new Department(name,description);
			dd.CreateDepartment(d);
			//dd.SuccessOrFail();
			
	    	 writer.println("success!!!!");
	    	  //reqdes = request.getRequestDispatcher("Login.html");
	    	 // reqdes.forward(request, response);
		}
		else if (action.equals("get_all"))
		{
			writer.println(dd.getAllDepartments());
			/*reqdes=request.getRequestDispatcher("depatments.jsp");
			reqdes.forward(request,response);*/
			
		}
		

	}

	

}
