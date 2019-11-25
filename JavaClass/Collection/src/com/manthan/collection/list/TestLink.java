package com.manthan.collection.list;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class TestLink {
	public static void main(String[] args) {
		LinkedList<String> li=new LinkedList<String>();
		li.add("Vishal");
		li.add("Anu");
		li.add("Jon");
		li.add("Priya");
		for (int i = 0; i < li.size(); i++) {
			String r=li.get(i);
			System.out.println(r);
		}
		
		System.out.println("--------");
		
		for (String object : li) {
			System.out.println(object);
		}
		
		System.out.println("--------");
		
		Iterator<String> it=li.iterator();
		while (it.hasNext()) {
			String object =  it.next();
			System.out.println(object);
		}
		
		System.out.println("--------");
		
		ListIterator<String> listIterator=li.listIterator(li.size());
		while (listIterator.hasPrevious()) {
			String o=listIterator.previous();
			System.out.println(o);
		}
	}
}
