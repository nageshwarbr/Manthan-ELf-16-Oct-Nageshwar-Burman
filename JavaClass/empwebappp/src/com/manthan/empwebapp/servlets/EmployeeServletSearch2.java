package com.manthan.empwebapp.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.manthan.empwebapp.beans.EmployeeInfoBean;
import com.manthan.empwebappp.dao.EmployeeDao;
import com.manthan.empwebappp.dao.EmployyeInfoDaoImpl;
import com.manthan.empwebappp.util.EmployeeDaoImplManager;
@WebServlet("/employeeServletSearch2")
public class EmployeeServletSearch2 extends HttpServlet{
	
	private EmployeeDao dao=EmployeeDaoImplManager.getDaoInstance();
@Override
protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	int emp_idVal=Integer.parseInt(req.getParameter("empId"));
	
	EmployeeInfoBean employeeInfoBean=dao.searchEmployee(emp_idVal);
	PrintWriter out=resp.getWriter();
	if(employeeInfoBean!=null) {
	out.println("<html>");
	out.print("<body>");
	out.println("Id "+emp_idVal+" found "+"<br>");
	out.println("name "+employeeInfoBean.getEmpName()+"<br>");
	out.println("Age "+employeeInfoBean.getAge()+"<br>");
	out.println("Salary "+employeeInfoBean.getSalary()+"<br>");
	out.println("mobile "+employeeInfoBean.getMobile()+"<br>");
	out.println("dsignation "+employeeInfoBean.getDesignation()+"<br>");
	
	out.print("</body>");
	out.print("</html>");
	}
	else {
		out.print("<html>");
		out.print("<body>");
	    out.println("No records!!");
		out.print("</body>");
		out.print("</html>");
	}
	
}
}
