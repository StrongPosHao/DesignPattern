package exer6;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Image;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Component;
import javax.swing.Box;
import javax.swing.ImageIcon;
import java.awt.Dimension;
import javax.swing.JFormattedTextField;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPasswordField;

public class AppFrame1 extends JFrame {

	private JPanel contentPane;
	protected JPasswordField passwordField;
	protected JFormattedTextField usernameField;
	private String level;

	/**
	 * Create the frame.
	 */
	public AppFrame1() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 615, 397);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		setTitle("Simple app framework");
		setVisible(true);
		contentPane.setLayout(null);
		setLocationRelativeTo(null);
		
		usernameField = new JFormattedTextField();
		usernameField.setBounds(183, 99, 238, 27);
		contentPane.add(usernameField);
		
		JLabel lblNewLabel = new JLabel("Sign in");
		lblNewLabel.setBounds(260, 49, 68, 37);
		contentPane.add(lblNewLabel);
		
		JLabel lblUsername = new JLabel("username: ");
		lblUsername.setBounds(102, 98, 89, 28);
		contentPane.add(lblUsername);
		
		JLabel lblPassword = new JLabel("password: ");
		lblPassword.setBounds(102, 154, 89, 28);
		contentPane.add(lblPassword);
		
		JLabel lblLevel = new JLabel("level: ");
		lblLevel.setBounds(126, 206, 89, 28);
		contentPane.add(lblLevel);
		
		JRadioButton userRadio = new JRadioButton("User");
		userRadio.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				level = userRadio.getText();
			}
		});
		userRadio.setBounds(216, 207, 75, 27);
		userRadio.setOpaque(false);
		contentPane.add(userRadio);
		
		JRadioButton adminRadio = new JRadioButton("Admin");
		adminRadio.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				level = adminRadio.getText();
			}
		});
		adminRadio.setBounds(314, 207, 94, 27);
		adminRadio.setOpaque(false);
		contentPane.add(adminRadio);
		
		JButton signInButton = new JButton("Sign in");
		signInButton.addActionListener(new ActionListener() {
			@SuppressWarnings("deprecation")
			public void actionPerformed(ActionEvent e) {
				RuntimeEnv re = RuntimeEnv.getInstance();
				re.setUsername(usernameField.getText());
				re.setPassword(passwordField.getText());
				re.setLevel(level);
				if (e.getSource() == signInButton) {
					new AppFrame2(re);
					dispose();
				}
			}
		});
		signInButton.setBounds(199, 247, 94, 27);
		contentPane.add(signInButton);
		
		JButton exitButton = new JButton("Exit");
		exitButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		exitButton.setBounds(314, 247, 75, 27);
		contentPane.add(exitButton);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(185, 156, 238, 24);
		contentPane.add(passwordField);
		
		JLabel backgroundLabel = new JLabel("");
		backgroundLabel.setBounds(0, 0, 647, 348);
		ImageIcon background = new ImageIcon("D:\\Programming\\Java\\DesignPattern\\src\\exer6\\background.jpg");
		background.setImage(background.getImage().getScaledInstance(662, 397, Image.SCALE_DEFAULT));
		backgroundLabel.setIcon(background);
		contentPane.add(backgroundLabel);
	}
}
