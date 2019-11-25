package com.manthan.jdbc.employeemanagement;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class Update {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter employee Id");
		int emp_id=sc.nextInt();
		
		
		System.out.println("Enter mobile");
		long mob=sc.nextLong();
		
		java.sql.Connection con=null;
		PreparedStatement pstmt=null;
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			String dbUrl="jdbc:mysql://localhost:3306/elf_employee_db";
			String sql="update employee_info set mobile=? where emo_id=?";
			con= DriverManager.getConnection(dbUrl, "root", "root");
			pstmt=con.prepareStatement(sql);
			
			
			pstmt.setLong(1, mob);
			pstmt.setInt(2, emp_id);
			
			int n=pstmt.executeUpdate();
			if(n>0) {
				System.out.println("Record updated successfully");
			}
			else {
				System.out.println("Not successful");
			}
			}
		catch (Exception e) {
			e.printStackTrace();
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
	}

}
