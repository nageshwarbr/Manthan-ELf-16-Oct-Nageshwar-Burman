package com.manthan.numbEight;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class TestBmi {
public static void main(String[] args) {
	Bmi b1=new Bmi(55,166);
	Bmi b2=new Bmi(69,168);
	Bmi b3=new Bmi(66,166);
	Bmi b4=new Bmi(78,166);
	Bmi b5=new Bmi(65,166);
	Bmi b6=new Bmi(88,166);
	Bmi b7=new Bmi(55,166);
	Bmi b8=new Bmi(78,166);
	
	List<Bmi> al=new ArrayList<Bmi>();
	al.add(b1);
	al.add(b2);
	al.add(b3);
	al.add(b4);
	al.add(b5);
	al.add(b6);
	al.add(b7);
	al.add(b8);
	
	Predicate<Bmi> bm=bmm->bmm.weight/bmm.height>=0.4;
	List<Bmi> bmiList=al.stream().filter(bm).collect(Collectors.toList());
	System.out.println(bmiList);
}
}
