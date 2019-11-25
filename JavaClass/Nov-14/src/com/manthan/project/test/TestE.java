package com.manthan.project.test;

import java.util.function.Consumer;

public class TestE {
	public static void main(String[] args) {
		Student stu=new Student("Divya", 26.8, 22);
		Consumer<Student> cn=	
				s->{
					System.out.println("name is "+s.name);
					System.out.println("age is "+s.age);
					System.out.println("percentage is "+s.percentage);
				};
				cn.accept(stu);


	}
}
