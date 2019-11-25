package com.manthan.numbThree;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class TestArrayList {
public static void main(String[] args) {
	ArrayList<Animal> al=new ArrayList<Animal>();
	Animal a1=new Dog();
	Animal a2=new Dog();
	Animal a3=new Dog();
	Animal a4=new Dog();
	Animal a5=new Dog();
	Animal a6=new Dog();
	Animal a7=new Dog();
	Animal a8=new Dog();
	Animal a9=new Dog();
	
	Animal a10=new Lion();
	Animal a11=new Lion();
	Animal a12=new Lion();
	Animal a13=new Lion();
	Animal a14=new Lion();
	Animal a15=new Lion();
	Animal a16=new Lion();
	Animal a17=new Lion();
	Animal a18=new Lion();
	al.add(a18);
	al.add(a17);
	al.add(a16);
	al.add(a15);
	al.add(a14);
	al.add(a13);
    al.add(a12);
	al.add(a11);
	al.add(a10);
	al.add(a9);
	al.add(a8);
	al.add(a7);
	al.add(a6);
	al.add(a5);
	al.add(a4);
	al.add(a3);
	al.add(a2);
	al.add(a1);
	
	Predicate<Animal> pr=ani->ani instanceof Lion;
		
	List<Animal> bl=al.stream().filter(pr).collect(Collectors.toList());
	System.out.println("Number of lions "+bl.size());
	
	
}
}
