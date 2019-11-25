package com.manthan.jdbc.employeemanagement;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class DeleteEmp {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter employee Id");
		int emp_id=sc.nextInt();

		java.sql.Connection con=null;
		PreparedStatement pstmt=null;

		try {
			Class.forName("com.mysql.jdbc.Driver");
			String dbUrl="jdbc:mysql://localhost:3306/elf_employee_db";
			String sql="delete from employee_info where emo_id=?";
			con= DriverManager.getConnection(dbUrl, "root", "root");
			pstmt=con.prepareStatement(sql);
			pstmt.setInt(1, emp_id);
			int n=pstmt.executeUpdate();
			if(n>0) {
				System.out.println("Record deleted successfully");
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
	}//end of main

}//end of class
