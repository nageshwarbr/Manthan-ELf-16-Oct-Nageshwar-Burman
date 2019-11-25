package com.manthan.collection.set;

import java.util.HashSet;
import java.util.Iterator;

public class TestS {

	public static void main(String[] args) {
		HashSet<String> hs=new HashSet<String>();
		hs.add("Vishal");
		hs.add("Anu");
		hs.add("Jon");
		hs.add("Priya");
		System.out.println("--------");

		for (String object : hs) {
			System.out.println(object);
		}
		System.out.println("--------");

		Iterator<String> it=hs.iterator();
		while (it.hasNext()) {
			String object =  it.next();
			System.out.println(object);
		}
	}

}
