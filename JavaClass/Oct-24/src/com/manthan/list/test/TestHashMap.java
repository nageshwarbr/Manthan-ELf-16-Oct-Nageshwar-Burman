package com.manthan.list.test;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class TestHashMap {

	public static void main(String[] args) {

		HashMap<Character, String> hm=new HashMap<Character, String>();
		hm.put('M', "May");
		hm.put('A', "ape");
		hm.put('n', "low");
		hm.put('p', "Cat");
		Set<Map.Entry<Character, String>> se=hm.entrySet();
		
		for(Map.Entry<Character, String> x:se) {
			Character k=x.getKey();
			String v=x.getValue();
			System.out.println("key "+k);
			System.out.println("value "+k);
			System.out.println("==============");
		}
		
	}

}
