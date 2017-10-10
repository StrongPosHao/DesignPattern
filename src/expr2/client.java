package expr2;

import java.util.*;
import java.awt.event.*;
import java.awt.*;
import javax.swing.*;

public class client {

	public static void main(String[] args) {
		GameFrame frame = new GameFrame();
		frame.setSize(500, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
	}
	
}

/**
 * The Game GUI.
 * @author ZhangHao
 *
 */
@SuppressWarnings("serial")
class GameFrame extends JFrame {
	
	private JPanel buttonPanel1;
	private JPanel buttonPanel2;
	private JPanel buttonPanel3;
	private JPanel northPanel;
	private JPanel centerPanel;
	private JPanel southPanel;
	private ButtonGroup group1;
	private ButtonGroup group2;
	private ButtonGroup group3;
	private JLabel label1;
	private JLabel label2;
	private JLabel label3;
	private JTextArea text;
	private Character role;

	
	public GameFrame() {
		/*	design the northpanel */
		northPanel = new JPanel();
		northPanel.setLayout(new GridLayout(2, 1));
		label1 = new JLabel("ѡ���ɫ: ", SwingConstants.LEFT);
		label1.setFont(new Font("����", Font.BOLD, 20));
		buttonPanel1 = new JPanel(new FlowLayout(FlowLayout.CENTER));
		northPanel.add(label1);
		northPanel.add(buttonPanel1);
		group1 = new ButtonGroup();
		addRadioButton1("����", buttonPanel1, group1);
		addRadioButton1("��Ů", buttonPanel1, group1);
		addRadioButton1("����", buttonPanel1, group1);
		add(northPanel, BorderLayout.NORTH);
		
		/*	design the centerpanel */
		centerPanel = new JPanel();
		centerPanel.setLayout(new GridLayout(4, 1));
		label2 = new JLabel("��������: ", SwingConstants.LEFT);
		label2.setFont(new Font("����", Font.BOLD, 20));
		buttonPanel2 = new JPanel(new FlowLayout(FlowLayout.CENTER));
		group2 = new ButtonGroup();
		addRadioButton2("������", buttonPanel2, group2, 1);
		addRadioButton2("ħ������", buttonPanel2, group2, 2);
		
		label3 = new JLabel("������ʽ: ", SwingConstants.LEFT);
		label3.setFont(new Font("����", Font.BOLD, 20));
		buttonPanel3 = new JPanel(new FlowLayout(FlowLayout.CENTER));
		group3 = new ButtonGroup();
		
		
		centerPanel.add(label2);
		centerPanel.add(buttonPanel2);
		centerPanel.add(label3);
		centerPanel.add(buttonPanel3);
		add(centerPanel, BorderLayout.CENTER);
		
		/*	The southpanel */
		southPanel = new JPanel();
		text = new JTextArea(5, 53);
		text.setFont(new Font("����", Font.BOLD, 16));
		southPanel.add(text);
		add(southPanel, BorderLayout.SOUTH);
		
		pack();
	}
	
	public void addRadioButton2(String name, JPanel buttonPanel, ButtonGroup group, int num) {
		JRadioButton button = new JRadioButton(name);
		button.setFont(new Font("����", Font.BOLD, 16));
		group.add(button);
		buttonPanel.add(button);
		
		ActionListener listener = new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				buttonPanel3.removeAll();
				buttonPanel3.repaint();
				/* Add the physics attack button */
				if (name.equals("������") && num == 1) {
					addRadioButton3("��", buttonPanel3, group3);
					addRadioButton3("��", buttonPanel3, group3);
					addRadioButton3("��", buttonPanel3, group3);
					centerPanel.revalidate();
				}
				/* Add the magic attack button */
				else if (name.equals("ħ������") && num == 2) {
					buttonPanel3.removeAll();
					buttonPanel3.repaint();
					addRadioButton3("��ϵħ��", buttonPanel3, group3);
					addRadioButton3("��ϵħ��", buttonPanel3, group3);
					addRadioButton3("ˮϵħ��", buttonPanel3, group3);
					centerPanel.revalidate();
				}
			}
		};
		
		button.addActionListener(listener);
	}
	
	public void addRadioButton1(String name, JPanel buttonPanel, ButtonGroup group) {
		JRadioButton button = new JRadioButton(name);
		button.setFont(new Font("����", Font.BOLD, 16));
		group.add(button);
		buttonPanel.add(button);
		
		ActionListener listener = new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				/*	Create the character */
				if (name.equals("��Ů")) {
					role = new SwordWoman(150, 100);  // Polymorphism
					text.setText(role.display());
				}
				else if (name.equals("����")) {
					role = new Monk(200, 50);
					text.setText(role.display());
				}
				else {
					role = new Ninja(100, 150);
					text.setText(role.display());
				}
			}
		};
		button.addActionListener(listener);
	}
	
	public void addRadioButton3(String name, JPanel buttonPanel, ButtonGroup group) {
		JRadioButton button = new JRadioButton(name);
		button.setFont(new Font("����", Font.BOLD, 16));
		group.add(button);
		buttonPanel.add(button);
		
		ActionListener listener = new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				/*	Output the attack information. */
				try {
					switch (name) {
						case "��ϵħ��":		text.setText(role.attackWithMagic(new FireMagic()));	break;
						case "��ϵħ��":  	text.setText(role.attackWithMagic(new GoldMagic()));	break;
						case "ˮϵħ��":		text.setText(role.attackWithMagic(new WaterMagic())); break;
						case 	  "��":		text.setText(role.attackWithPhysics(new Hand()));     break;
						case	  "��":		text.setText(role.attackWithPhysics(new Knife()));	break;
						case	  "��":		text.setText(role.attackWithPhysics(new Sword()));	break;
						default:  break;
					}
				} catch(NullPointerException e) {
					text.setText("Please choose your character before attack!");
				}
			}
		};
		button.addActionListener(listener);
	}
	
	
}


