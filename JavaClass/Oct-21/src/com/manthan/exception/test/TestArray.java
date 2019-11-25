package com.manthan.exception.test;

public class TestArray {

	public static void main(String[] args) {
		int a[]=new int[3];
		System.out.println("main started");
		String name=null;
		try {
			System.out.println(a[5]);
			System.out.println(10/0);
			System.out.println("Hi");
			System.out.println("Have a good day");
			System.out.println(name.length());
		}
		catch(ArrayIndexOutOfBoundsException i) {
			System.out.println("Dont cross array boundary");
		}
		catch(NullPointerException e) {
			System.out.println("Dont deal with null");
		}
		catch(Exception e) {
			System.out.println("General message");
		}
		System.out.println("Main ended");
	}

}
