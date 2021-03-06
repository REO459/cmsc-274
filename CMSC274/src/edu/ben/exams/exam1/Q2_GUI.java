package edu.ben.exams.exam1;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Q2_GUI extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField exam1val;
	private JTextField exam2val;
	private JTextField finalexamval;
	private JLabel lblMax;
	private JTextField regularavg;
	private JTextField weightedavg;
	private JLabel lblMin;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Q2_GUI frame = new Q2_GUI();
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
	public Q2_GUI() {
		setTitle("Exam1_Q2");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblStudent = new JLabel("Exam1");
		lblStudent.setBounds(62, 23, 61, 16);
		contentPane.add(lblStudent);
		
		JLabel lblStudent_1 = new JLabel("Exam2");
		lblStudent_1.setBounds(62, 63, 61, 16);
		contentPane.add(lblStudent_1);
		
		JLabel lblStudent_1_1 = new JLabel("FinalExam");
		lblStudent_1_1.setBounds(62, 107, 66, 16);
		contentPane.add(lblStudent_1_1);
		
		exam1val = new JTextField();
		exam1val.setBounds(163, 18, 130, 26);
		contentPane.add(exam1val);
		exam1val.setColumns(10);
		
		exam2val = new JTextField();
		exam2val.setBounds(163, 58, 130, 26);
		contentPane.add(exam2val);
		exam2val.setColumns(10);
		
		finalexamval = new JTextField();
		finalexamval.setBounds(163, 97, 130, 26);
		contentPane.add(finalexamval);
		finalexamval.setColumns(10);
		
		lblMax = new JLabel("RegularAvg");
		lblMax.setBounds(62, 194, 89, 16);
		contentPane.add(lblMax);
		
		regularavg = new JTextField();
		regularavg.setBounds(163, 184, 130, 26);
		contentPane.add(regularavg);
		regularavg.setColumns(10);
		regularavg.setEnabled(false);
		
		weightedavg = new JTextField();
		weightedavg.setColumns(10);
		weightedavg.setBounds(163, 226, 130, 26);
		contentPane.add(weightedavg);
		weightedavg.setEnabled(false);
		
		lblMin = new JLabel("WeightedAvg");
		lblMin.setBounds(62, 236, 89, 16);
		contentPane.add(lblMin);
		
		JButton btnCalculate = new JButton("Calculate");
		btnCalculate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String regularAverage = Double.toString((Double.parseDouble(exam1val.getText()) + Double.parseDouble(exam2val.getText()) + Double.parseDouble(finalexamval.getText())) / 3);
				regularavg.setText(regularAverage);
				
				
				String weightedAverage = Double.toString((0.3 * Double.parseDouble(exam1val.getText())) + (0.3 * Double.parseDouble(exam2val.getText())) + (0.4 * Double.parseDouble(finalexamval.getText())));
				weightedavg.setText(weightedAverage);
			}
		});
		btnCalculate.setBounds(163, 135, 117, 29);
		contentPane.add(btnCalculate);
		
		JLabel label = new JLabel("30%");
		label.setBounds(305, 63, 61, 16);
		contentPane.add(label);
		
		JLabel label_1 = new JLabel("30%");
		label_1.setBounds(305, 23, 61, 16);
		contentPane.add(label_1);
		
		JLabel label_2 = new JLabel("40%");
		label_2.setBounds(305, 102, 61, 16);
		contentPane.add(label_2);
		
		JLabel lblWeights = new JLabel("Weights");
		lblWeights.setBounds(292, 0, 61, 16);
		contentPane.add(lblWeights);
	}
}
