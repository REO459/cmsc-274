package edu.ben.assignments.assignment2.test;

import static org.junit.Assert.*;

import java.awt.event.ActionListener;

import javax.swing.JButton;

import org.junit.Test;

import edu.ben.assignments.assignment2.TicTacToeButtonListener;
import edu.ben.assignments.assignment2.TicTacToeGame;

/**
 * This is the tictactoebuttonlistenertest class
 * 
 * @author omerb
 * @version 1.0
 */
public class TicTacToeButtonListenerTest {
	
	/**
	 * Tests out the button constructor
	 */
	@Test
	public void testButtonConstructor() {
		// creates the buttons and game
		JButton[][] btns = new JButton[3][3];
		TicTacToeGame game = new TicTacToeGame();
		// utilize the button listener
		TicTacToeButtonListener buttonListener = new TicTacToeButtonListener(game, 0, 0, btns);
		TicTacToeGame expectedGame = game;
		int expectedXMark = 0;
		int expectedYMark = 0;
		JButton[][] expectedButtons = btns;
		
		// compares the results
		assertEquals(expectedGame, buttonListener.getGame());
		assertEquals(expectedXMark, buttonListener.getX());
		assertEquals(expectedYMark, buttonListener.getY());
		assertEquals(expectedButtons, buttonListener.getBtns());
	}

	/**
	 * Updates the Button when it's X turn
	 */
	@Test
	public void testUpdatingTheButtonX() {
		// creates the buttons, game, and buttonlistener
		JButton[][] btns = new JButton[3][3];
		TicTacToeGame game = new TicTacToeGame();
		TicTacToeButtonListener buttonListener = new TicTacToeButtonListener(game, 1, 2, btns);
		// loops of the buttons
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				Integer buttons = i * j;
				String values = buttons.toString();
				btns[i][j] = new JButton(values);
			}
		}
		// updates the character X
		buttonListener.updateButton(btns, 'X');
		String expected = "X";
		String actual = btns[1][2].getText();
		// compares the results
		assertEquals(expected, actual);
	}

	/**
	 * Test when the action performs action on X
	 */
	@Test
	public void testActionPerformedOnX() {
		// creates the button, game, and buttonlistener
		JButton[][] btns = new JButton[3][3];
		TicTacToeGame game = new TicTacToeGame();
		TicTacToeButtonListener buttonListener = new TicTacToeButtonListener(game, 0, 0, btns);
		// loops of the action listener buttons
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				btns[i][j] = new JButton(" ");
				ActionListener actionListener = new TicTacToeButtonListener(game, i, j, btns);
				btns[i][j].addActionListener(actionListener);
			}
		}
		// clicks the button and checks for X
		game.turnCount = 1;
		btns[2][0].doClick();
		String expected = "X";
		String actual = btns[2][0].getText();
		// compares the results
		assertEquals(expected, actual);
	}

	/**
	 * Updates the Button when it's O turn
	 */
	@Test
	public void testUpdatingTheButtonO() {
		// creates the buttons, game, and buttonlistener
		JButton[][] btns = new JButton[3][3];
		TicTacToeGame game = new TicTacToeGame();
		TicTacToeButtonListener buttonListener = new TicTacToeButtonListener(game, 0, 0, btns);
		// loops through the buttons
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				Integer buttons = i * j;
				String values = buttons.toString();
				btns[i][j] = new JButton(values);
			}
		}
		// updates the character O
		buttonListener.updateButton(btns, 'O');
		String expected = "O";
		String actual = btns[0][0].getText();
		// compares the results
		assertEquals(expected, actual);
	}

	/**
	 * Test when the action performs action on O
	 */
	@Test
	public void testActionPerformedOnO() {
		// creates the buttons, game, and buttonlistener
		JButton[][] btns = new JButton[3][3];
		TicTacToeGame game = new TicTacToeGame();
		TicTacToeButtonListener buttonListener = new TicTacToeButtonListener(game, 0, 0, btns);
		// loops of the action listener buttons
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				btns[i][j] = new JButton(" ");
				ActionListener actionListener = new TicTacToeButtonListener(game, i, j, btns);
				btns[i][j].addActionListener(actionListener);
			}
		}
		// clicks the button and checks for O
		game.turnCount = 0;
		btns[1][2].doClick();
		String expected = "O";
		String actual = btns[1][2].getText();
		// compares the results
		assertEquals(expected, actual);
	}

}
