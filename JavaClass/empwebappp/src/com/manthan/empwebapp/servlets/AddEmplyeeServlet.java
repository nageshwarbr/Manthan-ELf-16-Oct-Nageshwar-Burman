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
import com.manthan.empwebappp.dao.EmployyeInfoDaoImpl;
import com.manthan.empwebappp.util.EmployeeDaoImplManager;
@WebServlet("/addemployee")
public class AddEmplyeeServlet extends HttpServlet {

	
	private EmployeeDao dao=EmployeeDaoImplManager.getDaoInstance();
protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	HttpSession session=req.getSession(false);
	PrintWriter out=resp.getWriter();
	if(session!=null) {
	EmployeeInfoBean bean=(EmployeeInfoBean) session.getAttribute("employeeinfoBean");
	int empid=Integer.parseInt(req.getParameter("empId"));
	String empname=req.getParameter("empName");
	int age=Integer.parseInt(req.getParameter("age"));
	double salary=Double.parseDouble(req.getParameter("salary"));
	long mobile=Long.parseLong(req.getParameter("mobile"));
	String designation=req.getParameter("designation");
	EmployeeInfoBean employeeInfoBean=new EmployeeInfoBean();
	employeeInfoBean.setEmpId(empid);
	employeeInfoBean.setEmpName(empname);
	employeeInfoBean.setAge(age);
	employeeInfoBean.setDesignation(designation);
	employeeInfoBean.setMobile(mobile);
	employeeInfoBean.setSalary(salary);
	
	
	
	out.println("<html>");
	out.print("<body>");
	
	if(dao.addEmployee(employeeInfoBean)) {
		out.println("<h3>Hello </h>"+bean.getEmpName());
		out.println("<h2> record inserted successfully....</h2>");
	}
	else {
		out.println("<h3>Sorry </h>"+bean.getEmpName()+" , "+bean.getDesignation());
		out.println("<h2> no record inserted....</h2>");
	}
	out.print("<a href='./logout'>Logout</a>");
	out.print("</body>");
	out.println("</html>");
	}
	else {
		out.println("<html>");
		out.print("<body>");
		out.print("Login again!!!<br>");
		req.getRequestDispatcher("./LoginForm2.html").include(req, resp);
		out.print("</body>");
		out.println("</html>");
	}
	
}
}
