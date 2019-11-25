package com.manthan.empwebappp.jspservlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.manthan.empwebapp.beans.EntryBean;

@WebServlet("/loginAws")
public class EntryServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		int entryId=Integer.parseInt(req.getParameter("Id"));
		String name=req.getParameter("Name");
		
		EntryBean bean=new EntryBean();
		bean.setId(entryId);
		bean.setName(name);
		req.setAttribute("bean", bean);
		 req.getRequestDispatcher("./jsp/LoginAws.jsp").forward(req, resp);
	}
}
