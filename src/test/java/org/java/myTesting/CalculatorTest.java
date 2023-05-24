package org.java.myTesting;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assumptions.assumeTrue;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class CalculatorTest {
	
	private static Float x = null;
	private static Float y = null;
	
	@BeforeAll
	public static void init() {
		
		x = 10f;
		y = 20f;
	}
	
	@Test
	public void addTest() {
		
		final float myRes = x + y;
		final float res = Calculator.add(x, y);
		
		assertEquals(myRes, res);
	}
	
	@Test
	public void addPositiveTest() {
		
		final float res = Calculator.add(x, y);
		
		assertTrue(res > 0)
;	}
	
	@Test
	public void subtractTest() {
		
		final float myRes = x - y;
		final float res = Calculator.subtract(x, y);
		
		assertEquals(myRes, res);
	}
	
	@Test
	public void divideTest() throws Exception {
		
		assumeTrue(y != 0);
		
		final float myRes = x / y;
		final float res = Calculator.divide(x, y);
		
		assertEquals(myRes, res);
	}
	
	@Test
	public void divideByZeroTest() {
		
		assumeTrue(y == 0);
		
		assertThrows(Exception.class, 
				() -> Calculator.divide(x, 0));
	}
	
	@Test
	public void multiplyTest() {
		
		final float myRes = x * y;
		final float res = Calculator.multiply(x, y);
		
		assertEquals(myRes, res);
	
	}
	
	@Test
	public void multiplyPositiveTest() {
		
		final float res = Calculator.multiply(x, y);
		
		assertTrue(res > 0)
;	}
}
