package com.manthan.project.test;

import java.util.function.Function;

public class TestD {
	public static void main(String[] args) {
		Student stu=new Student("Divya", 26.8, 22);
		Function<Student, Student> fn=(s)->{
			s.percentage=s.percentage+4;
			return s;
		};
		Student st=fn.apply(stu);
		System.out.println("New percentage is "+stu.percentage);
	}
}
