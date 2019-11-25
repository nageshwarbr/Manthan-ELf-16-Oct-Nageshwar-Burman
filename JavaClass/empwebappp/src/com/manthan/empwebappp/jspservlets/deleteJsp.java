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
import com.manthan.empwebappp.dao.EmployyeInfoDaoImpl;
import com.manthan.empwebappp.util.EmployeeDaoImplManager;
@WebServlet("/deleteJSP")
public class deleteJsp extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
	
	HttpSession session=req.getSession(false);
	if(session!=null) {
		EmployeeDao dao=new EmployyeInfoDaoImpl();
		int empid=Integer.parseInt(req.getParameter("empId"));
		
		
		EmployeeInfoBean employeeInfoBean=new EmployeeInfoBean();
		employeeInfoBean.setEmpId(empid);
		
		if(dao.delete(employeeInfoBean)) {
			req.setAttribute("msg", "Employee delete successfully");
		}
		else {
			req.setAttribute("msg", "Failed to add");
		}
		req.getRequestDispatcher("/DeleteempJsp").forward(req, resp);
		
	}
	else {
		req.setAttribute("msg", "Please login again");
		req.getRequestDispatcher("./login2").forward(req, resp);
}
}
}
