package com.manthan.shoppingapp.servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.manthan.shoppingapp.bean.Orderbean;
import com.manthan.shoppingapp.dao.OrderDao;
@WebServlet("/order")
public class OrderServlet extends HttpServlet{
	@Override

	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		HttpSession session=req.getSession(false);
		if(session!=null) {
			OrderDao dao=new OrderDao();

			Orderbean bean=(Orderbean) session.getAttribute("Orderbean");
			int orderid=Integer.parseInt(req.getParameter("orderId"));
			int prodid=Integer.parseInt(req.getParameter("productId"));
			int userid=Integer.parseInt(req.getParameter("UserId"));

			Orderbean orderbean=new Orderbean();
			orderbean.setOrderId(orderid);
			orderbean.setProdId(prodid);
			orderbean.setUserId(userid);



			if(dao.addOrder(orderbean)) {
				req.setAttribute("msg", "Order added successfully");
			}
			else {
				req.setAttribute("msg", "Failed to add");
			}
			req.getRequestDispatcher("./orderPage").forward(req, resp);

		}
		else {
			req.setAttribute("msg", "Please login again");
			req.getRequestDispatcher("./LoginFile").forward(req, resp);
		}
	}
}
