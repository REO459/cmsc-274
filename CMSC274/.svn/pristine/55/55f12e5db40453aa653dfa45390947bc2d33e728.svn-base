package edu.ben.assignments.assignment4.test;

import java.io.File;
import java.io.FileNotFoundException;

import org.junit.Test;

import edu.ben.assignments.assignment4.Assignment4;
import student.TestCase;

/**
 * This is my assignment4testerrors junit
 * 
 * @author omerb
 * @version 1.0
 */
public class Assignment4TestErrors extends TestCase {

	/**
	 * Tests to see if there is no cards
	 * 
	 * @throws FileNotFoundException if file is not found
	 */
	@Test
	public void testNoCards() throws FileNotFoundException {
		// creates files
		File f1 = new File("null.txt");
		File f2 = new File("Actions.txt");
		// call the method
		Assignment4.compute(f1, f2);
		try {
			// prints out not enough cards if there isn't enough cards to draw
			assertEquals("Not enough cards\n", systemOut().getHistory());
		} catch (Exception e) {
			fail("Should not have thrown exception");
		}
	}

	/**
	 * Tests to check if the file
	 * 
	 * @throws FileNotFoundException if the file is not found
	 */
	@Test
	public void testNotANumber() throws FileNotFoundException {
		// creates files
		File f1 = new File("Invalid.txt");
		File f2 = new File("Actions.txt");
		// goes through the compute method
		Assignment4.compute(f1, f2);
		try {
			// not accept the cards if there is an invalid number
			assertEquals("Not enough cards\n", systemOut().getHistory());
		} catch (Exception e) {
			fail("Should not have thrown exception");
		}
	}
}
