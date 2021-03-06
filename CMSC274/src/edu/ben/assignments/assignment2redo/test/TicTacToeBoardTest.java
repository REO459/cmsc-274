package edu.ben.assignments.assignment2redo.test;

import static org.junit.Assert.*;

import org.junit.Test;

import edu.ben.assignments.assignment2.TicTacToeBoard;
import junit.framework.TestCase;

/**
 * This is my tictactoeboardtest class
 * 
 * @author omerb
 * @version 1.0
 */
public class TicTacToeBoardTest extends TestCase {

	@Test
	/**
	 * This tests the updateBoard function
	 */
	public void testUpdateBoard() {
		// test the update of the board
		TicTacToeBoard update = new TicTacToeBoard();
		update.updateBoard(0, 1, 'X');
		boolean expected = true;
		// makes sure it updates well
		assertEquals(expected, update);
	}

}
