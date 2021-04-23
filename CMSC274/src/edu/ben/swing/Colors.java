package edu.ben.swing;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JRadioButton;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.SwingConstants;

public class Colors extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Colors frame = new Colors();
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
	public Colors() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		final JLabel foreground = new JLabel("Swing Demo 3");
		foreground.setFont(new Font("Tahoma", Font.PLAIN, 33));
		foreground.setBounds(101, 33, 217, 48);
		contentPane.add(foreground);
		
		final JPanel background = new JPanel();
		background.setBackground(Color.WHITE);
		background.setBounds(65, 13, 271, 78);
		contentPane.add(background);
		
		JLabel foregroundLabel = new JLabel("Foreground Color");
		foregroundLabel.setBounds(27, 107, 113, 16);
		contentPane.add(foregroundLabel);
		
		JRadioButton redRadioButton = new JRadioButton("Red");
		redRadioButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				foreground.setForeground(Color.RED);
			}
		});
		redRadioButton.setForeground(Color.RED);
		redRadioButton.setBounds(27, 132, 127, 25);
		contentPane.add(redRadioButton);
		
		JRadioButton blueRadioButton = new JRadioButton("Blue");
		blueRadioButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				foreground.setForeground(Color.BLUE);
			}
		});
		blueRadioButton.setForeground(Color.BLUE);
		blueRadioButton.setBounds(27, 162, 127, 25);
		contentPane.add(blueRadioButton);
		
		JRadioButton greenRadioButton = new JRadioButton("Green");
		greenRadioButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				foreground.setForeground(Color.GREEN);
			}
		});
		greenRadioButton.setForeground(Color.GREEN);
		greenRadioButton.setBounds(27, 192, 127, 25);
		contentPane.add(greenRadioButton);
		
		JLabel backgroundLabel = new JLabel("Background Color");
		backgroundLabel.setBounds(255, 107, 113, 16);
		contentPane.add(backgroundLabel);
		
		JRadioButton blackRadioButton = new JRadioButton("Black");
		blackRadioButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				background.setBackground(Color.BLACK);
			}
		});
		blackRadioButton.setBounds(255, 132, 127, 25);
		contentPane.add(blackRadioButton);
		
		JRadioButton yellowRadioButton = new JRadioButton("Yellow");
		yellowRadioButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				background.setBackground(Color.YELLOW);
			}
		});
		yellowRadioButton.setBounds(255, 162, 127, 25);
		contentPane.add(yellowRadioButton);
		
		JRadioButton whiteRadioButton = new JRadioButton("White");
		whiteRadioButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				background.setBackground(Color.WHITE);
			}
		});
		whiteRadioButton.setBounds(255, 192, 127, 25);
		contentPane.add(whiteRadioButton);
		
		//Group the radio buttons.
	    ButtonGroup textColors = new ButtonGroup();
	    textColors.add(redRadioButton);
	    textColors.add(blueRadioButton);
	    textColors.add(greenRadioButton);
	    
	    ButtonGroup backgroundColors = new ButtonGroup();
	    backgroundColors.add(blackRadioButton);
	    backgroundColors.add(yellowRadioButton);
	    backgroundColors.add(whiteRadioButton);
	}
}
