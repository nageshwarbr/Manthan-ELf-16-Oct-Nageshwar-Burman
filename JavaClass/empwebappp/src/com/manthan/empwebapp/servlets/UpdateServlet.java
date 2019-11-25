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
@WebServlet("/update")
public class UpdateServlet extends HttpServlet {
	private EmployeeDao dao=EmployeeDaoImplManager.getDaoInstance();
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		HttpSession session=req.getSession(false);
		PrintWriter out=resp.getWriter();
		if(session!=null) {
			
			int empid=Integer.parseInt(req.getParameter("empId"));
			long mobile=Long.parseLong(req.getParameter("mobile"));
			
			
			EmployeeInfoBean employeeInfoBean=new EmployeeInfoBean();
			employeeInfoBean.setEmpId(empid);
			employeeInfoBean.setMobile(mobile);
	
			
			
			out.println("<html>");
			out.print("<body>");
			
			if(dao.update(employeeInfoBean)) {
				out.println("<h2> record updated successfully....</h2>");
				
				
			}
			else {
				out.println("<h2> no record updated....</h2>");
				out.println("<html>");
				out.print("<body>");
				req.getRequestDispatcher("./LoginForm2.html").include(req, resp);
				out.print("</body>");
				out.print("</html>");
				
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
