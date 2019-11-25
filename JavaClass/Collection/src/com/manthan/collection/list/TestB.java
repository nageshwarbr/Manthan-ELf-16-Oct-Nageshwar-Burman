package com.manthan.collection.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class TestB {

	public static void main(String[] args) {
		ArrayList al=new ArrayList();
		al.add(5);
		al.add('F');
		al.add(2.4);
		al.add("Simran");
		
		/*for (Object object : al) {
			System.out.println(object);
		}*/
		
		/*Iterator it=al.iterator();
		while (it.hasNext()) {
			Object object =  it.next();
			System.out.println(object);
			*/
		
		ListIterator it=al.listIterator();
		while (it.hasNext()) {
			Object o=it.next();
			System.out.println(o);
			
		}
		System.out.println("----------------");
		while (it.hasPrevious()) {
			Object o=it.previous();
			System.out.println(o);
		}
		
		}
		
	}


