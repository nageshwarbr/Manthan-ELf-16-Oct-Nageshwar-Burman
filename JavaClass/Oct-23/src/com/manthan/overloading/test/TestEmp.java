package com.manthan.overloading.test;

public class TestEmp {
public static void main(String[] args) {
	Employee emp=new Employee();
	emp.setGender('M');
	emp.setHeight(1.75);
	emp.setName("Vishal");
	emp.setId(25);
	DBEmp dbEmp=new  DBEmp();
	dbEmp.save(emp);
}
}
