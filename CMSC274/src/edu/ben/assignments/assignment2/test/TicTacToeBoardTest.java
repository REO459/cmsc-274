package edu.ben.assignments.assignment2.test;

import static org.junit.Assert.*;

import org.junit.Test;

import edu.ben.assignments.assignment2.TicTacToeBoard;
import edu.ben.assignments.assignment2.TicTacToeGame;

/**
 * This is the tictactoeboardtest class
 * 
 * @author omerb
 * @version 1.0
 */
public class TicTacToeBoardTest {

	/**
	 * This is where it updates the board
	 */
	@Test
	public void testUpdatingTheBoardTrue() {
		// creates the board
		TicTacToeBoard board = new TicTacToeBoard();
		boolean expected = true;
		// updates the board
		boolean actual = board.updateBoard(0, 0, 'X');
		// compares the results
		assertEquals(expected, actual);
	}

	/**
	 * This is where it updates the board
	 */
	@Test
	public void testUpdatingTheBoardFalse() {
		// creates the board
		TicTacToeBoard board = new TicTacToeBoard();
		// updates the board
		board.getBoard()[0][0] = 'X';
		boolean expected = false;
		boolean actual = board.updateBoard(0, 0, 'X');
		// compares the results
		assertEquals(actual, expected);
	}

	/**
	 * Test the place marker
	 */
	@Test
	public void testMarkerPlacement() {
		// creates the game and board
		TicTacToeGame game = new TicTacToeGame();
		TicTacToeBoard board = new TicTacToeBoard();
		// places the marker
		game.placeMarker(1, 0, 'X');
		board.updateBoard(1, 0, 'X');
		char expected = 'X';
		char actual = board.getBoard()[1][0];
		// compares the results
		assertEquals(expected, actual);
	}

}
