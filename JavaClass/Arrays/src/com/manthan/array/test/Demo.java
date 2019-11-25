package com.manthan.array.test;

public class Demo {
void eat(int[] a) {
	for (int i : a) {
		System.out.println(i);
	}
}
void display(Student[] s) {
	for (Student student : s) {
		System.out.println(student.name);
	}
}
double[] getMe() {
	double[] r= {4.5,5.6,8.0,7.3};
	return r;
}
}
