package Exemples;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JToggleButton;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class LoginSemaine3 extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JLabel lblPassword;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoginSemaine3 frame = new LoginSemaine3();
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
	public LoginSemaine3() {
		setTitle("Login");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 448, 390);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblUserName = new JLabel("User name");
		lblUserName.setHorizontalAlignment(SwingConstants.CENTER);
		lblUserName.setBounds(173, 41, 91, 16);
		contentPane.add(lblUserName);
		
		textField = new JTextField();
		textField.setBounds(47, 70, 350, 22);
		contentPane.add(textField);
		textField.setColumns(10);
		
		lblPassword = new JLabel("Password");
		lblPassword.setHorizontalAlignment(SwingConstants.CENTER);
		lblPassword.setBounds(168, 122, 91, 16);
		contentPane.add(lblPassword);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(47, 151, 345, 22);
		contentPane.add(passwordField);
		
		JLabel status = new JLabel("You are not logged in");
		status.setHorizontalAlignment(SwingConstants.CENTER);
		status.setBounds(124, 277, 187, 16);
		contentPane.add(status);
		
		JButton btnLogin = new JButton("Login");
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String userName = "moh";
				String passWord = "javaIGS";
				String tempPW = String.valueOf(passwordField.getPassword());
				if(textField.getText().matches(userName)
						&& tempPW.matches(passWord)){
					CalculatriceSemaine3 c = new CalculatriceSemaine3();
					c.setVisible(true);
					setVisible(false);
				}
			}
		});
		btnLogin.setBackground(Color.WHITE);
		btnLogin.setBounds(167, 211, 97, 25);
		contentPane.add(btnLogin);
	}
}
