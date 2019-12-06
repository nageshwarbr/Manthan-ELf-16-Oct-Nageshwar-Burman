package com.manthan.shoppingapp.servlets;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.manthan.shoppingapp.bean.Orderbean;
import com.manthan.shoppingapp.dao.OrderDao;
@WebServlet("/orderhistory")
public class OrderHistory extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		HttpSession session=req.getSession(false);
		int id=Integer.parseInt(req.getParameter("userId"));
		if(session!=null) {

			OrderDao dao=new OrderDao();
			List<Orderbean> al = dao.getAllData(id);
			if(al!=null) {
				req.setAttribute("seeorders", al);
			}
			else {
				req.setAttribute("msg", "User Id not found ");
			}
			req.getRequestDispatcher("./SeeAll").forward(req, resp);
		}
		else {
			req.setAttribute("msg", "Please login first!");
			req.getRequestDispatcher("./login2").forward(req, resp);
		}
	}
}
