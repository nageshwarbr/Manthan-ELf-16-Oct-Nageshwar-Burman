package com.manthan.empwebapp.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class GetEmployeeServlet extends HttpServlet{
@Override
protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
	
	ServletContext context=getServletContext();
	String code=context.getInitParameter("Country Code");
	PrintWriter out=resp.getWriter();
	out.println("<html>");
	out.println("<body>");
	out.println("<h2>Employee details-</h2>");
	out.println("Employee Id=101 <br>");
	out.println("Employee name=Syed <br>");
	out.println("<br>"+code);
	out.println("</body>");
	out.println("</html>");
	}
}
