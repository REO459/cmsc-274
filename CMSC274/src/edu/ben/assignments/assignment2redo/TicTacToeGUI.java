package edu.ben.assignments.assignment2redo;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;

import java.awt.GridLayout;
import java.awt.event.ActionListener;

/**
 * This is my tictactoegui class
 * 
 * @author omerb
 * @version 1.0
 */
public class TicTacToeGUI extends JFrame {
	/**
	 * The serial version for the program
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * The panel of the tic tac toe game
	 */
	private JPanel contentPane;
	
	/**
	 * The tic tac toe gui code
	 */
	public TicTacToeGUI() {
		// sets up the gui system
		TicTacToeGame game = new TicTacToeGame();
		setTitle("Tic-Tac-Toe");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// sets the layout of the tictactoe board
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new GridLayout(0, 3, 0, 0));

		// makes the buttons of the board
		final JButton[][] btns = new JButton[3][3];
		// loops through the board
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				// creates the buttons
				btns[i][j] = new JButton(" ");
				ActionListener actionListener = new TicTacToeButtonListener(game, i, j, btns);
				btns[i][j].addActionListener(actionListener);
				add(btns[i][j]);
			}
		}
	}
}
