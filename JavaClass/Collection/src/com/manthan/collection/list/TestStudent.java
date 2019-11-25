package com.manthan.collection.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class TestStudent {
	public static void main(String[] args) {
		ArrayList<Student> list=new ArrayList<Student>();
		Student s=new Student("Vis", 20, 37.5);
		Student t=new Student("Anu", 21, 85.5);
		Student u=new Student("Erny", 15, 66.5);
		Student v=new Student("Suman", 14, 36.5);
		
		list.add(s);
		list.add(t);
		list.add(u);
		list.add(v);
		for (int i = 0; i < list.size(); i++) {
			Student object=list.get(i);
			System.out.println(object.id+" "+object.name+" "+object.percentage);
		}

		System.out.println("--------");

		for (Student object : list) {
			System.out.println(object.id+" "+object.name+" "+object.percentage);
			
		}

		System.out.println("--------");

		Iterator<Student> it=list.iterator();
		while (it.hasNext()) {
			Student object =  it.next();
			System.out.println(object.id+" "+object.name+" "+object.percentage);
		}

		System.out.println("--------");

		ListIterator<Student> listIterator=list.listIterator(list.size());
		while (listIterator.hasPrevious()) {
			Student object=listIterator.previous();
			System.out.println(object.id+" "+object.name+" "+object.percentage);

		}
	}
}
