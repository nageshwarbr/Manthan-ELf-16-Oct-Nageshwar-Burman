package com.manthan.shoppingapp.dao;

import java.sql.DriverManager;
import java.sql.ResultSet;

import com.manthan.shoppingapp.bean.ProductBean;


public class ProductDao {
	public ProductBean searchProduct(int prod_idVal) {

		java.sql.Connection con = null;
		java.sql.PreparedStatement pstmt = null;
		ResultSet rs = null;
		ProductBean productBean = null;

		try {
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Flipkart", "root", "root");
			String sql = "select * from Product_Info where ProductID=?";
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, prod_idVal);
			rs = pstmt.executeQuery();

			if (rs.next()) {
				productBean = new ProductBean();
				productBean.setProductId(rs.getInt("ProductID"));
				productBean.setProductName(rs.getString("ProductName"));
				productBean.setProdColor(rs.getString("ProductColor"));
				productBean.setDescription(rs.getString("Description"));
				productBean.setProdcost(rs.getDouble("ProductCost"));
				productBean.setQuantity(rs.getInt("NumberOfProducts"));

			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (rs != null) {
					rs.close();
				}
			} catch (Exception e2) {
				e2.printStackTrace();
			}
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
		return productBean;

	}
}
