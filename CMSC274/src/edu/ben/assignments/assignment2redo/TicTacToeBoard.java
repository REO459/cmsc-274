package edu.ben.assignments.assignment2redo;

import java.awt.Font;

import javax.swing.JButton;

/**
 * This is my tictactoeboard class
 * 
 * @author omerb
 * @version 1.0
 */
public class TicTacToeBoard {
	// the x and os for the tic tac toe board
	final public static char PLAYER = 'X';
	final public static char COMPUTER = 'O';
	// makes the number of spaces
	final public static int NUM_SPACES = 3;
	/**
	 * creates the board
	 */
	private char[][] board;
	

	/**
	 * The board of tic tac toe
	 */
	public TicTacToeBoard() {
		board = new char[NUM_SPACES][NUM_SPACES];
	}

	/**
	 * This updates the board of the game
	 * 
	 * @param i The row of the board
	 * @param j The column of the board
	 * @param marker The mark on the board
	 * @return false if the board has a marker already
	 */
	public boolean updateBoard(int i, int j, char marker) {
		// makes the board within the array
		if (board[i][j] != PLAYER && board[i][j] != COMPUTER) {
			board[i][j] = marker;
			return true;
		}
		return false;
	}

}