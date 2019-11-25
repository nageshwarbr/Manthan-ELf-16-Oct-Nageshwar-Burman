package com.manthan.exception.test;

public class DaylimitException extends RuntimeException {
	private String message="You have crossed the limit";
	public DaylimitException() {
	
	}
	public DaylimitException(String message) {
		this.message = message;
	}
	public String getMessage() {
		return message;
	}
}
