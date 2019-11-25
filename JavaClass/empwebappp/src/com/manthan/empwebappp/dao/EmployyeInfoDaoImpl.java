package com.manthan.empwebappp.dao;

import java.io.PrintWriter;
import java.sql.DriverManager;
import java.sql.ResultSet;

import com.manthan.empwebapp.beans.EmployeeInfoBean;
import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;

public class EmployyeInfoDaoImpl implements EmployeeDao {

	@Override
	public EmployeeInfoBean searchEmployee(int emp_idVal) {

		java.sql.Connection con = null;
		java.sql.PreparedStatement pstmt = null;
		ResultSet rs = null;
		EmployeeInfoBean infoBean = null;

		try {
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/elf_employee_db", "root", "root");
			String sql = "select * from employee_info where emo_id=?";
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, emp_idVal);
			rs = pstmt.executeQuery();

			if (rs.next()) {
				infoBean = new EmployeeInfoBean();
				infoBean.setEmpId(rs.getInt("emo_Id"));
				infoBean.setEmpName(rs.getString("emp_name"));
				infoBean.setAge(rs.getInt("age"));
				infoBean.setDesignation(rs.getString("designation"));
				infoBean.setMobile(rs.getLong("mobile"));
				infoBean.setSalary(rs.getDouble("salary"));
				
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (rs != null) {
					rs.close();
				}
			} catch (Exception e2) {
				e2.printStackTrace();
			}
			try {
				if (pstmt != null) {
					pstmt.close();
				}
			} catch (Exception e2) {
				e2.printStackTrace();
			}
			try {
				if (con != null) {
					con.close();
				}
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		return infoBean;

	}

	@Override
	public boolean addEmployee(EmployeeInfoBean employeeInfoBean) {
		java.sql.Connection con = null;
		java.sql.PreparedStatement pstmt = null;
		boolean isAdded = false;
		try {
			Class.forName("com.mysql.jdbc.Driver");

			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/elf_employee_db", "root", "root");
			String sql = "insert into employee_info values(?,?,?,?,?,?,?)";
			pstmt=con.prepareStatement(sql);
			pstmt.setInt(1, employeeInfoBean.getEmpId());
			pstmt.setString(2, employeeInfoBean.getEmpName());
			pstmt.setInt(3, employeeInfoBean.getAge());
			pstmt.setDouble(4, employeeInfoBean.getSalary());
			pstmt.setString(5, employeeInfoBean.getDesignation());
			pstmt.setLong(6, employeeInfoBean.getMobile());
			pstmt.setString(7, "qwerty");
			int n = pstmt.executeUpdate();

			if (n > 0) {
				isAdded = true;
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {

			try {
				if (pstmt != null) {
					pstmt.close();
				}
			} catch (Exception e2) {
				e2.printStackTrace();
			}
			try {
				if (con != null) {
					con.close();
				}
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		return isAdded;
	}

	@Override
	public EmployeeInfoBean authenticate(int empId, String password) {
		java.sql.Connection con = null;
		java.sql.PreparedStatement pstmt = null;
		ResultSet rs=null;

		EmployeeInfoBean employeeInfoBean=null;
		try {
			Class.forName("com.mysql.jdbc.Driver");

			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/elf_employee_db", "root", "root");
		String sql="select * from employee_info where emo_id=? and password=?";
		pstmt=con.prepareStatement(sql);
		pstmt.setInt(1, empId);
		pstmt.setString(2, password);
		
		rs=pstmt.executeQuery();
		if(rs.next()) {
			employeeInfoBean=new EmployeeInfoBean();
			employeeInfoBean.setEmpId(rs.getInt("emo_id"));
			employeeInfoBean.setEmpName(rs.getString("emp_name"));
			employeeInfoBean.setAge(rs.getInt("age"));
			employeeInfoBean.setDesignation(rs.getString("designation"));
			employeeInfoBean.setSalary(rs.getDouble("salary"));
			employeeInfoBean.setMobile(rs.getLong("mobile"));
			
		}
		
		} catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			try {
				if (rs != null) {
					rs.close();
				}
			} catch (Exception e2) {
				e2.printStackTrace();
			}
			try {
				if (pstmt != null) {
					pstmt.close();
				}
			} catch (Exception e2) {
				e2.printStackTrace();
			}
			try {
				if (con != null) {
					con.close();
				}
			} catch (Exception e2) {
				e2.printStackTrace();
			}
			
		}
		return employeeInfoBean;
	}

	@Override
	public boolean delete(EmployeeInfoBean employeeInfoBean) {
		java.sql.Connection con = null;
		java.sql.PreparedStatement pstmt = null;
		EmployeeInfoBean infoBean = null;
		boolean isdeleted = false;
		try {
			Class.forName("com.mysql.jdbc.Driver");

			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/elf_employee_db", "root", "root");
			String sql="delete from employee_info where emo_id=?";
			pstmt=con.prepareStatement(sql);
			pstmt.setInt(1, employeeInfoBean.getEmpId());
			int n = pstmt.executeUpdate();
			if (n > 0) {
				isdeleted = true;
			}
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		 finally {

				try {
					if (pstmt != null) {
						pstmt.close();
					}
				} catch (Exception e2) {
					e2.printStackTrace();
				}
				try {
					if (con != null) {
						con.close();
					}
				} catch (Exception e2) {
					e2.printStackTrace();
				}
			}
			return isdeleted;
		
	}

	@Override
	public boolean update(EmployeeInfoBean employeeInfoBean) {
		java.sql.Connection con = null;
		java.sql.PreparedStatement pstmt = null;
		boolean isUpdated = false;
		try {
			Class.forName("com.mysql.jdbc.Driver");

			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/elf_employee_db", "root", "root");
			String sql="update employee_info set mobile=? where emo_id=?";
			pstmt=con.prepareStatement(sql);
			pstmt.setInt(2, employeeInfoBean.getEmpId());
			pstmt.setLong(1,employeeInfoBean.getMobile());
			int n = pstmt.executeUpdate();
			if (n > 0) {
				isUpdated = true;
			}
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		 finally {

				try {
					if (pstmt != null) {
						pstmt.close();
					}
				} catch (Exception e2) {
					e2.printStackTrace();
				}
				try {
					if (con != null) {
						con.close();
					}
				} catch (Exception e2) {
					e2.printStackTrace();
				}
			}
			return isUpdated;
	}

	

}
