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


@WebServlet("/register")
public class Register extends HttpServlet{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		HttpSession session=req.getSession(false);
		if(session!=null) {
			UserDao dao=new UserDao();

			UserBean bean=(UserBean) session.getAttribute("userBean");

			String name=req.getParameter("Name");
			int id=Integer.parseInt(req.getParameter("userId"));
			String email=req.getParameter("email");
			String password=req.getParameter("password");

			UserBean userbean=new UserBean();

			userbean.setUserName(name);
			userbean.setPassword(password);
			userbean.setUserId(id);
			userbean.setEmailId(email);

			if(dao.register(userbean)) {
				req.setAttribute("msg", "Registered successfully");
			}
			else {
				req.setAttribute("msg", "Failed to register");
			}
			req.getRequestDispatcher("/Register.jsp").forward(req, resp);

		}
		else {
			req.setAttribute("msg", "Please login again");
			req.getRequestDispatcher("./LoginFile").forward(req, resp);
		}
	}
}

