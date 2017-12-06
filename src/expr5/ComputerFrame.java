package expr5;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import java.awt.Font;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JTextPane;
import java.awt.Color;
import javax.swing.UIManager;

public class ComputerFrame extends JFrame {

	private JPanel contentPane;
	
	private ComputerStoreA storeA = new ComputerStoreA();
	private ComputerStoreB storeB = new ComputerStoreB();
	private char flag = 'A';
	
	private JTextArea DisplayArea = new JTextArea();
	private JTextArea DisplayArea1 = new JTextArea();

	/**
	 * Create the frame.
	 */
	public ComputerFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 734, 497);
		setTitle("Computer store program");
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		String ComputerAImagePath = "D:\\Programming\\Java\\DesignPattern\\src\\expr5\\image\\computerA.jpg";
		String ComputerBImagePath = "D:\\Programming\\Java\\DesignPattern\\src\\expr5\\image\\computerB.jpg";
		
		ImageIcon ComputerAImage = new ImageIcon(ComputerAImagePath);
		ImageIcon ComputerBImage = new ImageIcon(ComputerBImagePath);
		ComputerAImage.setImage(ComputerAImage.getImage().getScaledInstance(200, 153, Image.SCALE_DEFAULT));
		ComputerBImage.setImage(ComputerBImage.getImage().getScaledInstance(200, 153, Image.SCALE_DEFAULT));
		
		JLabel DisplayLabel = new JLabel("");
		DisplayLabel.setBounds(33, 49, 200, 153);
		contentPane.add(DisplayLabel);
		
		
		DisplayArea.setFont(new Font("Microsoft YaHei UI Light", Font.BOLD, 14));
		DisplayArea.setBackground(UIManager.getColor("Button.background"));
		DisplayArea.setBounds(346, 294, 325, 156);
		DisplayArea.setOpaque(false);
		contentPane.add(DisplayArea);
		
		DisplayArea1.setFont(new Font("Microsoft YaHei UI Light", Font.BOLD, 14));
		DisplayArea1.setBackground(UIManager.getColor("Button.background"));
		DisplayArea1.setBounds(33, 294, 250, 156);
		DisplayArea1.setOpaque(false);
		contentPane.add(DisplayArea1);
		
		JButton ConfigAButton = new JButton("����A");
		ConfigAButton.setFont(new Font("Microsoft YaHei UI Light", Font.BOLD, 16));
		ConfigAButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Computer computer = choseStore().configComputer("configurationA");
				DisplayLabel.setIcon(ComputerAImage);
				DisplayArea1.append("\n" + computer.equipCPU() + "    ���\n");
				DisplayArea1.append(computer.equipGraphicCard() + " ���\n");
				DisplayArea1.append(computer.equipHardDisk() + "    ���\n");
				DisplayArea1.append(computer.equipMemory() + "    ���\n");
				DisplayArea.setText("�۸�: ��" + computer.price + "\n\n" + 
						"CPU: " + computer.cpu.getName() + "    ��"  + computer.cpu.getPrice() + "\n" + 
						"�Կ�: " + computer.graphicCard.getName() + "    ��" + computer.graphicCard.getPrice() + "\n" +
						"�ڴ�: " + computer.memory.getName() + "    ��" + computer.memory.getPrice() + "\n" + 
						"Ӳ��: " + computer.hardDisk.getName() + "    ��" + computer.hardDisk.getPrice());
			}
		});
		ConfigAButton.setBounds(367, 196, 139, 43);
		contentPane.add(ConfigAButton);
		
		JButton ConfigBButton = new JButton("����B");
		ConfigBButton.setFont(new Font("Microsoft YaHei UI Light", Font.BOLD, 16));
		ConfigBButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Computer computer = choseStore().configComputer("configurationB");
				DisplayLabel.setIcon(ComputerBImage);
				DisplayArea1.append("\n" + computer.equipCPU() + "    ���\n");
				DisplayArea1.append(computer.equipGraphicCard() + " ���\n");
				DisplayArea1.append(computer.equipHardDisk() + "    ���\n");
				DisplayArea1.append(computer.equipMemory() + "    ���\n");
				DisplayArea.setText("�۸�: ��" + computer.price + "\n\n" + 
									"CPU: " + computer.cpu.getName() + "    ��"  + computer.cpu.getPrice() + "\n" + 
									"�Կ�: " + computer.graphicCard.getName() + "    ��" + computer.graphicCard.getPrice() + "\n" +
									"�ڴ�: " + computer.memory.getName() + "    ��" + computer.memory.getPrice() + "\n" + 
									"Ӳ��: " + computer.hardDisk.getName() + "    ��" + computer.hardDisk.getPrice());
			}
		});
		ConfigBButton.setBounds(563, 196, 139, 43);
		contentPane.add(ConfigBButton);
		
		JLabel StoreLabel = new JLabel("��ѡ���ң�");
		StoreLabel.setFont(new Font("Microsoft YaHei", Font.BOLD, 18));
		StoreLabel.setBounds(328, 15, 127, 43);
		contentPane.add(StoreLabel);
		
		JButton StoreAButton = new JButton("���A");
		StoreAButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				flag = 'A';
			}
		});
		StoreAButton.setFont(new Font("Microsoft YaHei UI Light", Font.BOLD, 16));
		StoreAButton.setBounds(367, 71, 139, 43);
		contentPane.add(StoreAButton);
		
		JButton StoreBButton = new JButton("���B");
		StoreBButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				flag = 'B';
			}
		});
		StoreBButton.setFont(new Font("Microsoft YaHei UI Light", Font.BOLD, 16));
		StoreBButton.setBounds(563, 71, 139, 43);
		contentPane.add(StoreBButton);
		
		JLabel ConfigLabel = new JLabel("��ѡ�����ã�");
		ConfigLabel.setFont(new Font("Microsoft YaHei UI", Font.BOLD, 18));
		ConfigLabel.setBounds(328, 146, 117, 37);
		contentPane.add(ConfigLabel);
		
		JLabel InfoLabel = new JLabel("���úͼ۸���Ϣ");
		InfoLabel.setFont(new Font("Microsoft YaHei UI", Font.BOLD, 18));
		InfoLabel.setBounds(14, 229, 153, 37);
		contentPane.add(InfoLabel);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon("D:\\Programming\\Java\\DesignPattern\\src\\expr5\\image\\background.jpg"));
		lblNewLabel_1.setBounds(0, 0, 716, 450);
		contentPane.add(lblNewLabel_1);
	}
	
	public ComputerStore choseStore() {
		if (flag == 'A') {
			DisplayArea1.setText("���A");
			return storeA;
		} else {
			DisplayArea1.setText("���B");
			return storeB;
		}
	}
}
