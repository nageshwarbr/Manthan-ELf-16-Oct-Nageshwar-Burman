package com.manthan.lambda.test;

public class TestPen {

	public static void main(String[] args) {
		Pen p=(i,j)->i+j;
		int y=p.add(20, 50);
		System.out.println(y);
	}

}
