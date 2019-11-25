package com.manthan.set.test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class TestArray {
	public static void main(String[] args) {
		ArrayList doubles=new ArrayList<Student>();
		ArrayList<Student> doubles2=new ArrayList<Student>();
		ArrayList<Student> doubles3=new ArrayList<Student>();
		
		Student s1=new Student("Vishal", 2, 33.5);
		Student s2=new Student("Anup", 4, 83.95);
		Student s3=new Student("Rima", 5, 73.55);
		Student s4=new Student("Anu", 1, 88.9);
		
		Student s5=new Student("Anil", 2, 33.5);
		Student s6=new Student("boss", 4, 83.95);
		Student s7=new Student("Lima", 5, 73.55);
		Student s8=new Student("Anu", 1, 88.9);
		
		Student s9=new Student("line", 2, 33.5);
		Student s10=new Student("creepy", 4, 83.95);
		Student s12=new Student("root", 5, 73.55);
		Student s11=new Student("velu", 1, 88.9);
		
		doubles.add(s1);
		doubles.add(s2);
		doubles.add(s3);
		doubles.add(s4);
		
		doubles2.add(s5);
		doubles2.add(s6);
		doubles2.add(s7);
		doubles2.add(s8);
		
		
		doubles3.add(s9);
		doubles3.add(s10);
		doubles3.add(s11);
		doubles3.add(s12);
		
		HashMap<String,ArrayList<Student>> map=new HashMap<String,ArrayList<Student>>();
		
		map.put("first", doubles);
		map.put("second", doubles2);
		map.put("thirs", doubles3);
		
		Set<Map.Entry<String,ArrayList<Student>>> ts=map.entrySet();
		
		for (Entry<String, ArrayList<Student>> entry : ts) {
			String key=entry.getKey();
			ArrayList<Student> al=entry.getValue();
			System.out.println("position "+key);
			Iterator<Student> it=al.iterator();
			while (it.hasNext()) {
				Student student =  it.next();
				System.out.println(student);
				
			}
			
		}
		
		
		
		
		
	}

}
