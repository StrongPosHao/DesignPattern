package exer6;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Image;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.JTextArea;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class AppFrame2 extends JFrame {

	private JPanel contentPane;
	
	private ModuleControl control;
	private ModuleCache cache;
	private String[] userInfo;
	
	/**
	 * Create the frame.
	 */
	public AppFrame2(RuntimeEnv re) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 680, 397);
		setVisible(true);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		setTitle("Simple app framework");
		contentPane.setLayout(null);
		
		control = ModuleControl.getInstance();
		cache = ModuleCache.getInstance();
		
		cache.storeInfo(re);
		
		JTextArea messageArea = new JTextArea(control.hellowMessage(re));
		messageArea.append("\nYou log-in as " + re.getLevel());
		messageArea.setBounds(52, 44, 568, 154);
		messageArea.setFont(new Font("Microsoft YaHei UI Light", Font.BOLD, 14));
		messageArea.setBackground(UIManager.getColor("Button.background"));
		messageArea.setOpaque(false);
		contentPane.add(messageArea);
		setLocationRelativeTo(null);
		
		JButton signOutButton = new JButton("Sign Out");
		signOutButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (e.getSource() == signOutButton) {
					AppFrame1 frame1 = new AppFrame1();
					userInfo = cache.userInfos.get(cache.userInfos.size() - 1).split(",");
					frame1.usernameField.setText(userInfo[0]);
					frame1.passwordField.setText(userInfo[1]);
					dispose();
				}
			}
		});
		signOutButton.setBounds(214, 234, 136, 32);
		contentPane.add(signOutButton);
		
		JLabel backgroundImage = new JLabel();
		backgroundImage.setBounds(0, 0, 649, 346);
		ImageIcon background = new ImageIcon("D:\\Programming\\Java\\DesignPattern\\src\\exer6\\background.jpg");
		background.setImage(background.getImage().getScaledInstance(680, 397, Image.SCALE_DEFAULT));
		backgroundImage.setIcon(background);
		contentPane.add(backgroundImage);
	
	}
}
