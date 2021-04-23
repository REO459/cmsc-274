package edu.ben.challenges.challenge2.test;

import static org.junit.Assert.*;

import org.junit.Test;

import edu.ben.challenges.challenge2.CodingChallenge2;

public class CodingChallenge2Test {
	
	@Test
	public void testReturnsAIfTheshIsEqualToVal() {
		CodingChallenge2 inputs = new CodingChallenge2();
		double val = 3;
		double mu = 3;
		double sigma = 3;
		double expected = 0 * ((val - mu) / sigma) / sigma;
	
		try {
			double actual = inputs.a(3, 3, 3);
			assertEquals(expected, actual, 1e-8);
		} catch (Exception e) {
			fail("Should not have thrown exception");
		}
	}
	
	
	@Test
	public void testReturnsAIfTheshDoesNotEqualToVal() {
		CodingChallenge2 inputs = new CodingChallenge2();
		double val = 5;
		double mu = 2;
		double sigma = 4;
		double valueC = (-val * val) / 2;
		double expected = valueC * ((val - mu) / sigma) / sigma;
	
		try {
			double actual = inputs.a(5, 2, 4);
			assertEquals(expected, actual, 1e-8);
		} catch (Exception e) {
			fail("Should not have thrown exception");
		}
	}
	
	@Test (expected = ArithmeticException.class)
	public void testSigmaIsZero() {
		CodingChallenge2 inputs = new CodingChallenge2();
		double actual = inputs.a(5, 2, 0);
	}

	@Test
	public void testReturnsCValue() {
		CodingChallenge2 inputs = new CodingChallenge2();
		
		double val = 0;
		double expected = (-val * val) / 2;
	
		try {
			double actual = inputs.a(0);
			assertEquals(expected, actual, 1e-8);
		} catch (Exception e) {
			fail("Should not have thrown exception");
		}
	}
	

	@Test
	public void testReturns0() {
		CodingChallenge2 inputs = new CodingChallenge2();
		
		double expected = 0;
	
		try {
			double actual = inputs.a(4.0);
			assertEquals(expected, actual, 1e-8);
		} catch (Exception e) {
			fail("Should not have thrown exception");
		}
	}
	
	@Test
	public void testZLessThanNegativeThresh() {
		CodingChallenge2 inputs = new CodingChallenge2();
		
		double expected = 0.0;
	
		try {
			double actual = inputs.b(-5.0);
			assertEquals(expected, actual, 1e-8);
		} catch (Exception e) {
			fail("Should not have thrown exception");
		}
	}
	
	@Test
	public void testZGreaterThanThresh() {
		CodingChallenge2 inputs = new CodingChallenge2();
		
		double expected = 1.0;
	
		try {
			double actual = inputs.b(5.0);
			assertEquals(expected, actual, 1e-8);
		} catch (Exception e) {
			fail("Should not have thrown exception");
		}
	}
	
	@Test
	public void testZEqualToThresh() {
		CodingChallenge2 inputs = new CodingChallenge2();
		
		double z = 4.0;
		double expected = (0.5 + 0 * (z));
	
		try {
			double actual = inputs.b(4.0);
			assertEquals(expected, actual, 1e-8);
		} catch (Exception e) {
			fail("Should not have thrown exception");
		}
	}
}
