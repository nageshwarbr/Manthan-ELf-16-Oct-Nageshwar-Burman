package com.manthan.jdbc.employeemanagement;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class AddEmp {

	public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
		System.out.println("Enter employee Id");
		int emp_id=sc.nextInt();
		sc.nextLine();
		System.out.println("Enter name");
		String name=sc.next();
		
		System.out.println("Enter age ");
		int empage=sc.nextInt();
		sc.nextLine();
		System.out.println("Enter salary ");
		double sal=sc.nextDouble();
		sc.nextLine();
		System.out.println("Enter designation ");
		String des=sc.nextLine();
		
		System.out.println("Enter mobile");
		long mob=sc.nextLong();
		
		java.sql.Connection con=null;
		PreparedStatement pstmt=null;
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			String dbUrl="jdbc:mysql://localhost:3306/elf_employee_db";
			String sql="insert into employee_info values(?,?,?,?,?,?)";
			con= DriverManager.getConnection(dbUrl, "root", "root");
			pstmt=con.prepareStatement(sql);
			pstmt.setInt(1, emp_id);
			pstmt.setString(2, name);
			pstmt.setInt(3, empage);
			pstmt.setDouble(4, sal);
			pstmt.setString(5, des);
			pstmt.setLong(6, mob);
			
			int n=pstmt.executeUpdate();
			if(n>0) {
				System.out.println("Record inserted successfully");
			}
			else {
				System.out.println("Not successful");
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
	}//End of main

}//End of class
