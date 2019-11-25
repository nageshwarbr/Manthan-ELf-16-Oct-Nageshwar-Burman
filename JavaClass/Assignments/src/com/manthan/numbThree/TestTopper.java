package com.manthan.numbThree;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class TestTopper {
public static void main(String[] args) {
	Student a1=new Student("Anil",'M',39);
	Student a2=new Student("Arun",'M',27);
	Student a3=new Student("Sunil",'M',74);
	Student a4=new Student("Vishal",'M',77);
	Student a5=new Student("Rama",'M',48);
	Student a6=new Student("Sonu",'M',66);
	Student a7=new Student("Sima",'F',48);
	Student a8=new Student("Rina",'F',75);
	Student a9=new Student("Gita",'F',45);
	Student a10=new Student("Anu",'F',46);
	Student a11=new Student("Asish",'M',85);
	Student a12=new Student("Sam",'M',95);
	List<Student> st=new ArrayList<Student>();
	st.add(a12);
	st.add(a11);
	st.add(a10);
	st.add(a9);
	st.add(a8);st.add(a1);
	st.add(a7);
	st.add(a6);
	st.add(a5);
	st.add(a4);
	st.add(a3);
	st.add(a2);
	Predicate<Student> pr=std->std.gender=='M';
	Predicate<Student> pr2=std->std.gender=='F';
	
	List<Student> stu=st.stream().filter(pr).collect(Collectors.toList());
	Comparator<Student> c=(st1,st2)->st1.marks.compareTo(st2.marks);
	Student maleTopper=stu.stream().max(c).get();
	System.out.println(maleTopper);
	
	
	List<Student> stu2=st.stream().filter(pr2).collect(Collectors.toList());
	Student femaleTopper=stu2.stream().max(c).get();
	System.out.println(femaleTopper);
}
}
