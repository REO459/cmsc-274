package edu.ben.assignments.assignment2redo;

import java.awt.EventQueue;

/**
 * This is my tictactoegame class
 * 
 * @author omerb
 * @version 1.0
 */
public class TicTacToeGame {
	/**
	 * Produces the tic tac toe board
	 */
	private TicTacToeBoard board = new TicTacToeBoard();

	/**
	 * Starts the game
	 * 
	 * @param args Shows the game
	 */
	public static void main(String[] args) {
		// runs the game
		TicTacToeGame game = new TicTacToeGame();
		game.playGame();
	}

	/**
	 * Plays the game
	 */
	public void playGame() {
		EventQueue.invokeLater(new Runnable() {
			/**
			 * This is the runner of the game
			 */
			public void run() {
				// makes the gui to start the game
				try {
					TicTacToeGUI frame = new TicTacToeGUI();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Places the marker on the board
	 * 
	 * @param i The row of the array
	 * @param j The column of the array
	 * @param marker marks the array with the x or o
	 */
	public void placeMarker(int i, int j, char marker) {
		board.updateBoard(i, j, marker);
	}
}
