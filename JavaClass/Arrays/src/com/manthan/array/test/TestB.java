package com.manthan.array.test;

public class TestB {
	public static void main(String[] args) {
		
		String r="raju";
		char[] a=r.toCharArray();
		for (int i = a.length-1; i >=0; i--) {
			System.out.println(a[i]);
		}
		double[] d=new double[5];
		d[0]=5.4;
		d[1]=2.8;
		d[2]=9.7;
		d[3]=8.4;
		d[4]=4.1;
		for (double e : d) {
			System.out.println(e);
		}
	}
}
