package com.manthan.collection.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class TestT {

	public static void main(String[] args) {
		LinkedHashSet<Double> hs=new LinkedHashSet<Double>();
		hs.add(2.4);
		hs.add(3.4);
		hs.add(5.2);
		hs.add(2.3);
		hs.add(null);
		hs.add(null);
		
		System.out.println("--------");

		for (Double object : hs) {
			System.out.println(object);
		}
		System.out.println("--------");

		Iterator<Double> it=hs.iterator();
		while (it.hasNext()) {
			Double object =  it.next();
			System.out.println(object);
		}
	}

}
