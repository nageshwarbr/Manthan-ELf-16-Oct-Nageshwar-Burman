package com.manthan.collection.set;

import java.util.HashSet;
import java.util.Iterator;

public class TestP {

	public static void main(String[] args) {
		HashSet hs=new HashSet();
		hs.add("divya");
		hs.add("priya");
		hs.add('M');
		hs.add(14);
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
