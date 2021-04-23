package edu.ben.assignments.assignment2redo.test;

import static org.junit.Assert.*;

import org.junit.Test;

import edu.ben.assignments.assignment2.TicTacToeGame;

/**
 * This is my tictactoegametest class
 * 
 * @author omerb
 * @version 1.0
 */
public class TicTacToeGameTest {

	@Test
	/**
	 * This is the test marker
	 */
	public void testMarker() {
		// makes the plack of the mark
		TicTacToeGame placeMark = new TicTacToeGame();
		placeMark.placeMarker(0, 1, 'X');
		boolean expected = true;
		// checks if it was placed properly
		assertEquals(expected, placeMark);

	}

}
