package com.manthan.collection.list;


import java.util.TreeSet;



public class TestPerson {

	public static void main(String[] args) {
		TreeSet<Person> hs=new TreeSet<Person>();
		Person p1=new Person("vish", 5, 2.2);
		Person p2=new Person("amit", 2, 5.3);
		Person p3=new Person("priya", 23, 8.3);
		

		
		hs.add(p3);
		hs.add(p2);
		hs.add(p1);
		
		System.out.println("--------");
		for (Person object : hs) {
			System.out.println(object);
		}
	}

}
