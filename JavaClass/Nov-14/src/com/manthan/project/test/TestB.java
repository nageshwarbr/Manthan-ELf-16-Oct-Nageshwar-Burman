package com.manthan.project.test;

import java.util.function.Predicate;

public class TestB {

	public static void main(String[] args) {
		Student stu=new Student("Divya", 26.8, 22);
		Predicate<Student> ps=(s)->{
			if(s.percentage>=35){
			return true;
			}
			else {
				return false;
			}
		};
		boolean ans=ps.test(stu);
		System.out.println("Answer is "+ans);

	}

}
