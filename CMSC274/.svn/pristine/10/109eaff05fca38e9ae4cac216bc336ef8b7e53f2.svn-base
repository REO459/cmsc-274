package edu.ben.challenges.challenge1;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;

public class CodingChallenge1 extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField lengthField;
	private JTextField widthField;
	private JTextField areaField;
	private JTextField perimeterField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CodingChallenge1 frame = new CodingChallenge1();
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
	public CodingChallenge1() {
		setTitle("Coding Challenge #1");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		lengthField = new JTextField();
		lengthField.setBounds(141, 26, 180, 26);
		contentPane.add(lengthField);
		lengthField.setColumns(10);
		
		JLabel lblLength = new JLabel("Length");
		lblLength.setBounds(68, 31, 61, 16);
		contentPane.add(lblLength);
		
		widthField = new JTextField();
		widthField.setBounds(141, 75, 180, 26);
		contentPane.add(widthField);
		widthField.setColumns(10);
		
		JLabel lblWidth = new JLabel("Width");
		lblWidth.setBounds(68, 80, 61, 16);
		contentPane.add(lblWidth);
		
		JButton btnCalculate = new JButton("Calculate");
		btnCalculate.setBounds(169, 123, 130, 29);
		contentPane.add(btnCalculate);
		btnCalculate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					Double.parseDouble(lengthField.getText());
				} catch (NumberFormatException e1) {
					// type in a valid input
				}
				
				try {
					Double.parseDouble(widthField.getText());
				} catch (NumberFormatException e1) {
					// type in a valid input
				}
				String area = Double.toString(Double.parseDouble(lengthField.getText()) * Double.parseDouble(widthField.getText()));
				areaField.setText(area);
				
				
				String perimeter = Double.toString(2 * Double.parseDouble(lengthField.getText()) + 2 * Double.parseDouble(widthField.getText()));
				perimeterField.setText(perimeter);
			}
		});
		
		areaField = new JTextField();
		areaField.setBounds(141, 171, 180, 26);
		contentPane.add(areaField);
		areaField.setColumns(10);
		
		JLabel lblArea = new JLabel("Area");
		lblArea.setBounds(68, 176, 61, 16);
		contentPane.add(lblArea);
		
		perimeterField = new JTextField();
		perimeterField.setBounds(141, 219, 180, 26);
		contentPane.add(perimeterField);
		perimeterField.setColumns(10);
		
		JLabel lblPerimeter = new JLabel("Perimeter");
		lblPerimeter.setBounds(68, 224, 61, 16);
		contentPane.add(lblPerimeter);
	}
}
