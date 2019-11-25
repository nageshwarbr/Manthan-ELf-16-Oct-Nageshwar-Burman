package com.manthan.exception.test;

public class ATMSimulator {
void verify(int amt) {
	if(amt>10000) {
		DaylimitException daylimitException=new DaylimitException();
		throw daylimitException;
	}
}
}
