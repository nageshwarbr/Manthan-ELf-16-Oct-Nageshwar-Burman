package com.manthan.calculator;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

class CalculatorTest {

	private Calculator calculator;
	
	@BeforeEach
	public void createObject() {
		calculator=new Calculator();
	}
	@Test
	public void testAdd() {
		int res=calculator.add(3,3);
		assertEquals(6, res);
		double rs=calculator.div(10, 2);
		assertEquals(5, rs);
	}
	@Test
	public void testDiv()
	{
		int rs=calculator.div(10, 2);
		assertEquals(5, rs);
	}
	
	@Test
	@Disabled //disable the test cases given below
	public void testDivException() {

		//assertThrows check the exception and throws it if found
		assertThrows(ArithmeticException.class, ()->calculator.div(10, 0));
		
	}
}
