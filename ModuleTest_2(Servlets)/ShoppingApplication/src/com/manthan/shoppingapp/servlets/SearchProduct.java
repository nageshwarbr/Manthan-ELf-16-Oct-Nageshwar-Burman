package com.manthan.shoppingapp.servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.manthan.shoppingapp.bean.ProductBean;
import com.manthan.shoppingapp.dao.ProductDao;
@WebServlet("/search")
public class SearchProduct extends HttpServlet{
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		HttpSession session=req.getSession(false);
		if(session!=null) {
			int prodId=Integer.parseInt(req.getParameter("prodId"));
			ProductDao dao=new ProductDao();
			ProductBean bean=dao.searchProduct(prodId);
			if(bean!=null) {
				req.setAttribute("searchProduct", bean);
			}
			else {
				req.setAttribute("msg", "Product Id not found ");
			}
			req.getRequestDispatcher("./searchPage").forward(req, resp);
		}
		else {
			req.setAttribute("msg", "Please login first!");
			req.getRequestDispatcher("./login2").forward(req, resp);
		}
	}
}
