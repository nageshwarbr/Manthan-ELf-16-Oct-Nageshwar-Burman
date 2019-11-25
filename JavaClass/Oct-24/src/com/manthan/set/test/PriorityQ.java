package com.manthan.set.test;

import java.util.Iterator;
import java.util.PriorityQueue;

public class PriorityQ {

	public static void main(String[] args) {
		PriorityQueue<Double> pq=new PriorityQueue<Double>();
		pq.add(3.56);
		pq.add(4.22);
		pq.add(7.8);
		pq.add(2.88);
		for (Double double1 : pq) {
			System.out.println(double1);
		}

	}

}
