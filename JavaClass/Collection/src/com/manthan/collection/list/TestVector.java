package com.manthan.collection.list;

import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class TestVector {

	public static void main(String[] args) {

		
		Vector v=new Vector();
		v.add('A');
		v.add(2.4);
		v.add(15);
		v.add("Deepa");
		
		for (int i = 0; i < v.size(); i++) {
			Object r=v.get(i);
			System.out.println(r);
		}
		System.out.println("--------");
		for (Object object : v) {
			System.out.println(object);
		}
		System.out.println("--------");
		Iterator it=v.iterator();
		while (it.hasNext()) {
			Object object =  it.next();
			System.out.println(object);
		}
		System.out.println("--------");
		ListIterator listIterator=v.listIterator(v.size());
		while (listIterator.hasPrevious()) {
			Object o=listIterator.previous();
			System.out.println(o);
		}
	}

}
