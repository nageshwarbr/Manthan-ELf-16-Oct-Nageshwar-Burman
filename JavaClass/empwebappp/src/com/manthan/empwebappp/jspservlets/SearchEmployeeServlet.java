package com.manthan.empwebappp.jspservlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.manthan.empwebapp.beans.EmployeeInfoBean;
import com.manthan.empwebappp.dao.EmployeeDao;
import com.manthan.empwebappp.dao.EmployyeInfoDaoImpl;
@WebServlet("/searchJsp")
public class SearchEmployeeServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		HttpSession session=req.getSession(false);
		if(session!=null) {
			int empId=Integer.parseInt(req.getParameter("empId"));
			EmployeeDao dao=new EmployyeInfoDaoImpl();
			EmployeeInfoBean employeeInfoBean=dao.searchEmployee(empId);
			if(employeeInfoBean!=null) {
				req.setAttribute("searchEmployee", employeeInfoBean);
			}
			else {
				req.setAttribute("msg", "Employee Id not found ");
			}
			req.getRequestDispatcher("./searchPage").forward(req, resp);
		}
		else {
			req.setAttribute("msg", "Please login first!");
			req.getRequestDispatcher("./login2").forward(req, resp);
		}
	}

}
