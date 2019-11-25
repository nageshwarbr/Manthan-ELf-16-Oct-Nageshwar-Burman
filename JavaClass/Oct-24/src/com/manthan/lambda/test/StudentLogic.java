package com.manthan.lambda.test;

import java.util.Comparator;

public interface StudentLogic {

	Comparator<Student> comId=(o1,o2)->{ Integer i=o1.id; Integer j=o2.id; return
			i.compareTo(j); };



			Comparator<Student> comPer=(o1,o2)->{ Double i=o1.percentage; Double
			j=o2.percentage; return i.compareTo(j); };

			Comparator<Student> comName=(o1,o2)->o1.name.compareTo(o2.name);
}
