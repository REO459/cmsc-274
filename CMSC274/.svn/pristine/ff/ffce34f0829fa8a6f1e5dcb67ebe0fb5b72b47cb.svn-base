package edu.ben.assignments.assignment2;

/**
 * This is the tictactoeboard class
 * 
 * @author omerb
 * @version 1.0
 */
public class TicTacToeBoard {
	/**
	 * This is the player character
	 */
	final public static char PLAYER = 'X';
	/**
	 * This is the computer character
	 */
	final public static char COMPUTER = 'O';
	/**
	 * This is the number of spaces
	 */
	final public static int NUM_SPACES = 3;
	/**
	 * This is the board
	 */
	private char[][] board;

	/**
	 * This creates the tic tac toe board 
	 */
	public TicTacToeBoard() {
		board = new char[NUM_SPACES][NUM_SPACES];
	}

	/**
	 * This is where you update the board with marker
	 * 
	 * @param i The rows in tictactoe
	 * @param j The columns of tictactoe
	 * @param marker The mark of the players
	 * @return false if the marker is already placed
	 */
	public boolean updateBoard(int i, int j, char marker) {
		// if the marker was not place on the board
		if (board[i][j] != PLAYER && board[i][j] != COMPUTER) {
			board[i][j] = marker;
			return true;
		}
		// if the marker was already placed on the board
		return false;
	}
	
	/**
	 * Gets the tictactoe board
	 * 
	 * @return board The board of tictactoe.
	 */
	public char [][] getBoard(){
		return board;
	}
}