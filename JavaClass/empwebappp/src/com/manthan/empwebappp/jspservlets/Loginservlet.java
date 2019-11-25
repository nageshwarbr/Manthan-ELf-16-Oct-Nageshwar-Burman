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
@WebServlet("/login2")
public class Loginservlet extends HttpServlet {
	EmployeeDao dao=EmployeeDaoImplManager.getDaoInstance();
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		//get the form data
		int empId=Integer.parseInt(req.getParameter("empId"));
		String password=req.getParameter("password");

		EmployeeInfoBean employeeInfoBean=dao.authenticate(empId, password);
		if(employeeInfoBean!=null) {
          HttpSession session=req.getSession(true);
          session.setAttribute("employeeInfoBean", employeeInfoBean);
          req.getRequestDispatcher("./jsp/Homepage.jsp").forward(req, resp);
		}
		else {
			//PrintWriter out=resp.getWriter();
			//out.print("<html><body><h1>invalid</h1></body></html>");
			req.setAttribute("msg", "Invalid credentials!!");
			req.getRequestDispatcher("./LoginForm.jsp").forward(req, resp);
		}


	}

}
