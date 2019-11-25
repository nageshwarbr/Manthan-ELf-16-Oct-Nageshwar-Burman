package com.manthan.lambda.test;

public class TestFact {

	public static void main(String[] args) {

		Factorial f=(i)->{
			int l=1;
			for (int j = 1; j <= i; j++) {
				l=l*j;
			}
			return l;
		};
		int val=f.fact(5);
		System.out.println(val);
		
	}

}
