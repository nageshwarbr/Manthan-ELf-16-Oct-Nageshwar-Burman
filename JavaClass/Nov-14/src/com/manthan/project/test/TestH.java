package com.manthan.project.test;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class TestH {
	public static void main(String[] args) {


		List<Integer> arr=new ArrayList<Integer>();

		arr.add(10);
		arr.add(5);
		arr.add(66);
		arr.add(17);
		arr.add(12);

		Function<Integer, Integer> fn=i->i*10;

		List<Integer> bl=arr.stream().map(fn).collect(Collectors.toList());
		System.out.println(bl);
		Comparator<Integer> c=(i,j)->i.compareTo(j);
		int a=arr.stream().max(c).get();
		int b=arr.stream().min(c).get();

		System.out.println(a);
		System.out.println(b);
	}
}