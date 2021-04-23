package edu.ben.assignments.assignment2;

import java.awt.EventQueue;

import javax.swing.JButton;

/**
 * This is the tictactoegame class
 * 
 * @author omerb
 * @version 1.0
 */
public class TicTacToeGame {
	/**
	 * Creates the new tic tac toe board
	 */
	private TicTacToeBoard board = new TicTacToeBoard();

	// this is the number of turns
	public static int turnCount = 0;

	/**
	 * This is where the tic tac toe games starts
	 * 
	 * @param args This is the main method
	 */
	public static void main(String[] args) {
		// starts the game
		TicTacToeGame game = new TicTacToeGame();
		game.playGame();
	}

	/**
	 * This is the play game
	 */
	public void playGame() {
		EventQueue.invokeLater(new Runnable() {
			// runs the game
			public void run() {
				try {
					TicTacToeGUI frame = new TicTacToeGUI();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
				// computer places marker
				computerTurn();
			}
		});
	}

	/**
	 * This is where it places the marker
	 * 
	 * @param i      The row
	 * @param j      The column
	 * @param marker The type of marker
	 */
	public void placeMarker(int i, int j, char marker) {
		board.updateBoard(i, j, marker);
	}

	/**
	 * This is where it determines the winner
	 * 
	 * @return gameAftermath the result of the game
	 */
	public String determineWinner() {
		// gets the buttons for tictactoe
		JButton[][] btns = TicTacToeButtonListener.getBtns();
		// checks the rows, column, and diagonals
		String gameAftermath = rowChecker() + columnChecker() + diagonalChecker();
		// checks if the board is empty or not
		if (gameAftermath.isEmpty()) {
			if (turnCount == 9) {
				return "tie";
			}
		}
		// determines the winner
		return gameAftermath;
	}

	/**
	 * This method checks the rows
	 * 
	 * @return ("") if the rows are empty
	 */
	public static String rowChecker() {
		JButton[][] btns = TicTacToeButtonListener.getBtns();
		// checks the rows
		if (btns[0][0].getText() == btns[1][0].getText() && btns[0][0].getText() == btns[2][0].getText()) {
			return btns[0][0].getText();
		} else if (btns[0][1].getText() == btns[1][1].getText() && btns[0][1].getText() == btns[2][1].getText()) {
			return btns[0][1].getText();
		} else if (btns[0][2].getText() == btns[1][2].getText() && btns[0][2].getText() == btns[2][2].getText()) {
			return btns[0][2].getText();
		}
		// if it is empty
		return ("");
	}

	/**
	 * This method checks the columns
	 * 
	 * @return ("") if the columns are empty
	 */
	public static String columnChecker() {
		JButton[][] btns = TicTacToeButtonListener.getBtns();
		// checks the columns
		if (btns[0][0].getText() == btns[0][1].getText() && btns[0][0].getText() == btns[0][2].getText()) {
			return btns[0][0].getText();
		} else if (btns[1][0].getText() == btns[1][1].getText() && btns[1][0].getText() == btns[1][2].getText()) {
			return btns[1][0].getText();
		} else if (btns[2][0].getText() == btns[2][1].getText() && btns[2][0].getText() == btns[2][2].getText()) {
			return btns[2][0].getText();
		}
		// if it is empty
		return ("");
	}

	/**
	 * This method checks the diagonals
	 * 
	 * @return ("") if the diagonals are empty
	 */
	public static String diagonalChecker() {
		// gets the buttons
		JButton[][] btns = TicTacToeButtonListener.getBtns();
		// checks the diagonals
		if (btns[0][0].getText() == btns[1][1].getText() && btns[0][0].getText() == btns[2][2].getText()) {
			return btns[0][0].getText();
		} else if (btns[0][2].getText() == btns[1][1].getText() && btns[0][2].getText() == btns[2][0].getText()) {
			return btns[0][2].getText();
		}
		// if it is empty
		return ("");

	}

	/**
	 * This is the computer player
	 */
	public void computerTurn() {
		// gets the buttons
		JButton[][] btns = TicTacToeButtonListener.getBtns();
		// randomly places the marker
		double moveX = (int) (Math.random() * (2 - 0 + 1) + 0);
		double moveY = (int) (Math.random() * (2 - 0 + 1) + 0);

		// places the marker
		if (!btns[(int) moveX][(int) moveY].getText().equals(" ")) {
			computerTurn();
		}

		// the player places the marker
		JButton markerPlacement = btns[(int) moveX][(int) moveY];
		markerPlacement.doClick();

	}

}
