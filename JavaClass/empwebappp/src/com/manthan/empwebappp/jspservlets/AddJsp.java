package com.manthan.empwebappp.jspservlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.manthan.empwebapp.beans.EmployeeInfoBean;
import com.manthan.empwebappp.dao.EmployeeDao;
import com.manthan.empwebappp.dao.EmployyeInfoDaoImpl;
@WebServlet("/addempJsp")
public class AddJsp extends HttpServlet{
@Override

protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	HttpSession session=req.getSession(false);
	if(session!=null) {
		EmployeeDao dao=new EmployyeInfoDaoImpl();
		
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
		if(dao.addEmployee(employeeInfoBean)) {
			req.setAttribute("msg", "Employee added successfully");
		}
		else {
			req.setAttribute("msg", "Failed to add");
		}
		req.getRequestDispatcher("/AddempJsp").forward(req, resp);
		
	}
	else {
		req.setAttribute("msg", "Please login again");
		req.getRequestDispatcher("./login2").forward(req, resp);
	}
}
}
