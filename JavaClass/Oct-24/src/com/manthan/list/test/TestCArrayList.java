package com.manthan.list.test;

import java.util.List;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;

public class TestCArrayList {

	public static void main(String[] args) {

		List<Double> doubles=new ArrayList<Double>();
		doubles.add(2.3);
		doubles.add(5.6);
		doubles.add(1.8);
		doubles.add(3.8);
		doubles.add(4.0);
		
		Iterator<Double> it=doubles.iterator();
		while (it.hasNext()) {
			Double double1 =  it.next();
			System.out.println(double1);
			
		}
	}

}
