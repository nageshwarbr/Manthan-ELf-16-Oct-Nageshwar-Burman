package com.manthan.collection.list;

import java.util.ArrayList;

public class TestD {

	public static void main(String[] args) {
		ArrayList<Double> arrayList=new ArrayList<Double>();
		arrayList.add(2.4);
		arrayList.add(5.8);
		arrayList.add(3.6);
		arrayList.add(4.1);
		for (Double double1 : arrayList) {
			System.out.println(double1);
		}
	}

}
