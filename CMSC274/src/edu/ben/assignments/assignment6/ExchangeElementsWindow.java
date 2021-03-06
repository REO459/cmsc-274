package edu.ben.assignments.assignment6;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.Arrays;
import java.awt.event.ActionEvent;

/**
 * This is my exchange elements jframe
 * 
 * @author omerb
 * @version 1.0
 */
public class ExchangeElementsWindow extends JFrame {
	/**
	 * This is the serial id
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * This is the jpanel contentpane
	 */
	private JPanel contentPane;
	/**
	 * This is the jtextfield index one
	 */
	private JTextField textIndexOne;
	/**
	 * This is the jtextfield index two
	 */
	private JTextField textIndexTwo;
	/**
	 * This is the jtextfield textresult
	 */
	private JTextField textResult;
	/**
	 * This is the jlabel for index one
	 */
	private JLabel lblIndexOne;
	/**
	 * This is the jtextfield for input
	 */
	private JTextField textInput;
	/**
	 * This is creating the generics method class
	 */
	private GenericMethods<String> generics = new GenericMethods<String>();

	/**
	 * Launch the application.
	 */
	public void exchangeElementsWindow() {
		EventQueue.invokeLater(new Runnable() {
			/**
			 * runs the application.
			 */
			public void run() {
				try {
					// starts the window
					ExchangeElementsWindow frame = new ExchangeElementsWindow();
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
	public ExchangeElementsWindow() {
		// sets title and content pane
		setTitle("Exchange Elements");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		// Jlabel for title exchange
		JLabel lblTitleExchange = new JLabel("Exchange Elements");
		lblTitleExchange.setHorizontalAlignment(SwingConstants.TRAILING);
		lblTitleExchange.setBounds(151, 13, 116, 16);
		contentPane.add(lblTitleExchange);

		// Jlabel for input numbers
		JLabel lblInput = new JLabel("Input the Numbers");
		lblInput.setBounds(161, 31, 106, 16);
		contentPane.add(lblInput);

		// Jlabel for rules
		JLabel lblRules = new JLabel("Space Between Numbers. No commas and anything.");
		lblRules.setBounds(60, 50, 299, 26);
		contentPane.add(lblRules);

		// Jlabel for index one
		lblIndexOne = new JLabel("Index One");
		lblIndexOne.setBounds(42, 126, 69, 16);
		contentPane.add(lblIndexOne);

		// Jlabel for index two
		JLabel lblIndexTwo = new JLabel("Index Two");
		lblIndexTwo.setBounds(328, 126, 60, 16);
		contentPane.add(lblIndexTwo);

		// Jlabel for result title
		JLabel lblResultTitle = new JLabel("Result");
		lblResultTitle.setBounds(186, 192, 43, 16);
		contentPane.add(lblResultTitle);

		// Jtextfield for index one
		textIndexOne = new JTextField();
		textIndexOne.setBounds(12, 155, 116, 22);
		contentPane.add(textIndexOne);
		textIndexOne.setColumns(10);

		// Jtextfield for index two
		textIndexTwo = new JTextField();
		textIndexTwo.setBounds(304, 155, 116, 22);
		contentPane.add(textIndexTwo);
		textIndexTwo.setColumns(10);

		// Jtextfield for results
		textResult = new JTextField();
		textResult.setEditable(false);
		textResult.setBounds(151, 218, 116, 22);
		contentPane.add(textResult);
		textResult.setColumns(10);

		// Jbutton for calculator
		JButton btnCalculate = new JButton("Calculate");
		btnCalculate.addActionListener(new ActionListener() {
			/**
			 * This is the action performed
			 */
			public void actionPerformed(ActionEvent e) {
				// works the action performed and checks the valid inputs
				try {
					// declare the variables
					String[] stringValues = textInput.getText().split(" ");
					int firstIndex = Integer.parseInt(textIndexOne.getText());
					int secondIndex = Integer.parseInt(textIndexTwo.getText());
					boolean execution = generics.exchangeElements(stringValues, firstIndex, secondIndex);
					// check if the inputs are valid
					if (!execution) {
						textResult.setText("Invalid input.");
					} else {
						textResult.setText(Arrays.toString(stringValues));
					}
				// if the format is invalid
				} catch (NumberFormatException e1) {
					textResult.setText("Invalid input.");
				}
			}
		});
		btnCalculate.setBounds(161, 154, 97, 25);
		contentPane.add(btnCalculate);

		// Jtextfield for input
		textInput = new JTextField();
		textInput.setBounds(151, 89, 116, 22);
		contentPane.add(textInput);
		textInput.setColumns(10);
	}
}
