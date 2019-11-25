package com.manthan.collection.list;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class TestLinked {
public static void main(String[] args) {
	LinkedList li=new LinkedList();
	li.add(23);
	li.add(2.4);
	li.add('F');
	li.add("Priya");
	for (int i = 0; i < li.size(); i++) {
		Object r=li.get(i);
		System.out.println(r);
	}
	System.out.println("--------");
	for (Object object : li) {
		System.out.println(object);
	}
	System.out.println("--------");
	Iterator it=li.iterator();
	while (it.hasNext()) {
		Object object =  it.next();
		System.out.println(object);
	}
	System.out.println("--------");
	ListIterator listIterator=li.listIterator();
	while (listIterator.hasPrevious()) {
		Object o=listIterator.previous();
		System.out.println(o);
	}
}
}
