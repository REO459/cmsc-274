package edu.ben.assignments.assignment2.test;

import static org.junit.Assert.*;

import javax.swing.JButton;

import org.junit.Test;

import edu.ben.assignments.assignment2.TicTacToeButtonListener;
import edu.ben.assignments.assignment2.TicTacToeGame;

/**
 * This is the tictactoegametest class
 * 
 * @author omerb
 * @version 1.0
 */
public class TicTacToeGameTest {

	/**
	 * Tests the winner by first row match
	 */
	@Test
	public void testFirstRowWinner() {
		// creates game and buttons
		TicTacToeGame game = new TicTacToeGame();
		JButton[][] btns = new JButton[3][3];
		TicTacToeButtonListener buttonListener = new TicTacToeButtonListener(game, 0, 0, btns);
		// creates the buttons
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				Integer buttons = i * j;
				String values = buttons.toString();
				btns[i][j] = new JButton(values);
			}
		}
		buttonListener.updateButton(btns, 'X');
		// sets the marks
		btns[0][0].setText("X");
		btns[0][1].setText("X");
		btns[0][2].setText("X");

		// determines the outcome
		TicTacToeButtonListener.getBtns();
		String expected = "X";
		String actual = game.determineWinner();
		// compares the results
		assertEquals(expected, actual);

	}

	/**
	 * Tests the winner by second row
	 */
	@Test
	public void testSecondRowWinner() {
		// creates game and buttons
		TicTacToeGame game = new TicTacToeGame();
		JButton[][] btns = new JButton[3][3];
		TicTacToeButtonListener buttonListener = new TicTacToeButtonListener(game, 0, 0, btns);
		// creates the buttons
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				Integer buttons = i * j;
				String values = buttons.toString();
				btns[i][j] = new JButton(values);
			}
		}
		buttonListener.updateButton(btns, 'X');
		// sets the marks
		btns[0][0].setText("X");
		btns[0][1].setText("X");
		btns[0][2].setText("X");

		// determines the outcome
		TicTacToeButtonListener.getBtns();
		String expected = "X";
		String actual = game.determineWinner();
		// compares the results
		assertEquals(expected, actual);
	}

	/**
	 * Tests the winner by third row
	 */
	@Test
	public void testThirdRowWinner() {
		// creates game and buttons
		TicTacToeGame game = new TicTacToeGame();
		JButton[][] btns = new JButton[3][3];
		TicTacToeButtonListener buttonListener = new TicTacToeButtonListener(game, 0, 0, btns);
		// creates the buttons
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				Integer buttons = i * j;
				String values = buttons.toString();
				btns[i][j] = new JButton(values);
			}
		}
		buttonListener.updateButton(btns, 'X');
		// sets the marks
		btns[1][0].setText("X");
		btns[1][1].setText("X");
		btns[1][2].setText("X");

		// determines the outcome
		TicTacToeButtonListener.getBtns();
		String expected = "X";
		String actual = game.determineWinner();
		// compares the results
		assertEquals(expected, actual);
	}

	/**
	 * Tests the winner by first column
	 */
	@Test
	public void testFirstColumnWinner() {
		// creates game and buttons
		TicTacToeGame game = new TicTacToeGame();
		JButton[][] btns = new JButton[3][3];
		TicTacToeButtonListener buttonListener = new TicTacToeButtonListener(game, 0, 0, btns);
		// creates the buttons
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				Integer buttons = i * j;
				String values = buttons.toString();
				btns[i][j] = new JButton(values);
			}
		}
		buttonListener.updateButton(btns, 'X');
		// sets the marks
		btns[0][0].setText("X");
		btns[0][1].setText("X");
		btns[0][2].setText("X");

		// determines the outcome
		TicTacToeButtonListener.getBtns();
		String expected = "X";
		String actual = game.determineWinner();
		// compares the results
		assertEquals(expected, actual);
	}

	/**
	 * Tests the winner by second column
	 */
	@Test
	public void testSecondColumnWinner() {
		// creates game and buttons
		TicTacToeGame game = new TicTacToeGame();
		JButton[][] btns = new JButton[3][3];
		TicTacToeButtonListener buttonListener = new TicTacToeButtonListener(game, 0, 0, btns);
		// creates the buttons
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				Integer buttons = i * j;
				String values = buttons.toString();
				btns[i][j] = new JButton(values);
			}
		}
		buttonListener.updateButton(btns, 'X');
		// sets the marks
		btns[1][0].setText("X");
		btns[1][1].setText("X");
		btns[1][2].setText("X");

		// determines the outcome
		TicTacToeButtonListener.getBtns();
		String expected = "X";
		String actual = game.determineWinner();
		// compares the results
		assertEquals(expected, actual);
	}

	/**
	 * Tests the winner by third column
	 */
	@Test
	public void testThirdColumnWinner() {
		// creates game and buttons
		TicTacToeGame game = new TicTacToeGame();
		JButton[][] btns = new JButton[3][3];
		TicTacToeButtonListener buttonListener = new TicTacToeButtonListener(game, 0, 0, btns);
		// creates the buttons
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				Integer buttons = i * j;
				String values = buttons.toString();
				btns[i][j] = new JButton(values);
			}
		}
		buttonListener.updateButton(btns, 'X');
		// sets the marks
		btns[2][0].setText("X");
		btns[2][1].setText("X");
		btns[2][2].setText("X");

		// determines the outcome
		TicTacToeButtonListener.getBtns();
		String expected = "X";
		String actual = game.determineWinner();
		// compares the results
		assertEquals(expected, actual);
	}

	/**
	 * Tests the winner by left to right diagonal
	 */
	@Test
	public void testDiagonalLeftToRightWinner() {
		// creates game and buttons
		TicTacToeGame game = new TicTacToeGame();
		JButton[][] btns = new JButton[3][3];
		TicTacToeButtonListener buttonListener = new TicTacToeButtonListener(game, 0, 0, btns);
		// creates the buttons
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				Integer buttons = i * j;
				String values = buttons.toString();
				btns[i][j] = new JButton(values);
			}
		}
		buttonListener.updateButton(btns, 'X');
		// sets the marks
		btns[0][0].setText("X");
		btns[1][1].setText("X");
		btns[2][2].setText("X");

		// determines the outcome
		TicTacToeButtonListener.getBtns();
		String expected = "X";
		String actual = game.determineWinner();
		// compares the results
		assertEquals(expected, actual);
	}

	/**
	 * Tests the winner by right to left diagonal
	 */
	@Test
	public void testDiagonalRightToLeftWinner() {
		// creates game and buttons
		TicTacToeGame game = new TicTacToeGame();
		JButton[][] btns = new JButton[3][3];
		TicTacToeButtonListener buttonListener = new TicTacToeButtonListener(game, 0, 0, btns);
		// creates the buttons
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				Integer buttons = i * j;
				String values = buttons.toString();
				btns[i][j] = new JButton(values);
			}
		}
		buttonListener.updateButton(btns, 'X');
		// sets the marks
		btns[2][0].setText("X");
		btns[1][1].setText("X");
		btns[0][2].setText("X");

		// determines the outcome
		TicTacToeButtonListener.getBtns();
		String expected = "X";
		String actual = game.determineWinner();
		// compares the results
		assertEquals(expected, actual);
	}
	
	/**
	 * Tests the lose by first row match
	 */
	@Test
	public void testFirstRowLoser() {
		// creates game and buttons
		TicTacToeGame game = new TicTacToeGame();
		JButton[][] btns = new JButton[3][3];
		TicTacToeButtonListener buttonListener = new TicTacToeButtonListener(game, 0, 0, btns);
		// creates the buttons
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				Integer buttons = i * j;
				String values = buttons.toString();
				btns[i][j] = new JButton(values);
			}
		}
		buttonListener.updateButton(btns, 'O');
		// sets the marks
		btns[0][0].setText("O");
		btns[0][1].setText("O");
		btns[0][2].setText("O");

		// determines the outcome
		TicTacToeButtonListener.getBtns();
		String expected = "O";
		String actual = game.determineWinner();
		// compares the results
		assertEquals(expected, actual);

	}
	
	/**
	 * Tests the loser by second row match
	 */
	@Test
	public void testSecondRowLoser() {
		// creates game and buttons
		TicTacToeGame game = new TicTacToeGame();
		JButton[][] btns = new JButton[3][3];
		TicTacToeButtonListener buttonListener = new TicTacToeButtonListener(game, 0, 0, btns);
		// creates the buttons
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				Integer buttons = i * j;
				String values = buttons.toString();
				btns[i][j] = new JButton(values);
			}
		}
		buttonListener.updateButton(btns, 'O');
		// sets the marks
		btns[1][0].setText("O");
		btns[1][1].setText("O");
		btns[1][2].setText("O");

		// determines the outcome
		TicTacToeButtonListener.getBtns();
		String expected = "O";
		String actual = game.determineWinner();
		// compares the results
		assertEquals(expected, actual);

	}
	
	/**
	 * Tests the loser by third row match
	 */
	@Test
	public void testThirdRowLoser() {
		// creates game and buttons
		TicTacToeGame game = new TicTacToeGame();
		JButton[][] btns = new JButton[3][3];
		TicTacToeButtonListener buttonListener = new TicTacToeButtonListener(game, 0, 0, btns);
		// creates the buttons
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				Integer buttons = i * j;
				String values = buttons.toString();
				btns[i][j] = new JButton(values);
			}
		}
		buttonListener.updateButton(btns, 'O');
		// sets the marks
		btns[2][0].setText("O");
		btns[2][1].setText("O");
		btns[2][2].setText("O");

		// determines the outcome
		TicTacToeButtonListener.getBtns();
		String expected = "O";
		String actual = game.determineWinner();
		// compares the results
		assertEquals(expected, actual);

	}
	

	/**
	 * Tests the loser by first column
	 */
	@Test
	public void testFirstColumnLoser() {
		// creates game and buttons
		TicTacToeGame game = new TicTacToeGame();
		JButton[][] btns = new JButton[3][3];
		TicTacToeButtonListener buttonListener = new TicTacToeButtonListener(game, 0, 0, btns);
		// creates the buttons
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				Integer buttons = i * j;
				String values = buttons.toString();
				btns[i][j] = new JButton(values);
			}
		}
		buttonListener.updateButton(btns, 'O');
		// sets the marks
		btns[0][0].setText("O");
		btns[0][1].setText("O");
		btns[0][2].setText("O");

		// determines the outcome
		TicTacToeButtonListener.getBtns();
		String expected = "O";
		String actual = game.determineWinner();
		// compares the results
		assertEquals(expected, actual);
	}

	/**
	 * Tests the loser by second column
	 */
	@Test
	public void testSecondColumnLoser() {
		// creates game and buttons
		TicTacToeGame game = new TicTacToeGame();
		JButton[][] btns = new JButton[3][3];
		TicTacToeButtonListener buttonListener = new TicTacToeButtonListener(game, 0, 0, btns);
		// creates the buttons
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				Integer buttons = i * j;
				String values = buttons.toString();
				btns[i][j] = new JButton(values);
			}
		}
		buttonListener.updateButton(btns, 'O');
		// sets the marks
		btns[1][0].setText("O");
		btns[1][1].setText("O");
		btns[1][2].setText("O");

		// determines the outcome
		TicTacToeButtonListener.getBtns();
		String expected = "O";
		String actual = game.determineWinner();
		// compares the results
		assertEquals(expected, actual);
	}

	/**
	 * Tests the loser by third column
	 */
	@Test
	public void testThirdColumnLoser() {
		// creates game and buttons
		TicTacToeGame game = new TicTacToeGame();
		JButton[][] btns = new JButton[3][3];
		TicTacToeButtonListener buttonListener = new TicTacToeButtonListener(game, 0, 0, btns);
		// creates the buttons
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				Integer buttons = i * j;
				String values = buttons.toString();
				btns[i][j] = new JButton(values);
			}
		}
		buttonListener.updateButton(btns, 'O');
		// sets the marks
		btns[2][0].setText("O");
		btns[2][1].setText("O");
		btns[2][2].setText("O");

		// determines the outcome
		TicTacToeButtonListener.getBtns();
		String expected = "O";
		String actual = game.determineWinner();
		// compares the results
		assertEquals(expected, actual);
	}

	/**
	 * Tests the loser by left to right diagonal
	 */
	@Test
	public void testDiagonalLeftToRightLoser() {
		// creates game and buttons
		TicTacToeGame game = new TicTacToeGame();
		JButton[][] btns = new JButton[3][3];
		TicTacToeButtonListener buttonListener = new TicTacToeButtonListener(game, 0, 0, btns);
		// creates the buttons
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				Integer buttons = i * j;
				String values = buttons.toString();
				btns[i][j] = new JButton(values);
			}
		}
		buttonListener.updateButton(btns, 'O');
		// sets the marks
		btns[0][0].setText("O");
		btns[1][1].setText("O");
		btns[2][2].setText("O");

		// determines the outcome
		TicTacToeButtonListener.getBtns();
		String expected = "O";
		String actual = game.determineWinner();
		// compares the results
		assertEquals(expected, actual);
	}

	/**
	 * Tests the loser by right to left diagonal
	 */
	@Test
	public void testDiagonalRightToLeftLoser() {
		// creates game and buttons
		TicTacToeGame game = new TicTacToeGame();
		JButton[][] btns = new JButton[3][3];
		TicTacToeButtonListener buttonListener = new TicTacToeButtonListener(game, 0, 0, btns);
		// creates the buttons
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				Integer buttons = i * j;
				String values = buttons.toString();
				btns[i][j] = new JButton(values);
			}
		}
		buttonListener.updateButton(btns, 'O');
		// sets the marks
		btns[2][0].setText("O");
		btns[1][1].setText("O");
		btns[0][2].setText("O");

		// determines the outcome
		TicTacToeButtonListener.getBtns();
		String expected = "O";
		String actual = game.determineWinner();
		// compares the results
		assertEquals(expected, actual);
	}

	/**
	 * Test the outcome from a tie
	 */
	@Test
	public void testTie() {
		// creates game and buttons
		TicTacToeGame game = new TicTacToeGame();
		JButton[][] btns = new JButton[3][3];
		TicTacToeButtonListener buttonListener = new TicTacToeButtonListener(game, 0, 0, btns);
		// creates the buttons
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				Integer buttons = i * j;
				String values = buttons.toString();
				btns[i][j] = new JButton(values);
			}
		}
		
		buttonListener.updateButton(btns, 'X');
		buttonListener.updateButton(btns, 'O');
		// the amount of turns
		TicTacToeGame.turnCount = 9;

		// determines the outcome
		TicTacToeButtonListener.getBtns();
		String expected = "tie";
		String actual = game.determineWinner();
		// compares the results
		assertEquals(expected, actual);
	}

}
