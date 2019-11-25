package com.manthan.collection.list;

import java.util.ArrayList;
import java.util.Iterator;

public class TestG {
	public static void main(String[] args) {

		ArrayList<Double> arrayList=new ArrayList<Double>();
		arrayList.add(2.4);
		arrayList.add(5.8);
		arrayList.add(3.6);
		arrayList.add(4.1);
		for (int i = 0; i < arrayList.size(); i++) {
			Double double1=arrayList.get(i);
			System.out.println(double1);

		}
	}
}
