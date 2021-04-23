package edu.ben.assignments.assignment4.test;

import java.io.File;
import java.io.FileNotFoundException;

import org.junit.Test;

import edu.ben.assignments.assignment4.Assignment4;

import student.TestCase;

/**
 * This is my assignment4 junit
 * 
 * @author omerb
 * @version 1.0
 */
public class Assignment4Test extends TestCase {

	/**
	 * To test the actual output
	 */
	@Test
	public void testOutput() throws FileNotFoundException {
		// creates the files
		File f1 = new File("Cards.txt");
		File f2 = new File("Actions.txt");
		// computes the method
		Assignment4.compute(f1, f2);
		try {
			// outputs the results
			assertEquals("Winner = Dealer\nWinner = Player\nDraw\n", systemOut().getHistory());
		} catch (Exception e) {
			fail("Should not have thrown exception");
		}
	}

}
