package com.manthan.object.test;

public class TestEmployee {
public static void main(String[] args) {
	Employee employee=new Employee("Vishal", 21, 58);
	int i=employee.hashCode();
	String n= employee.toString();
	System.out.println(i);
	System.out.println(n);
}
}
