package com.manthan.exception.test;

public class TestDaylimit {
	public static void main(String[] args) {
		System.out.println("Main started");
		ATMSimulator a=new ATMSimulator();
		try {
		a.verify(12222);
		}
		catch (DaylimitException e) {
			e.printStackTrace();
		}
		System.out.println("Main ended");
	}
}
