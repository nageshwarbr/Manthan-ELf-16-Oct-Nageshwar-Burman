package com.manthan.usecase.test;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class Operate {
	public void addItem() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Item_code");
		int itemCode=sc.nextInt();
		sc.nextLine();
		System.out.println("Enter item name");
		String name=sc.next();

		System.out.println("Enter item price ");
		double price=sc.nextDouble();
		

		java.sql.Connection con=null;
		PreparedStatement pstmt=null;

		try {
			Class.forName("com.mysql.jdbc.Driver");
			String dbUrl="jdbc:mysql://localhost:3306/Hotel_DB";
			String sql="insert into Hotel_Bill values(?,?,?)";
			con= DriverManager.getConnection(dbUrl, "root", "root");
			pstmt=con.prepareStatement(sql);
			pstmt.setInt(1, itemCode);
			pstmt.setString(2, name);
			pstmt.setDouble(3, price);
			

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
	}
	public void modifyItem() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Item_code");
		int itemCode=sc.nextInt();
		sc.nextLine();
		System.out.println("Enter item name");
		String name=sc.next();

		System.out.println("Enter item price ");
		double price=sc.nextDouble();
		java.sql.Connection con=null;
		PreparedStatement pstmt=null;

		try {
			Class.forName("com.mysql.jdbc.Driver");
			String dbUrl="jdbc:mysql://localhost:3306/Hotel_DB";
			String sql="update Hotel_Bill set Food_Name=?,Price=? where Item_Code=?";
			con= DriverManager.getConnection(dbUrl, "root", "root");
			pstmt=con.prepareStatement(sql);


			pstmt.setInt(3, itemCode);
			pstmt.setString(1, name);
			pstmt.setDouble(2,price);
			
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
	public void deleteItem() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Item_code");
		int itemCode=sc.nextInt();

		java.sql.Connection con=null;
		PreparedStatement pstmt=null;

		try {
			Class.forName("com.mysql.jdbc.Driver");
			String dbUrl="jdbc:mysql://localhost:3306/Hotel_DB";
			String sql="delete from Hotel_Bill where Item_Code=?";
			con= DriverManager.getConnection(dbUrl, "root", "root");
			pstmt=con.prepareStatement(sql);
			pstmt.setInt(1, itemCode);
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
	}
}
