package com.manthan.list.test;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.Map.Entry;

public class TestTreeMap2 {

	public static void main(String[] args) {
		TreeMap<Integer, String> hm=new TreeMap<Integer, String>();
		hm.put( 25,"May");
		hm.put(26,"ape");
		hm.put( 47,"low");
		hm.put(84,"Cat");
		Set<Entry<Integer, String>> se=hm.entrySet();
		
		for(Map.Entry<Integer, String> x:se) {
			Integer k=x.getKey();
			String v=x.getValue();
			System.out.println("key "+k);
			System.out.println("value "+v);
			System.out.println("==============");
		}
	}

}
