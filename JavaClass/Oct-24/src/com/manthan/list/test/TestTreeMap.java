package com.manthan.list.test;

import java.util.Hashtable;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class TestTreeMap {

	public static void main(String[] args) {
		TreeMap<Character, Integer> hm=new TreeMap<Character, Integer>();
		hm.put('M', 25);
		hm.put('A', 26);
		hm.put('n', 47);
		hm.put('p', 84);
		Set<Entry<Character, Integer>> se=hm.entrySet();
		
		for(Map.Entry<Character, Integer> x:se) {
			Character k=x.getKey();
			Integer v=x.getValue();
			System.out.println("key "+k);
			System.out.println("value "+v);
			System.out.println("==============");
		}
	}

}
