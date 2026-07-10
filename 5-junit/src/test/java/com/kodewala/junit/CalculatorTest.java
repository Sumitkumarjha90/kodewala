package com.kodewala.junit;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CalculatorTest {
	
	@Test
	public void testaddTwoNum() {
		Calculator calculator = new Calculator();
		
		int expected = 30;
		
		int actual = calculator.addTwoNum(10, 20);
		
		assertEquals(expected, actual);
		
		
		
		
	}

}
