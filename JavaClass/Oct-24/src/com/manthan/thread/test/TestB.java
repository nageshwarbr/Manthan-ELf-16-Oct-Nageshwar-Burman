 package com.manthan.thread.test;

public class TestB {

	public static void main(String[] args) {
		System.out.println("main started");

		MyTask t=new MyTask();
		t.start();
		
		MyTask t2=new MyTask();
		t2.start();

		
		System.out.println("main ended");
	}

}
