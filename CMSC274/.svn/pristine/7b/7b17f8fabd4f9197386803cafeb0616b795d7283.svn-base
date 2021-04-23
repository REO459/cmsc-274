package edu.ben.swing;

import java.awt.BorderLayout;
import java.awt.Color;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;
import javax.script.ScriptEngine;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class DiceGame extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField resultField;
	boolean addBoolean = true;
	boolean subtractBoolean = true;
	boolean multiplyBoolean = true;
	boolean divideBoolean = true;

	double firstTotal = 0.00;
	double secondTotal = 0.00;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DiceGame frame = new DiceGame();
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
	public DiceGame() throws ScriptException {
		ScriptEngineManager s = new ScriptEngineManager();
	    final ScriptEngine engine = s.getEngineByName("Equation");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		final JButton rollButton = new JButton("Roll");
		rollButton.setBounds(29, 118, 97, 25);
		contentPane.add(rollButton);
		rollButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int roll = (int) (Math.random() * 6 + 1);
				String displayRoll = String.valueOf(roll);
				if (resultField.getText() == null) {
					resultField.setText(displayRoll);
					rollButton.setEnabled(false);
				}
				if (resultField.getText() != null) {
					resultField.setText(resultField.getText() + displayRoll);
					rollButton.setEnabled(false);
				}

				if (resultField.getText() != null && !addBoolean && !subtractBoolean && !multiplyBoolean
						&& !divideBoolean) {
					String results = resultField.getText();
					try {
						engine.eval(results);
					} catch (ScriptException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					resultField.setText(resultField.getText() + "=" + results);
				}

			}
		});

		JLabel letsRollLabel = new JLabel("Let's play!");
		letsRollLabel.setBounds(43, 89, 72, 16);
		contentPane.add(letsRollLabel);

		JLabel operatorsLabel = new JLabel("Available operators");
		operatorsLabel.setBounds(245, 60, 110, 16);
		contentPane.add(operatorsLabel);

		final JButton addButton = new JButton("Add");
		addButton.setBounds(192, 89, 97, 25);
		contentPane.add(addButton);
		addButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String add = "+";
				resultField.setText(resultField.getText() + add);
				addButton.setEnabled(false);
				rollButton.setEnabled(true);
				addBoolean = false;
			}
		});

		final JButton multiplyButton = new JButton("Multiply");
		multiplyButton.setBounds(312, 89, 97, 25);
		contentPane.add(multiplyButton);
		multiplyButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String multiply = "*";
				resultField.setText(resultField.getText() + multiply);
				multiplyButton.setEnabled(false);
				rollButton.setEnabled(true);
				multiplyBoolean = false;
			}
		});

		final JButton subtractButton = new JButton("Subtract");
		subtractButton.setBounds(192, 127, 97, 25);
		contentPane.add(subtractButton);
		subtractButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String subtract = "-";
				resultField.setText(resultField.getText() + subtract);
				subtractButton.setEnabled(false);
				rollButton.setEnabled(true);
				subtractBoolean = false;
			}
		});

		final JButton divideButton = new JButton("Divide");
		divideButton.setBounds(312, 127, 97, 25);
		contentPane.add(divideButton);
		divideButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String divide = "/";
				resultField.setText(resultField.getText() + divide);
				divideButton.setEnabled(false);
				rollButton.setEnabled(true);
				divideBoolean = false;
			}
		});

		resultField = new JTextField();
		resultField.setBounds(60, 206, 295, 22);
		contentPane.add(resultField);
		resultField.setColumns(10);

		JLabel resultLabel = new JLabel("Resulting Expression");
		resultLabel.setBounds(144, 177, 129, 16);
		contentPane.add(resultLabel);
	}
}
