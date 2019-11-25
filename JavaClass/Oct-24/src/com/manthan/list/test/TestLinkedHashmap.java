package com.manthan.list.test;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class TestLinkedHashmap {

	public static void main(String[] args) {

		LinkedHashMap<Character, String> hm=new LinkedHashMap<Character, String>();
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
