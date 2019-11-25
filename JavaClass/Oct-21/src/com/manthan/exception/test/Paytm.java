package com.manthan.exception.test;

public class Paytm {
	void book() {
		System.out.println("book started");
		IRCTC irctc=new IRCTC();
		try {
		irctc.confirm();
		}
		catch(ArithmeticException e) {
			System.out.println("exception caught at book");
		}
		System.out.println("book ended");
	}

}
