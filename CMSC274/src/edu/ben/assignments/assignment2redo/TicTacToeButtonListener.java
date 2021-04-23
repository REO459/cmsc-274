package edu.ben.assignments.assignment2redo;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

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
	private TicTacToeGame game;
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
	private JButton[][] btns;

	// game over variable
	public boolean gameOver = false;
	// computer's turn variable
	public boolean compTurn = false;
	// to track each cell used
	public int boardFilled = 0;

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
		// to generate random numbers
		Random rand = new Random();
		// if board is emptied
		if (boardFilled == 0) {
			game.placeMarker(posX, posY, TicTacToeBoard.PLAYER);
			updateButton(btns);
			compTurn = true;
			++boardFilled;
		}
		// checks the game if draw
		if (isFull()) {
			// changes color if there is a tie
			JButton button = (JButton) e.getSource();
			button.setBackground(Color.BLUE);
			gameOver = true;
		}
		// checks the turn of the computer
		if (compTurn) {
			// variables for the horizontal and vertical array
			int x = 0;
			int y = 0;
			// computer puts the O to the board
			while (true) {
				// randomizes the numbers of the array
				x = rand.nextInt(3);
				y = rand.nextInt(3);
				if (btns[x][y].getText() == " " || btns[x][y].getText() == " ") {
					// sets font for the opponent
					final Font f = new Font("Dialog", Font.PLAIN, 64);
					btns[x][y].setText("O");
					btns[x][y].setFont(f);
					break;
				}
			}
			// marks the board with the O
			game.placeMarker(x, y, TicTacToeBoard.COMPUTER);
			updateButton(btns);
			// changes turns
			compTurn = false;
			++boardFilled;
			gameOver = checkIfWon("O");
			// checks if the computer wins
			if (gameOver) {
				// changes color if player loses
				JButton button = (JButton) e.getSource();
				button.setBackground(Color.RED);
			}
		}
		// if it's the player's turn
		if (!compTurn) {
			// player marks the board
			game.placeMarker(posX, posY, TicTacToeBoard.PLAYER);
			updateButton(btns);
			// transfers to the next player
			compTurn = true;
			++boardFilled;
			// checks if the player wins
			gameOver = checkIfWon("X");
			if (gameOver) {
				// changes color if player wins
				JButton button = (JButton) e.getSource();
				button.setBackground(Color.GREEN);
			}
		}
	}

	/**
	 * Checks if the board is empty
	 * 
	 * @return false if the board is not empty
	 */
	public boolean isEmpty() {
		// the count for how many spaces are on the board
		int count = 0;
		// loops through the board
		for (int i = 0; i <= 2; i++) {
			for (int j = 0; j <= 2; j++) {
				if (btns[i][j].getText() == " ") {
					count++;
				}
			}
		}
		// if there are 9 spaces on the board
		if (count == 9) {
			return true;
		}
		// if there is at least 1 char on the board
		return false;
	}

	/**
	 * Checks if the board is full
	 * 
	 * @return false if the board is not full
	 */
	public boolean isFull() {
		// checks how many chars are on the board
		int count = 0;
		// loops through the board to find xs and os
		for (int i = 0; i <= 2; i++) {
			for (int j = 0; j <= 2; j++) {
				if (btns[i][j].getText() == "X" || btns[i][j].getText() == "O") {
					count++;
				}
			}
		}
		// if the board is full
		if (count == 9) {
			return true;
		}
		// if the board is not full
		return false;
	}

	/**
	 * Check for the 3 in the row
	 * 
	 * @param marker where the player and opponent marked
	 * @return false if there is no 3 in the row
	 */
	public boolean checkIfWon(String marker) {
		// checks if won horizontally
		if (checkHorizontal(marker)) {
			return true;
		}
		// checks if won vertically
		if (checkVertically(marker)) {
			return true;
		}
		// checks if won diagonally
		if (checkDiagonally(marker)) {
			return true;
		}
		// if there is no match
		return false;
	}

	/**
	 * Checks diagonally of the board
	 * 
	 * @param marker the marker board
	 * @return false if there is no 3 in the row of the diagonal
	 */
	public boolean checkDiagonally(String marker) {
		// the diagonal position and count
		int pos1 = 0;
		int count1 = 0;
		// for loop to check diagonally left to right
		for (int i = 0; i <= 2; i++) {
			if (btns[i][pos1].getText() == marker) {
				count1++;
			}
			pos1++;
		}
		if (count1 == 3) {
			return true;
		}
		int pos2 = 2;
		int count2 = 0;
		// for loop to check diagonally right to left
		for (int i = 0; i <= 2; i++) {
			if (btns[i][pos2].getText() == marker) {
				count2++;
			}
			pos2--;
		}
		if (count2 == 3) {
			return true;
		}
		// returns false if user didn't win
		return false;
	}

	/**
	 * Checks vertically
	 * 
	 * @param marker the mark on the board
	 * @return false if there is no 3 in the row for vertical
	 */
	public boolean checkVertically(String marker) {
		// for loop to check the marker vertically
		for (int i = 0; i <= 2; i++) {
			int count = 0;
			for (int j = 0; j <= 2; j++) {
				if (btns[j][i].getText() == marker) {
					count++;
				}
				if (count == 3 && j == 2) {
					return true;
				}
			}
		}
		// returns false if user didn't win
		return false;
	}

	/**
	 * Checks horizontal
	 * 
	 * @param marker the mark on the board
	 * @return false if there is no 3 in the row at horizontal
	 */
	public boolean checkHorizontal(String marker) {
		int count = 0;
		// for loop to check marker horizontally
		for (int i = 0; i <= 2; i++) {
			count = 0;
			for (int j = 0; j <= 2; j++) {
				if (btns[i][j].getText() == marker) {
					count++;
				}
				if (count == 3 && j == 2) {
					return true;
				}

			}
		}
		// returns false if user didn't win
		return false;
	}

	/**
	 * Updates the button for player
	 * 
	 * @param btns the button of the board
	 */
	public void updateButton(JButton[][] btns) {
		// sets the font of the X user
		final Font f = new Font("Dialog", Font.PLAIN, 64);
		btns[posX][posY].setText("X");
		btns[posX][posY].setFont(f);
	}
}
