package com.manthan.exception.test;

public class AgeSimulator {
	void verify(int age) throws InvalidAgeException {
		if(age<18) {
			InvalidAgeException ageException=new InvalidAgeException();
			throw ageException;
		}
	}
}
