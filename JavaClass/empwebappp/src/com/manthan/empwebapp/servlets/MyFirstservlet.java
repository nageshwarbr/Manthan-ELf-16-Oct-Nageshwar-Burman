package com.manthan.empwebapp.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MyFirstservlet extends HttpServlet {
public MyFirstservlet() {
	// TODO Auto-generated constructor stub
	System.out.println("Inside constructor");
}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		ServletContext context=getServletContext();
		String code=context.getInitParameter("Country Code");
		ServletConfig config=getServletConfig();
		String msg=config.getInitParameter("message");
		
		Date date=new Date();
//		resp.setHeader("refresh", "1");
		PrintWriter out=resp.getWriter();
		out.print("<html>");
		out.print("<body>");
		out.print("<h1>Current Date & Time-<br>"+date+"</h1>");
		out.println("<br>" +msg);
		out.println("<br> "+code);
		out.print("</body>");
		out.print("</html>");

	}//end of doGet
	

}//End of class
