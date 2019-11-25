package com.manthan.lambda.test;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

public class TestTreeset {

	public static void main(String[] args) {
		/*
		 * Comparator<Student> comId=(o1,o2)->{ Integer i=o1.id; Integer j=o2.id; return
		 * i.compareTo(j); };
		 */

		/*
		 * Comparator<Student> comPer=(o1,o2)->{ Double i=o1.percentage; Double
		 * j=o2.percentage; return i.compareTo(j); };
		 */
		/* Comparator<Student> comName=(o1,o2)->o1.name.compareTo(o2.name); */

		TreeSet<Student> set=new TreeSet<Student>(StudentLogic.comName);
		//	TreeSet<Student> set=new TreeSet<Student>(StudentLogic.comId);
		
		//	TreeSet<Student> set=new TreeSet<Student>(StudentLogic.comPer);

		Student student=new Student("Vishal", 22, 33.5);
		Student student2=new Student("Rimi", 4, 89.5);
		Student student3=new Student("Anil", 77, 87.5);


		set.add(student3);
		set.add(student2);
		set.add(student);

		Iterator<Student> st=set.iterator();
		while (st.hasNext()) {
			Student student4 =st.next();
			System.out.println(student4);

		}
	}
}
