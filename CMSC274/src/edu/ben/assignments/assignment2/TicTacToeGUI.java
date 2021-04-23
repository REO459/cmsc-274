package edu.ben.assignments.assignment2;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;

import java.awt.GridLayout;
import java.awt.event.ActionListener;

/**
 * This is the tictactoegui class
 * 
 * @author omerb
 * @version 1.0
 */
public class TicTacToeGUI extends JFrame {
	/**
	 * The serial version id
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * The JPanel contentPane
	 */
	private JPanel contentPane;

	/**
	 * The tictactoegui
	 */
	public TicTacToeGUI() {
		// starts the tictactoe game
		TicTacToeGame game = new TicTacToeGame();
		setTitle("Tic-Tac-Toe");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new GridLayout(0, 3, 0, 0));

		// the jbuttons for the board
		final JButton[][] btns = new JButton[3][3];
		// loops through to add the buttons
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				btns[i][j] = new JButton(" ");
				ActionListener actionListener = new TicTacToeButtonListener(game, i, j, btns);
				btns[i][j].addActionListener(actionListener);
				add(btns[i][j]);
			}
		}
	}
}
