package com.manthan.empwebapp.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/include")
public class IncludeServlet extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		PrintWriter out=resp.getWriter();
		out.print("<html>");
		out.print("<body>");
		out.print("Include...");
		out.print("</body>");
		out.print("</html>");
		RequestDispatcher dispatcher=req.getRequestDispatcher("./myFirstServlet");
		dispatcher.include(req, resp);

		out.print("<html>");
		out.print("<body>");
		out.print("Include again...");
		out.print("</body>");
		out.print("</html>");
	}
}
