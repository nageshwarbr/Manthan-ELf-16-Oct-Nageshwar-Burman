package com.manthan.usecase.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import com.manthan.usecase.bean.ItemBean;

public class ShowAll {
	public void showAllItems() {
		Connection con=null;
		Statement stmt=null;
		ResultSet rs=null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/Hotel_DB?user=root&password=root");
			stmt=con.createStatement();
			rs=stmt.executeQuery("select * from Hotel_Bill");
            ItemBean itemBean=new ItemBean();
			while(rs.next()) {
				itemBean.setItemCode(rs.getInt("Item_Code"));
				itemBean.setItemName(rs.getString("Food_Name"));
				itemBean.setPrice(rs.getDouble("Price"));
				

				System.out.println("Item code"+itemBean.getItemCode());
				System.out.println("Item name "+itemBean.getItemName());
				System.out.println("Item price "+itemBean.getPrice());
				

				System.out.println("-------------");


			}

		} catch (Exception e) {

			e.printStackTrace();
		} 
		finally {
			try {
				if(rs!=null) {
					rs.close();
				}
			}
			catch(Exception e2){
				e2.printStackTrace();
			}
			try {
				if(stmt!=null) {
					stmt.close();
				}
			}
			catch(Exception e2){
				e2.printStackTrace();
			}
			try {
				if(con!=null) {
					con.close();
				}
			}
			catch(Exception e2){
				e2.printStackTrace();
			}
		}

	}

}
