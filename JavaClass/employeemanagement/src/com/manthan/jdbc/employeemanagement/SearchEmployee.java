package com.manthan.jdbc.employeemanagement;


import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

import javax.net.ssl.HttpsURLConnection;

import com.mysql.jdbc.Connection;


public class SearchEmployee {
public static void main(String[] args) {
	
		java.sql.Connection con=null;
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the employee Id");
		int empId=sc.nextInt();
		try {
			Class.forName("com.mysql.jdbc.Driver");
			String dbUrl="jdbc:mysql://localhost:3306/elf_employee_db";
			String sql="select * from employee_info where emo_id=?";
			con= DriverManager.getConnection(dbUrl, "root", "root");
			pstmt=con.prepareStatement(sql);
			pstmt.setInt(1, empId);

			rs=pstmt.executeQuery();
			if(rs.next()) {
				int empID=rs.getInt("emo_id");
				String  name=rs.getString("emp_name");
				int age=rs.getInt("age");
				double salary=rs.getDouble("salary");
				String designation=rs.getString("designation");
				long mobile=rs.getLong("mobile");
				System.out.println("Id "+empID);
				System.out.println("name "+name);
				System.out.println("Age "+age);
				System.out.println("Salary "+salary);
				System.out.println("mobile "+mobile);
				System.out.println("dsignation "+designation);
			}
			else {
				System.out.println("No records!!");
			}}
		catch (Exception e) {
			e.printStackTrace();
			// TODO: handle exception
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
}

}//End of class
