package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.TextField;
import java.awt.Button;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Frm1 extends JFrame {

	private JPanel contentPane;
	public static String un=""; //Khai bao 1 truong tinh
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Frm1 frame = new Frm1();
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
	public Frm1() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		TextField textField = new TextField();
		textField.setBounds(46, 23, 197, 24);
		contentPane.add(textField);
		
		Button button = new Button("New button");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				un=textField.getText();
				//mo form
				new Frm2().setVisible(true);
			}
		});
		button.setBounds(265, 23, 79, 24);
		contentPane.add(button);
	}
}
