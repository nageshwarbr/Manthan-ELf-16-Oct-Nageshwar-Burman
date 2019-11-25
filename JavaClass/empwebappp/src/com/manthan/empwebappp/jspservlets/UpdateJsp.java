package com.manthan.empwebappp.jspservlets;

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
@WebServlet("/UpdateJsp")
public class UpdateJsp extends HttpServlet{
	private EmployeeDao dao=EmployeeDaoImplManager.getDaoInstance();
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		HttpSession session=req.getSession(false);
		PrintWriter out=resp.getWriter();
		if(session!=null) {
			
			
			
			EmployeeInfoBean employeeInfoBean=new EmployeeInfoBean();
			int empid=Integer.parseInt(req.getParameter("empId"));
			String empname=req.getParameter("empName");
			int age=Integer.parseInt(req.getParameter("age"));
			double salary=Double.parseDouble(req.getParameter("salary"));
			long mobile=Long.parseLong(req.getParameter("mobile"));
			String designation=req.getParameter("designation");
			
			employeeInfoBean.setEmpId(empid);
			employeeInfoBean.setEmpName(empname);
			employeeInfoBean.setAge(age);
			employeeInfoBean.setDesignation(designation);
			employeeInfoBean.setMobile(mobile);
			employeeInfoBean.setSalary(salary);
			if(dao.update(employeeInfoBean)) {
				req.setAttribute("msg", "Employee updated successfully");
			}
			else {
				req.setAttribute("msg", "Failed to update");
			}
			req.getRequestDispatcher("/UpdateempJsp").forward(req, resp);
		}
		else {
			req.setAttribute("msg", "Please login again");
			req.getRequestDispatcher("./login2").forward(req, resp);
		}
}
}
