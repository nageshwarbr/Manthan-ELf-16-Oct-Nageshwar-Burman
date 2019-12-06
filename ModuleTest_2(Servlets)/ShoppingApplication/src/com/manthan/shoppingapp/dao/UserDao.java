package com.manthan.shoppingapp.dao;

import java.sql.DriverManager;
import java.sql.ResultSet;

import com.manthan.shoppingapp.bean.UserBean;



public class UserDao {
	public boolean register(UserBean userBean) {

		java.sql.Connection con = null;
		java.sql.PreparedStatement pstmt = null;
		boolean registered = false;
		try {
			Class.forName("com.mysql.jdbc.Driver");

			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Flipkart", "root", "root");
			String sql = "insert into User_Info values(?,?,?,?)";
			pstmt=con.prepareStatement(sql);
			pstmt.setInt(1, userBean.getUserId());
			pstmt.setString(2, userBean.getUserName());
			pstmt.setString(3, userBean.getEmailId());
			pstmt.setString(4, userBean.getPassword());

			int n = pstmt.executeUpdate();

			if (n > 0) {
				registered = true;
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
		return registered;
	}

	public UserBean authenticate(int id, String password) {
		java.sql.Connection con = null;
		java.sql.PreparedStatement pstmt = null;
		ResultSet rs=null;

		UserBean userbean=null;
		try {
			Class.forName("com.mysql.jdbc.Driver");

			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Flipkart", "root", "root");
			String sql="select * from User_Info where UserID=? and password=?";
			pstmt=con.prepareStatement(sql);
			pstmt.setInt(1, id);
			pstmt.setString(2, password);

			rs=pstmt.executeQuery();
			if(rs.next()) {
				userbean=new UserBean();
				userbean.setUserId(rs.getInt("UserID"));
				userbean.setEmailId(rs.getString("Email"));
				userbean.setUserName(rs.getString("Username"));
				userbean.setPassword(rs.getString("password"));


			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		finally {
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
		return userbean;
	}
}

