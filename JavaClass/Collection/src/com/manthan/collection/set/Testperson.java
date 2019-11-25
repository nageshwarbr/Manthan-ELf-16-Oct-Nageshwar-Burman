package com.manthan.collection.set;

import java.util.HashSet;
import java.util.Iterator;

public class Testperson {

	public static void main(String[] args) {
		HashSet<Person> hs=new HashSet<Person>();
		Person p1=new Person("vish", 5, 2.2);
		Person p2=new Person("amit", 2, 5.3);
		Person p3=new Person("priya", 23, 8.3);
		Person p4=new Person("priya", 23, 8.3);

		hs.add(p4);
		hs.add(p3);
		hs.add(p2);
		hs.add(p1);
		
		System.out.println("--------");
		for (Object object : hs) {
			System.out.println(object);
		}
		System.out.println("--------");
		Iterator it=hs.iterator();
		while (it.hasNext()) {
			Object object =  it.next();
			System.out.println(object);
		}

	}

}
