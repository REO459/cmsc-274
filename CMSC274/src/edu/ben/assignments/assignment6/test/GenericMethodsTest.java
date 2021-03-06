package edu.ben.assignments.assignment6.test;

import java.util.Arrays;
import java.util.List;
import org.junit.Test;

import edu.ben.assignments.assignment6.GenericMethods;
import student.TestCase;

/**
 * This is my generic test class
 * 
 * @author omerb
 * @version 1.0
 */
public class GenericMethodsTest extends TestCase {

	/**
	 * This is the find smallest test
	 */
	@Test
	public void testFindSmallest() {
		// declare variables
		GenericMethods<Integer> smallest = new GenericMethods<Integer>();
		List<Integer> numbersList = Arrays.asList(1, 2, 3, 4);
		int firstNumber = 0;
		int lastNumber = 3;
		int expected = 1;
		int actual = smallest.findSmallest(numbersList, firstNumber, lastNumber);
		try {
			// outputs the results
			assertEquals(expected, actual);
		} catch (Exception e) {
			fail("Should not have thrown exception");
		}
	}
	
	/**
	 * This is the find smallest test for zero
	 */
	@Test
	public void testFindSmallestZero() {
		// declare variables
		GenericMethods<Integer> smallest = new GenericMethods<Integer>();
		List<Integer> numbersList = Arrays.asList(0);
		int firstNumber = 0;
		int lastNumber = 0;
		int expected = 0;
		int actual = smallest.findSmallest(numbersList, firstNumber, lastNumber);
		try {
			// outputs the results
			assertEquals(expected, actual);
		} catch (Exception e) {
			fail("Should not have thrown exception");
		}
	}
	
	/**
	 * This is the find smallest test for negative
	 */
	@Test
	public void testFindSmallestNegative() {
		// declare variables
		GenericMethods<Integer> smallest = new GenericMethods<Integer>();
		List<Integer> numbersList = Arrays.asList(-1);
		int firstNumber = 0;
		int lastNumber = 0;
		int expected = -1;
		int actual = smallest.findSmallest(numbersList, firstNumber, lastNumber);
		try {
			// outputs the results
			assertEquals(expected, actual);
		} catch (Exception e) {
			fail("Should not have thrown exception");
		}
	}
	
	
	/**
	 * This is the exchange elements if the boolean is true
	 * 
	 * @param <T> the generic
	 */
	@Test
	public <T extends Comparable<T>> void testExchangeElementsTrue() {
		// declare variables
		GenericMethods<String> exchange = new GenericMethods<String>();
		String[] array = {"1", "2", "3", "4"};
		int indexOne = 0;
		int indexTwo = 3;
		boolean expected = true;
		boolean actual = exchange.exchangeElements(array, indexOne, indexTwo);
		try {
			// outputs the results
			assertEquals(expected, actual);
		} catch (Exception e) {
			fail("Should not have thrown exception");
		}
	}
	
	/**
	 * This is the exchange elements if the boolean is false and negative for Index One
	 * 
	 * @param <T> the generic
	 */
	@Test
	public <T extends Comparable<T>> void testExchangeElementsFalseNegativeIndexOne() {
		// declare variables
		GenericMethods<String> exchange = new GenericMethods<String>();
		String[] array = {"1", "2", "3", "4"};
		int indexOne = -1;
		int indexTwo = 3;
		boolean expected = false;
		boolean actual = exchange.exchangeElements(array, indexOne, indexTwo);
		try {
			// outputs the results
			assertEquals(expected, actual);
		} catch (Exception e) {
			fail("Should not have thrown exception");
		}
	}
	
	/**
	 * This is the exchange elements if the boolean is false and negative for index two
	 * 
	 * @param <T> the generic
	 */
	@Test
	public <T extends Comparable<T>> void testExchangeElementsFalseNegativeIndexTwo() {
		// declare variables
		GenericMethods<String> exchange = new GenericMethods<String>();
		String[] array = {"1", "2", "3", "4"};
		int indexOne = 0;
		int indexTwo = -1;
		boolean expected = false;
		boolean actual = exchange.exchangeElements(array, indexOne, indexTwo);
		try {
			// outputs the results
			assertEquals(expected, actual);
		} catch (Exception e) {
			fail("Should not have thrown exception");
		}
	}
	
	/**
	 * This is the exchange elements if the boolean is false and empty
	 * 
	 * @param <T> the generic
	 */
	@Test
	public <T extends Comparable<T>> void testExchangeElementsFalseEmpty() {
		// declare variables
		GenericMethods<String> exchange = new GenericMethods<String>();
		String[] array = {};
		int indexOne = 1;
		int indexTwo = 3;
		boolean expected = false;
		boolean actual = exchange.exchangeElements(array, indexOne, indexTwo);
		try {
			// outputs the results
			assertEquals(expected, actual);
		} catch (Exception e) {
			fail("Should not have thrown exception");
		}
	}
	
	/**
	 * This is the exchange elements if the boolean is false and empty
	 * 
	 * @param <T> the generic
	 */
	@Test
	public <T extends Comparable<T>> void testExchangeElementsFalseOverArray() {
		// declare variables
		GenericMethods<String> exchange = new GenericMethods<String>();
		String[] array = {"1", "2"};
		int indexOne = 0;
		int indexTwo = 3;
		boolean expected = false;
		boolean actual = exchange.exchangeElements(array, indexOne, indexTwo);
		try {
			// outputs the results
			assertEquals(expected, actual);
		} catch (Exception e) {
			fail("Should not have thrown exception");
		}
	}
	
}
