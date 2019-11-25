package com.manthan.array.test;

public class TestF {

	public static void main(String[] args) {

		Student student=new Student("Anitha", 20, 53.5);
		Student student2=new Student("Raju", 8, 85.2);
		Student student4=new Student("Anil", 41, 58.2);
		Student student5=new Student("Vishal",5, 369.2);
		Student s[]=new Student[2];
		s[0]=student;
		s[1]=student2;
		s[2]=student4;
		s[3]=student5;
		for (Student student3 : s) {
			System.out.println(student3.name);
			System.out.println(student3.id);
			System.out.println(student3.percentage);
			System.out.println("---------");
		}
	}

}
