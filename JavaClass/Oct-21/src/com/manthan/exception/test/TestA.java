package com.manthan.exception.test;

public class TestA {
	public static void main(String[] args) {
		System.out.println("main started");
		String name=null;
		try {
			System.out.println(name.length());
		}
		catch(NullPointerException e) {
			System.out.println("Dont deal with null");
		}
		System.out.println("main ended");
	}
}
