package com.manthan.jdbc.employeemanagement;

import java.sql.Connection;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import com.mysql.jdbc.Driver;


public class MyFirstJdbc {

	public static void main(String[] args) {

		Connection con=null;
		Statement stmt=null;
		ResultSet rs=null;

		try {
			Driver driver=new Driver();
			DriverManager.registerDriver(driver);
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/elf_employee_db?user=root&password=root");

			stmt=con.createStatement();
			rs=stmt.executeQuery("select * from employee_info");

			while(rs.next()) {
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

				System.out.println("-------------");

			}
		}
		catch(Exception e) {
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

	

}//End of main

}//end of class
