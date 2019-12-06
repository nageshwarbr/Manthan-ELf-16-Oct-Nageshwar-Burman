package com.manthan.shoppingapp.servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


import com.manthan.shoppingapp.bean.UserBean;
import com.manthan.shoppingapp.dao.UserDao;

@WebServlet("/login1")

public class LoginServlet extends HttpServlet {
	UserDao dao=new UserDao();
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		int id=Integer.parseInt(req.getParameter("userId"));
		String password=req.getParameter("password");

		UserBean userBean=dao.authenticate(id, password);
		if(userBean!=null) {
			HttpSession session=req.getSession(true);
			session.setAttribute("userBean", userBean);
			req.getRequestDispatcher("./HomePage.jsp").forward(req, resp);
		}
		else {

			req.setAttribute("msg", "Invalid credentials!!");
			req.getRequestDispatcher("./Login.jsp").forward(req, resp);
		}
	}
}
