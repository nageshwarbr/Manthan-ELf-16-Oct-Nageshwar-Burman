package com.manthan.project.test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class TestG {
	public static void main(String[] args) {
		ArrayList<Integer> arr=new ArrayList<Integer>();

		arr.add(10);
		arr.add(5);
		arr.add(66);
		arr.add(17);
		arr.add(12);
		System.out.println(arr);

		Predicate<Integer> pr=i->i%2!=0;

		List<Integer> arr2=new ArrayList<Integer>();

//		for (Integer integer : arr) {
//			if(integer%2!=0) {//if(pr.test(integer) {
//				arr2.add(integer);
//			}
//		}
		arr2=arr.stream().filter(pr).collect(Collectors.toList());
		System.out.println(arr2);
	}
}
