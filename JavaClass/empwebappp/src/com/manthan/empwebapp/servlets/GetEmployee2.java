package com.manthan.empwebapp.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class GetEmployee2 extends HttpServlet{
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String empIdvl=req.getParameter("empId");
		
		PrintWriter out=resp.getWriter();
		out.println("<html>");
		out.println("<body>");
		out.println("<h2>Employee details for Emp Id: "+empIdvl+ "-</h2>");
		
		out.println("Employee name=Syed <br>");
		out.println("</body>");
		out.println("</html>");
		}
}
