package com.manthan.object.test;

public class TestCow {
	public static void main(String[] args) {
		Animal a=new Cow();//upcasting
		Cow r=(Cow)a;//downcasting
		r.cost=55;
		r.size=55;
		r.run();
		r.eat();
		System.out.println(r.cost);
		System.out.println(r.size);
	}
}
