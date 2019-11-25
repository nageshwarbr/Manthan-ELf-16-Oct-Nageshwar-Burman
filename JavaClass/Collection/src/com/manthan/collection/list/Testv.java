package com.manthan.collection.list;

import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class Testv {

	public static void main(String[] args) {
		Vector<Character> v=new Vector<Character>();
		v.add('A');
		v.add('P');
		v.add('P');
		v.add('L');
		v.add('E');
		for (int i = 0; i < v.size(); i++) {
			Character r=v.get(i);
			System.out.println(r);
		}
		
		System.out.println("--------");
		
		for (Character object : v) {
			System.out.println(object);
		}
		
		System.out.println("--------");
		
		Iterator<Character> it=v.iterator();
		while (it.hasNext()) {
			Character object =  it.next();
			System.out.println(object);
		}
		
		System.out.println("--------");
		
		ListIterator<Character> listIterator=v.listIterator(v.size());
		while (listIterator.hasPrevious()) {
			Character o=listIterator.previous();
			System.out.println(o);
		}
	}

}
