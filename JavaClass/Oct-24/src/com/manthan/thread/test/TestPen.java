package com.manthan.thread.test;

public class TestPen {

	public static void main(String[] args) {
		Pen x=new Pen();
		Thread t=new Thread(x);
		t.start();
	}

}
