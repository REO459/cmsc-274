package edu.ben.assignments.extracredit1.test;

import student.TestCase;
import org.junit.Test;

import edu.ben.assignments.extracredit1.ExtraCredit1;

/**
 * This is my extra credit 1 test
 *
 * @author omerb
 * @version 1.0
 */
public class ExtraCredit1Test extends TestCase {

	/**
	 * Test the method 1 with all positive numbers
	 */
	@Test
	public void testMethod1Positive() {
		// declares the variables for extra credit
		ExtraCredit1 numbers = new ExtraCredit1(1, 4, 2);
		// this is the expected value
		int expected = 2;
		// the actual value
		int actual;
		// checks to see if the method works
		try {
			actual = numbers.method1(1, 4, 2);
			assertEquals(expected, actual);
		} catch (Exception e) {
			fail("Should not have thrown exception");
		}
	}

	/**
	 * Test the method 1 with at least 1 negative number
	 */
	@Test
	public void testMethod1Negative() {
		// declares the variables for extra credit
		ExtraCredit1 numbers = new ExtraCredit1(-1, 4, 2);
		// this is the expected value
		int expected = -6;
		// the actual value
		int actual;
		// checks to see if the method works
		try {
			actual = numbers.method1(-1, 4, 2);
			assertEquals(expected, actual);
		} catch (Exception e) {
			fail("Should not have thrown exception");
		}
	}

	/**
	 * Test to check if a is greater than b
	 */
	@Test
	public void testMethod2AGreater() {
		// declares the variables for extra credit
		ExtraCredit1 numbers = new ExtraCredit1(4, 1, 2);
		// this is the expected value
		int expected = 4;
		// the actual value
		int actual;
		// checks to see if the method works
		try {
			actual = numbers.method2(4, 1);
			assertEquals(expected, actual);
		} catch (Exception e) {
			fail("Should not have thrown exception");
		}
	}

	/**
	 * Test to check if b is greater than a
	 */
	@Test
	public void testMethod2BGreater() {
		// declares the variables for extra credit
		ExtraCredit1 numbers = new ExtraCredit1(4, 5, 2);
		// this is the expected value
		int expected = 5;
		// the actual value
		int actual;
		// checks to see if the method works
		try {
			actual = numbers.method2(4, 5);
			assertEquals(expected, actual);
		} catch (Exception e) {
			fail("Should not have thrown exception");
		}
	}

	/**
	 * Test to check if b is equal to a
	 */
	@Test
	public void testMethod2Equal() {
		// declares the variables for extra credit
		ExtraCredit1 numbers = new ExtraCredit1(4, 4, 2);
		// this is the expected value
		int expected = 4;
		// the actual value
		int actual;
		// checks to see if the method works
		try {
			actual = numbers.method2(4, 4);
			assertEquals(expected, actual);
		} catch (Exception e) {
			fail("Should not have thrown exception");
		}
	}

	/**
	 * Test to check if method 4 comes out true
	 */
	@Test
	public void testMethod4True() {
		// declares the variables for extra credit
		ExtraCredit1 numbers = new ExtraCredit1(4, 5, 2);
		// this is the expected value
		boolean expected = true;
		// the actual value
		boolean actual;
		// checks to see if the method works
		try {
			actual = numbers.method4(4, 5, 2, 2);
			assertEquals(expected, actual);
		} catch (Exception e) {
			fail("Should not have thrown exception");
		}
	}

	/**
	 * Test to check if method 4 comes out false
	 */
	@Test
	public void testMethod4False() {
		// declares the variables for extra credit
		ExtraCredit1 numbers = new ExtraCredit1(4, 5, 2);
		// this is the expected value
		boolean expected = false;
		// the actual value
		boolean actual;
		// checks to see if the method works
		try {
			actual = numbers.method4(4, 5, 2, 3);
			assertEquals(expected, actual);
		} catch (Exception e) {
			fail("Should not have thrown exception");
		}
	}

	/**
	 * Test the calculation in method 5 for variable A
	 */
	@Test
	public void testMethod5GetA() {
		// declares the variables for extra credit
		ExtraCredit1 numbers = new ExtraCredit1(4, 5, 2);
		numbers.method5(4, 5, 2);
		// this is the expected value
		int expected = 2;
		// the actual value
		int actual;
		// checks to see if the method works
		try {
			actual = numbers.getA();
			assertEquals(expected, actual);
		} catch (Exception e) {
			fail("Should not have thrown exception");
		}
	}

	/**
	 * Test the calculation in method 5 for variable B
	 */
	@Test
	public void testMethod5GetB() {
		// declares the variables for extra credit
		ExtraCredit1 numbers = new ExtraCredit1(4, 5, 2);
		numbers.method5(4, 5, 2);
		// this is the expected value
		int expected = 5;
		// the actual value
		int actual;
		// checks to see if the method works
		try {
			actual = numbers.getB();
			assertEquals(expected, actual);
		} catch (Exception e) {
			fail("Should not have thrown exception");
		}
	}

	/**
	 * Test the calculation in method 5 for variable C
	 */
	@Test
	public void testSetGetC() {
		// declares the variables for extra credit
		ExtraCredit1 numbers = new ExtraCredit1(4, 5, 2);
		// does set c
		numbers.setC(2);
		// this is the expected value
		int expected = 2;
		// the actual value
		int actual;
		// checks to see if the method works
		try {
			actual = numbers.getC();
			assertEquals(expected, actual);
		} catch (Exception e) {
			fail("Should not have thrown exception");
		}
	}

}
