package com.manthan.exception.test;

public class TestAge {
	public static void main(String[] args) {
		System.out.println("Main started");
		AgeSimulator ageSimulator=new AgeSimulator();
		try {
			ageSimulator.verify(17);
		} catch (InvalidAgeException e) {
			e.printStackTrace();
		}
		System.out.println("Main ended");
	}
}
