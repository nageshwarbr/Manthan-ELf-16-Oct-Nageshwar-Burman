package com.manthan.numbThree;

public class Student {
	String name;
	char gender;
	Double marks;
	public Student(String name, char gender, double marks) {
		this.name = name;
		this.gender = gender;
		this.marks = marks;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", gender=" + gender + ", marks=" + marks + "]";
	}
	
}
