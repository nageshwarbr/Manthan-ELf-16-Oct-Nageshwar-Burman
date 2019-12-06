package com.manthan.usecase.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import com.manthan.usecase.bean.ItemBean;

public class TotalBill {
public void totalBill() {
	Connection con=null;
	Statement stmt=null;
	ResultSet rs=null;
	try {
		Class.forName("com.mysql.jdbc.Driver");
		con=DriverManager.getConnection("jdbc:mysql://localhost:3306/Hotel_DB?user=root&password=root");
		stmt=con.createStatement();
		rs=stmt.executeQuery("select sum(Price) from Hotel_Bill");
       
		while(rs.next()) {

			System.out.println("Total bill for the day is : "+rs.getDouble("sum(Price)"));
			

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

