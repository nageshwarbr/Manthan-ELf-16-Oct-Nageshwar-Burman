package com.manthan.usecase.test;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

import com.manthan.usecase.bean.ItemBean;

public class Takeorder {
public ItemBean takeOrder() {
	ItemBean itemBean=null;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter Item_Code");
	int itemCode=sc.nextInt();
	ResultSet rs=null;
	java.sql.Connection con=null;
	PreparedStatement pstmt=null;
	
	try {
		Class.forName("com.mysql.jdbc.Driver");
		String dbUrl="jdbc:mysql://localhost:3306/Hotel_DB";
		String sql="select Food_Name,Price from Hotel_Bill where Item_Code=?";
		con= DriverManager.getConnection(dbUrl, "root", "root");
		pstmt=con.prepareStatement(sql);
		pstmt.setInt(1, itemCode);

		rs=pstmt.executeQuery();
        
		if(rs.next()) {
			itemBean=new ItemBean();
			itemBean.setItemCode(itemCode);
			itemBean.setItemName(rs.getString("Food_Name"));
			itemBean.setPrice(rs.getDouble("Price"));
			

			System.out.println("Item code"+itemBean.getItemCode());
			System.out.println("Item name "+itemBean.getItemName());
			System.out.println("Item price "+itemBean.getPrice());
			System.out.println("-------------");
            

		}
		else {
			System.out.println("No records found");
		}

	} 
	catch (Exception e) {
		e.printStackTrace();
		// TODO: handle exception
	}
	finally {
		
		try {
			if(pstmt!=null) {
				pstmt.close();
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
	return itemBean;
}
}
