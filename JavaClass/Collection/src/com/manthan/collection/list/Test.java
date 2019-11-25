package com.manthan.collection.list;

import java.util.ArrayList;
import java.util.ListIterator;

public class Test {

	public static void main(String[] args) {
		ArrayList al=new ArrayList();
		al.add(5);
		al.add('F');
		al.add(2.4);
		al.add("Simran");
		ListIterator it=al.listIterator(al.size());
		while (it.hasPrevious()) {
			Object object=it.previous();
			System.out.println(object);
		}
	}

}
