<%@ page import="java.io.*,java.util.*,com.infor.data.*,com.infor.db.*" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html dir="ltr" xmlns="http://www.w3.org/1999/xhtml">

<head>
<meta content="text/html; charset=utf-8" http-equiv="Content-Type" />
<title>Home</title>
<style type="text/css">
.auto-style1 {
	border: 1px solid #800000;
}
.auto-style2 {
	text-align: right;
}
.auto-style3 {
	text-align: center;
}
.auto-style4 {
	text-align: left;
}
.auto-style5 {
	margin-left: 40px;
}
</style>
<link href="styles/style2.css" media="screen" rel="stylesheet" title="CSS" type="text/css" />
</head>

<body>

<!-- Begin Container -->
<div id="container">
	<!-- Begin Masthead -->

	<!-- End Masthead -->
	<!-- Begin Navigation -->
	<div id="navigation">
		<ul>
			<li><a href="login.html">Home</a></li>
			<li><a href="departments.html">Departments</a></li>
			<li><a href="create_department.html">Department - Create New</a></a></li>
			<li><a href="employees.html">Employees</a></a></li>
			<li><a href="create_employee.html">Employee - Create New</a></a></li>
		</ul>
	</div>
	<!-- End Navigation -->
	<!-- Begin Page Content -->
	<div id="page_content">
		<!-- Begin Left Column -->
		<div id="column_l">
			
			<h3>Department</h3>
			<p>These are the departments we currently have</p>
			<p>
			<form name=""loginForm" method="post" action="login">
			
				<table class="auto-style1" style="width: 100%" cellpadding="5" cellspacing="5">
					<tr>
						<td class="auto-style2" style="width: 334px">
						<h5 class="auto-style3">NAME</h5></td>
						<td><h5 class="auto-style3">DESCRIPTION</h5></td>
					</tr>
					<% List<Department> deps = (new ArrayList<Department>)request.getAttribute(depts2);
					for(Department departments: deps){
					
					%>
					<tr>
						<td class="auto-style4" style="width: 334px">
						<p class="auto-style5"><%= department.getDept_name() %></p>
						</td>
						<td class="auto-style4">
						<p class="auto-style5"><%= department.getDescription() %></p>
						</td>
					</tr>
					<%
					}
					%>>
					
				</table>
			
			</form>
			</p>
			<!-- #EndEditable --></div></div>
		<!-- End Left Column -->
		<!-- Begin Right Column -->
		
	<!-- End Page Content -->
	<!-- Begin Footer -->
	<div id="footer">
		
		<p>Copyright &copy; Infor. All Rights Reserved.</p>
	</div>
	<!-- End Footer --></div>
<!-- End Container -->

</body>

</html>
