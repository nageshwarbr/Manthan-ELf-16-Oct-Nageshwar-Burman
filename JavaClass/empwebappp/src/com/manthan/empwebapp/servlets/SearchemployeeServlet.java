package com.manthan.empwebapp.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.mysql.jdbc.Connection;
@WebServlet("/searchEmp")
public class SearchemployeeServlet extends HttpServlet {
@Override
protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	HttpSession session=req.getSession(false);

	String empIdval=req.getParameter("empId");
	int empId=Integer.parseInt(empIdval);
	java.sql.Connection con=null;
	PreparedStatement pstmt=null;
	ResultSet rs=null;
	try {
	Class.forName("com.mysql.jdbc.Driver");
	con=DriverManager.getConnection("jdbc:mysql://localhost:3306/elf_employee_db","root","root");
	String sql="select * from employee_info where emo_id=?";
	pstmt=con.prepareStatement(sql);
	pstmt.setInt(1, empId);
	rs=pstmt.executeQuery();
	PrintWriter out=resp.getWriter();
	if(rs.next()) {
		
		
		String  name=rs.getString("emp_name");
		int age=rs.getInt("age");
		double salary=rs.getDouble("salary");
		String designation=rs.getString("designation");
		long mobile=rs.getLong("mobile");
		out.print("<html>");
		out.print("<html>");
		out.println("Id "+empId+" found "+"<br>");
		out.println("name "+name+"<br>");
		out.println("Age "+age+"<br>");
		out.println("Salary "+salary+"<br>");
		out.println("mobile "+mobile+"<br>");
		out.println("dsignation "+designation+"<br>");
		out.print("<a href='./logout'>Logout</a>");
		out.print("</body>");
		out.print("</html>");
		
	}
	else {
		out.print("<html>");
		out.print("<body>");
	    out.println("No records!!");
		out.print("</body>");
		out.print("</html>");
	}
	
	}
	catch (Exception e) {
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
