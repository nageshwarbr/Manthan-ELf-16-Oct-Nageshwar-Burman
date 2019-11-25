package com.manthan.exception.test;

public class InvalidAgeException extends Exception{
	private String meassage="Sorry you are too young";
	public InvalidAgeException() {
	}
	public InvalidAgeException(String meassage) {
		this.meassage = meassage;
	}
	public String getMessage() {
		return meassage;
	}
}
