package com.manthan.overloading.test;

public class TestStudent {
	public static void main(String[] args) {
		Student student=new Student();
		student.setId(23);
		student.setName("rina");
		DB db=new DB();
		db.display(student);
	}
}
