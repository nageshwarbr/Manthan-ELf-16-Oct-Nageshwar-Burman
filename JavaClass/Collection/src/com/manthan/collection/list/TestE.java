package com.manthan.collection.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class TestE {

	public static void main(String[] args) {
		ArrayList<Double> arrayList=new ArrayList<Double>();
		arrayList.add(2.4);
		arrayList.add(5.8);
		arrayList.add(3.6);
		arrayList.add(4.1);
		
		Iterator<Double> iterator=arrayList.iterator();
		while(iterator.hasNext()) {
			Double r=iterator.next();
			System.out.println(r);
		}
		System.out.println("--------");
		
		ListIterator<Double> iterator2=arrayList.listIterator();
		while (iterator2.hasNext()) {
			Double double1=iterator2.next();
			System.out.println(double1);
		}
		System.out.println("--------");
		
		ListIterator<Double> i=arrayList.listIterator(4);
		while (i.hasPrevious()) {
			Double d=i.previous();
			System.out.println(d);
		}
	}

}
