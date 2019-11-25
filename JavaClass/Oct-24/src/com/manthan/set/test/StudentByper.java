package com.manthan.set.test;

import java.util.Comparator;

public class StudentByper implements Comparator<Student>{

	@Override
	public int compare(Student o1, Student o2) {
		Double d=o1.percentage;
		Double d2=o2.percentage;
		return d2.compareTo(d);
	}

}
