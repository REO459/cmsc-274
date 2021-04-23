package edu.ben.assignments.assignment6;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;

/**
 * This is my generic methods gui
 * 
 * @author omerb
 * @version 1.0
 */
public class GenericMethodsGUI extends JFrame {

	/**
	 * This is serial number
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * This is content pane
	 */
	private JPanel contentPane;

	/**
	 * Launch the application.
	 * 
	 * @param args The args of string
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			/**
			 * Runs the application.
			 */
			public void run() {
				try {
					// runs the method gui frame
					GenericMethodsGUI frame = new GenericMethodsGUI();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public GenericMethodsGUI() {
		// sets title and content pane
		setTitle("Assignment 6");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		// This is the exchange elements button
		JButton exchangeElementsButton = new JButton("Exchange Elements");
		exchangeElementsButton.addActionListener(new ActionListener() {
			/**
			 * performs the action
			 */
			public void actionPerformed(ActionEvent e) {
				// creates the exchange elements window
				ExchangeElementsWindow exchangElements = new ExchangeElementsWindow();
				exchangElements.exchangeElementsWindow();
				dispose();
			}
		});
		exchangeElementsButton.setBounds(252, 104, 149, 25);
		contentPane.add(exchangeElementsButton);

		// This is the find smallest button
		JButton findSmallestButton = new JButton("Find Smallest");
		findSmallestButton.addActionListener(new ActionListener() {
			/**
			 * performs the action
			 */
			public void actionPerformed(ActionEvent e) {
				// creates the find smallest window
				FindSmallestWindow findSmallest = new FindSmallestWindow();
				findSmallest.findSmallestWindow();
				dispose();
			}
		});
		findSmallestButton.setBounds(34, 104, 111, 25);
		contentPane.add(findSmallestButton);
		
		// Jlabel of making the selection
		JLabel lblSelection = new JLabel("Make Your Selection");
		lblSelection.setBounds(149, 36, 122, 16);
		contentPane.add(lblSelection);
	}
}
