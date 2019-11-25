package com.manthan.empwebapp.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.manthan.empwebapp.beans.EmployeeInfoBean;
import com.manthan.empwebappp.dao.EmployeeDao;
import com.manthan.empwebappp.util.EmployeeDaoImplManager;
@WebServlet("/login")
public class LoginServlet extends HttpServlet{


EmployeeDao dao=EmployeeDaoImplManager.getDaoInstance();
protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	int empIdval=Integer.parseInt(req.getParameter("empId"));
	String passwordVal=req.getParameter("password");
	
	EmployeeInfoBean employeeInfoBean=dao.authenticate(empIdval, passwordVal);
	PrintWriter out=resp.getWriter();
	out.print("<html>");
	out.print("<body>");
	if(employeeInfoBean!=null) {
		HttpSession session=req.getSession(true);
		session.setAttribute("employeeinfoBean", employeeInfoBean);
		//session.setMaxInactiveInterval(10);
		
		out.print("<h2> Welcome "+employeeInfoBean.getEmpName()+"</h2>");
		out.print("<a href='./AddEmp.html'>Add New Employee</a></br>");
		out.print("<a href='./SearchEmp.html'>Search Employee</a></br>");
		out.print("<a href='./Update.html'>Update Employee</a></br>");
		out.print("<a href='./Deleteemp.html'>Delete Employee</a></br>");
		
		out.print("<a href='./logout'>Logout</a>");
	}
	else {
		out.print("Invalid credentials!!<br>");
		req.getRequestDispatcher("./LoginForm2.html").include(req, resp);
	}
	out.print("</body>");
	out.print("</html>");
}
}
