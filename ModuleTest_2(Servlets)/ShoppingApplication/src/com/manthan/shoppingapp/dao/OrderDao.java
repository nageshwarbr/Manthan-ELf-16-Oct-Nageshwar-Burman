package com.manthan.shoppingapp.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;


import com.manthan.shoppingapp.bean.Orderbean;
import com.manthan.shoppingapp.bean.ProductBean;
import com.mysql.jdbc.PreparedStatement;


public class OrderDao {
	public boolean addOrder(Orderbean bean) {
		java.sql.Connection con = null;
		java.sql.PreparedStatement pstmt = null;
		boolean isAdded = false;
		try {
			Class.forName("com.mysql.jdbc.Driver");

			con = DriverManager.getConnection("jdbc:mysql://localhost/flipkart", "root", "root");
			String sql = "insert into order_info values(?,?,?,(select ProductCost from Product_Info where ProductID=?))";
			pstmt=con.prepareStatement(sql);
			pstmt.setInt(1, bean.getOrderId());
			pstmt.setInt(2, bean.getProdId());
			pstmt.setInt(3, bean.getUserId());
			pstmt.setInt(4, bean.getProdId());


			int n = pstmt.executeUpdate();

			if (n > 0) {
				isAdded = true;
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {

			try {
				if (pstmt != null) {
					pstmt.close();
				}
			} catch (Exception e2) {
				e2.printStackTrace();
			}
			try {
				if (con != null) {
					con.close();
				}
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		return isAdded;
	}
	public List<Orderbean> getAllData(int id) {
		Connection con=null;
		Statement stmt=null;
		ResultSet rs=null;
		Orderbean orderBean=null;
		java.sql.PreparedStatement pstmt=null;
		List<Orderbean> ls=new ArrayList<Orderbean>();
		try{
			Class.forName("com.mysql.jdbc.Driver");

			con = DriverManager.getConnection("jdbc:mysql://localhost/Flipkart", "root", "rootroot");
			String sql="select * from User_Info where UserID=?";

			pstmt=con.prepareStatement(sql);
			pstmt.setInt(1,id);

			rs=pstmt.executeQuery();
			while(rs.next()) {
				int orderID=rs.getInt("OrderID");
				int uid=rs.getInt("UserID");
				int pid=rs.getInt("ProductID");
				double price=rs.getDouble("Price");


				orderBean = new Orderbean();
				orderBean.setOrderId(orderID);
				orderBean.setPrice(price);
				orderBean.setProdId(pid);
				orderBean.setUserId(uid);

				ls.add(orderBean);
			}
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		return ls;


	}}
