package edu.ben.assignments.assignment6;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.Arrays;
import java.util.List;
import java.awt.event.ActionEvent;

/**
 * This is my find smallest jframe
 * 
 * @author omerb
 * @version 1.0
 */
public class FindSmallestWindow extends JFrame {

	/**
	 * This is the serial version id
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * This is the jpanel content pane
	 */
	private JPanel contentPane;
	/**
	 * This is the jtextfield input
	 */
	private JTextField textInput;
	/**
	 * This is the jtextfield start
	 */
	private JTextField textStart;
	/**
	 * This is the jtextfield end
	 */
	private JTextField textEnd;
	/**
	 * This is the jtextfield results
	 */
	private JTextField textResults;
	/**
	 * This creates the generic class
	 */
	private GenericMethods<String> generics = new GenericMethods<String>();

	/**
	 * Launch the application.
	 */
	public void findSmallestWindow() {
		EventQueue.invokeLater(new Runnable() {
			/**
			 * Run the application.
			 */
			public void run() {
				try {
					// creates the find smallest window frame
					FindSmallestWindow frame = new FindSmallestWindow();
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
	public FindSmallestWindow() {
		// sets title and content pane
		setTitle("Find Smallest");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		// Find Smallest title
		JLabel lblTitleSmallest = new JLabel("Find Smallest");
		lblTitleSmallest.setHorizontalAlignment(SwingConstants.TRAILING);
		lblTitleSmallest.setBounds(161, 13, 87, 16);
		contentPane.add(lblTitleSmallest);

		// Jlabel input the number
		JLabel lblInput = new JLabel("Input the Numbers");
		lblInput.setBounds(161, 42, 106, 16);
		contentPane.add(lblInput);

		// Jlabel the rules
		JLabel lblRules = new JLabel("Space Between Numbers. No commas and anything.");
		lblRules.setBounds(75, 63, 299, 26);
		contentPane.add(lblRules);

		// Jtextfield for text input
		textInput = new JTextField();
		textInput.setBounds(151, 92, 116, 22);
		contentPane.add(textInput);
		textInput.setColumns(10);

		// Jlabel for start
		JLabel lblStart = new JLabel("Start");
		lblStart.setBounds(53, 126, 33, 16);
		contentPane.add(lblStart);

		// Jlabel for end
		JLabel lblEnd = new JLabel("End");
		lblEnd.setBounds(346, 126, 28, 16);
		contentPane.add(lblEnd);

		// Jlabel for results
		JLabel lblResults = new JLabel("Results");
		lblResults.setBounds(188, 180, 56, 16);
		contentPane.add(lblResults);

		// Jtextfield for start
		textStart = new JTextField();
		textStart.setBounds(12, 155, 116, 22);
		contentPane.add(textStart);
		textStart.setColumns(10);

		// Jtextfield for end
		textEnd = new JTextField();
		textEnd.setBounds(304, 155, 116, 22);
		contentPane.add(textEnd);
		textEnd.setColumns(10);

		// Jtextfield for results
		textResults = new JTextField();
		textResults.setEditable(false);
		textResults.setBounds(151, 209, 116, 22);
		contentPane.add(textResults);
		textResults.setColumns(10);

		// the calculate button
		JButton btnCalculate = new JButton("Calculate");
		btnCalculate.addActionListener(new ActionListener() {
			/**
			 * performs the action from the button
			 */
			public void actionPerformed(ActionEvent e) {
				// works the action performed and checks the valid inputs
				try {
					// declare variables
					List<String> numbersList = Arrays.asList(textInput.getText().split(" "));
					int firstNumber = Integer.parseInt(textStart.getText());
					int lastNumber = Integer.parseInt(textEnd.getText());
					// check if the input is valid
					if (firstNumber > lastNumber || firstNumber > numbersList.size() || firstNumber < 0
							|| lastNumber < 0) {
						textResults.setText("Invalid input.");
					} else {
						textResults.setText(generics.findSmallest(numbersList, firstNumber, lastNumber));
					}
					// if the format is invalid
				} catch (NumberFormatException e1) {
					textResults.setText("Invalid input.");
				}
			}
		});
		btnCalculate.setBounds(161, 127, 97, 25);
		contentPane.add(btnCalculate);
	}
}
