package com.manthan.empwebappp.dao;

import com.manthan.empwebapp.beans.EmployeeInfoBean;

public interface EmployeeDao {
	public boolean update(EmployeeInfoBean employeeInfoBean);
	public boolean delete(EmployeeInfoBean employeeInfoBean);
	public EmployeeInfoBean authenticate(int empId,String password);
	public EmployeeInfoBean searchEmployee(int emp_idVal);
	public boolean addEmployee(EmployeeInfoBean employeeInfoBean);
}
