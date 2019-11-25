package com.manthan.empwebappp.util;

import com.manthan.empwebappp.dao.EmployeeDao;
import com.manthan.empwebappp.dao.EmployyeInfoDaoImpl;

public class EmployeeDaoImplManager {
private EmployeeDaoImplManager() {
	
}
public static EmployeeDao getDaoInstance() {
	return new EmployyeInfoDaoImpl();
}
}
