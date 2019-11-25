package com.manthan.array.test;

public class TestA {

	public static void main(String[] args) {
		int[] a=new int[4];
		a[0]=1;
		a[1]=2;
		a[2]=3;
		a[3]=4;
		for (int i= 0; i < a.length;i ++) {
			System.out.println(a[i]);
		}
		System.out.println("---------------");
		char[] ch=new char[5];
		ch[0]='A';
		ch[1]='P';
		ch[2]='P';
		ch[3]='L';
		ch[4]='E';
		for (int i = 0; i < ch.length; i++) {
			System.out.println(ch[i]);
		}
		System.out.println("-----------------");
		double[] d=new double[5];
		d[0]=5.6;
		d[1]=2.4;
		d[2]=9.2;
		d[3]=3.4;
		d[4]=4.1;
		for (int i = 0; i < d.length; i++) {
			System.out.println(d[i]);
		}
		System.out.println("-----------------");
		String[] s=new String[4];
		s[0]="dimple";
		s[1]="chimu";
		s[2]="raju";
		s[3]="priya";
		for (int i = 0; i < s.length; i++) {
			System.out.println(s[i]);
		}
		
	}

}
