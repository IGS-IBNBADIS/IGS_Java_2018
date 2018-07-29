package Exemples;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class CalculatriceSemaine3 extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	LogicCalculatrice lc = new LogicCalculatrice();
	int a,b,op;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CalculatriceSemaine3 frame = new CalculatriceSemaine3();
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
	public CalculatriceSemaine3() {
		setTitle("Calculatrice");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 301, 396);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblPremierChiffre = new JLabel("Premier chiffre");
		lblPremierChiffre.setBounds(48, 29, 115, 16);
		contentPane.add(lblPremierChiffre);
		
		textField = new JTextField();
		textField.setBounds(47, 66, 183, 22);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblemChiffre = new JLabel("2em chiffre");
		lblemChiffre.setBounds(48, 165, 115, 16);
		contentPane.add(lblemChiffre);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(47, 202, 183, 22);
		contentPane.add(textField_1);
		
		JButton btnNewButton = new JButton("+");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				a = Integer.valueOf(textField.getText());
				op = 1;
			}
		});
		
		JLabel res = new JLabel("resultat");
		res.setBounds(58, 279, 56, 16);
		contentPane.add(res);
		btnNewButton.setBounds(48, 112, 41, 25);
		contentPane.add(btnNewButton);
		
		JButton button = new JButton("-");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				a = Integer.valueOf(textField.getText());
				op = 2;
			}
		});
		button.setBounds(101, 112, 41, 25);
		contentPane.add(button);
		
		JButton btnX = new JButton("x");
		btnX.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				a = Integer.valueOf(textField.getText());
				op = 3;
			}
		});
		btnX.setBounds(152, 112, 41, 25);
		contentPane.add(btnX);
		
		JButton button_2 = new JButton("/");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				a = Integer.valueOf(textField.getText());
				op = 4;
			}
		});
		button_2.setBounds(202, 112, 41, 25);
		contentPane.add(button_2);
		
		JButton button_1 = new JButton("=");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				b = Integer.valueOf(textField_1.getText());
				switch(op){
				case 1:
					res.setText(""+lc.addition(a, b));
					break;
				}
			}
		});
		button_1.setBounds(48, 247, 97, 25);
		contentPane.add(button_1);
	}
}
