package com.manthan.exception.test;

public class TestIRCTC {

	public static void main(String[] args) {
		System.out.println("Main method");
		Paytm paytm=new Paytm();
		try {
			paytm.book();
		}
		catch (ArithmeticException e) {
			System.out.println("exception @ MAin ");
		}
		System.out.println("Main ended");
	}

}
