package com.manthan.project.test;

import java.util.function.Supplier;

public class TestF {
public static void main(String[] args) {
	Supplier<Student> sup=
	()->new Student("Dimple", 88, 19);
	Student student=sup.get();
	
	System.out.println(student.age);
	System.out.println(student.name);
	System.out.println(student.percentage);
	
	
	
}
}
