package edu.ben.assignments.assignment2;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;

/**
 * This is my tictactoebuttonlistener class
 * 
 * @author omerb
 * @version 1.0
 */
public class TicTacToeButtonListener implements ActionListener {
	/**
	 * The tic tac toe game
	 */
	private static TicTacToeGame game;
	/**
	 * The position x
	 */
	private int posX;
	/**
	 * The position y
	 */
	private int posY;
	/**
	 * the jbuttons
	 */
	private static JButton[][] btns;
	/**
	 * Creates tic tac toe game
	 */
	TicTacToeGame TicTacGame = new TicTacToeGame();
	/**
	 * Sets the font for the markers
	 */
	final Font f = new Font("Dialog", Font.PLAIN, 64);

	/**
	 * It listens to the button of the tic tac toe game
	 * 
	 * @param game sets the game
	 * @param posX sets the horizontal position
	 * @param posY sets the vertical position
	 * @param btns sets the buttons
	 */
	public TicTacToeButtonListener(TicTacToeGame game, int posX, int posY, JButton[][] btns) {
		this.game = game;
		this.posX = posX;
		this.posY = posY;
		this.btns = btns;
	}

	/**
	 * Performs the action of the player
	 */
	@Override
	public void actionPerformed(ActionEvent e) {
		// the placement of the marker
		boolean markNotTaken = true;

		// if the spot is already taken
		if (!btns[posX][posY].getText().equals(" ")) {
			markNotTaken = false;
		}
		// the computer's turn
		if (TicTacToeGame.turnCount % 2 == 0 && markNotTaken == true) {
			TicTacToeGame.turnCount++;
			game.placeMarker(posX, posY, TicTacToeBoard.COMPUTER);
			updateButton(btns, 'O');
			// the player's turn
		} else if (markNotTaken == true) {
			TicTacToeGame.turnCount++;
			game.placeMarker(posX, posY, TicTacToeBoard.PLAYER);
			updateButton(btns, 'X');
			// if the game is not over
			if (colorDetermination() == false) {
				TicTacGame.computerTurn();
			}
		}
		// if the game is over
		markNotTaken = true;
		colorDetermination();
	}

	/**
	 * The game will determine the color after the game is over
	 * 
	 * @return false if the game is not over
	 */
	public boolean colorDetermination() {
		// checks to see if the player wins
		if (TicTacGame.determineWinner().equals("X")) {
			for (int i = 0; i < 3; i++) {
				for (int j = 0; j < 3; j++) {
					// disable the buttons and set the background to green
					btns[i][j].setBackground(Color.GREEN);
					btns[i][j].setEnabled(false);
				}
			}
			return true;
			// checks to see if the opponent wins
		} else if (TicTacGame.determineWinner().equals("O")) {
			for (int i = 0; i < 3; i++) {
				for (int j = 0; j < 3; j++) {
					// disable the buttons and set the background to red
					btns[i][j].setBackground(Color.RED);
					btns[i][j].setEnabled(false);
				}
			}
			return true;
			// checks to see if there is a tie
		} else if (TicTacGame.determineWinner().equals("tie")) {
			for (int i = 0; i < 3; i++) {
				for (int j = 0; j < 3; j++) {
					// disable the buttons and set the background to blue
					btns[i][j].setBackground(Color.BLUE);
					btns[i][j].setEnabled(false);
				}
			}
			return true;
		} else {
			// if there is no winner
			return false;
		}
	}

	/**
	 * This is where it updates the buttons
	 * 
	 * @param btns   the buttons on the board
	 * @param marker the mark of the player or computer
	 */
	public void updateButton(JButton[][] btns, char marker) {
		// the computer marker
		if (marker == 'O') {
			btns[posX][posY].setText("O");
			btns[posX][posY].setFont(f);
			// the player marker
		} else if (marker == 'X') {
			btns[posX][posY].setText("X");
			btns[posX][posY].setFont(f);
		}
	}
	
	/**
	 * Gets the tictactoe game
	 * 
	 * @return game the tictactoe game
	 */
	public static TicTacToeGame getGame() {
		return game;
	}

	/**
	 * Gets the row position
	 * 
	 * @return posX row position
	 */
	public Object getX() {
		return posX;
	}

	/**
	 * Gets the column position
	 * 
	 * @return posY column position
	 */
	public Object getY() {
		return posY;
	}
	

	/**
	 * Gets the buttons of the game
	 * 
	 * @return btns the buttons of the game
	 */
	public static JButton[][] getBtns() {
		return btns;
	}


}
