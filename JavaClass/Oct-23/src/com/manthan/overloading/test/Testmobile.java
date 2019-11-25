package com.manthan.overloading.test;

public class Testmobile {

	public static void main(String[] args) {

		Person person=new Person();
		person.age=22;
		person.walk();
		person.m.model=1996;
		person.m.decall();
		System.out.println(person.age);
		System.out.println(person.m.model);
	}

}
