package com.manthan.set.test;

import java.util.Iterator;
import java.util.TreeSet;

public class Teststudent {

	public static void main(String[] args) {
		StudentById byId=new StudentById();
		StudentByper byper=new StudentByper(); 

		Student s1=new Student("Vishal", 2, 33.5);
		Student s2=new Student("Anup", 4, 83.95);
		Student s3=new Student("Rima", 5, 73.55);
		Student s4=new Student("Anu", 1, 88.9);
		TreeSet<Student> treeSet=new TreeSet<Student>(byId);
		TreeSet<Student> treeSet2=new TreeSet<Student>(byper);
		treeSet.add(s4);
		treeSet.add(s3);
		treeSet.add(s2);
		treeSet.add(s1);


		treeSet2.add(s4);
		treeSet2.add(s3);
		treeSet2.add(s2);
		treeSet2.add(s1);

		Iterator<Student> it=treeSet.iterator();
		while (it.hasNext()) {
			Student student =  it.next();
			System.out.println(student);

		}
		System.out.println("----------------******--------------");
		Iterator<Student> it2=treeSet2.iterator();
		while (it2.hasNext()) {
			Student student =  it2.next();
			System.out.println(student);

		}
	}

}
