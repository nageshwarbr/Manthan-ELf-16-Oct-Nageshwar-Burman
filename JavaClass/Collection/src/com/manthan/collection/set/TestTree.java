package com.manthan.collection.set;

import java.util.HashSet;
import java.util.TreeSet;

public class TestTree {

	public static void main(String[] args) {
		TreeSet<String> hs=new TreeSet<String>();
		hs.add("Vishal");
		hs.add("Anu");
		hs.add("Jon");
		hs.add("Priya");
		for (String object : hs) {
			System.out.println(object);
		}
	}

}
