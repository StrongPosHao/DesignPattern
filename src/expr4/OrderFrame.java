package expr4;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.*;
import javax.swing.*;
import javax.swing.border.EmptyBorder;


public class OrderFrame extends JFrame {

	private JPanel contentPane;
	
	private String DryNoodlePath = "D:\\Programming\\Java\\DesignPattern\\src\\expr4\\image\\DryNoodleImage.jpg";
	private String SourNoodlePath = "D:\\Programming\\Java\\DesignPattern\\src\\expr4\\image\\SourNoodleImage.jpg";
	private String WaterNoodlePath = "D:\\Programming\\Java\\DesignPattern\\src\\expr4\\image\\WaterNoodleImage.jpg";
	private String TofuPath = "D:\\Programming\\Java\\DesignPattern\\src\\expr4\\image\\TofuImage.jpg";
	private String EggPath = "D:\\Programming\\Java\\DesignPattern\\src\\expr4\\image\\EggImage.jpg";
	private String BeefPath = "D:\\Programming\\Java\\DesignPattern\\src\\expr4\\image\\BeefImage.jpg";
	private String noodle;
	private ArrayList<String> condiment = new ArrayList<>();
	private RiceNoodle riceNoodle;
	private boolean condimentFlag = false;

	/**
	 * Create the frame.
	 */
	public OrderFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 788, 621);
		contentPane = new JPanel();
		contentPane.setForeground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		ImageIcon DryNoodleImage = new ImageIcon(DryNoodlePath);
		DryNoodleImage.setImage(DryNoodleImage.getImage().getScaledInstance(150, 173, Image.SCALE_DEFAULT));
		ImageIcon SourNoodleImage = new ImageIcon(SourNoodlePath);
		SourNoodleImage.setImage(SourNoodleImage.getImage().getScaledInstance(150, 173, Image.SCALE_DEFAULT));
		ImageIcon WaterNoodleImage = new ImageIcon(WaterNoodlePath);
		WaterNoodleImage.setImage(WaterNoodleImage.getImage().getScaledInstance(150, 173, Image.SCALE_DEFAULT));
		ImageIcon TofuImage = new ImageIcon(TofuPath);
		TofuImage.setImage(TofuImage.getImage().getScaledInstance(150, 173, Image.SCALE_DEFAULT));
		ImageIcon EggImage = new ImageIcon(EggPath);
		EggImage.setImage(EggImage.getImage().getScaledInstance(150, 173, Image.SCALE_DEFAULT));
		ImageIcon BeefImage = new ImageIcon(BeefPath);
		BeefImage.setImage(BeefImage.getImage().getScaledInstance(150, 173, Image.SCALE_DEFAULT));
		
		JTextArea textArea = new JTextArea();
		textArea.setTabSize(20);
		textArea.setRows(5);
		textArea.setBounds(483, 70, 262, 203);
		contentPane.add(textArea);
		
		JLabel CondimentImage = new JLabel("");
		CondimentImage.setBounds(245, 65, 169, 173);
		contentPane.add(CondimentImage);
		
		JLabel NoodleImage = new JLabel("");
		NoodleImage.setBounds(39, 65, 149, 173);
		contentPane.add(NoodleImage);
		
		JButton dryNoodleButton = new JButton("干浆米线");
		dryNoodleButton.setIcon(null);
		dryNoodleButton.setForeground(Color.BLACK);
		dryNoodleButton.setFont(new Font("Microsoft YaHei UI Light", Font.BOLD, 16));
		dryNoodleButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				NoodleImage.setIcon(DryNoodleImage);
				noodle = "Dry Noodle";
				textArea.setText("米线：干浆米线    ￥ 2.2\n");
				condiment.clear();
			}
		});
		dryNoodleButton.setBounds(65, 315, 123, 38);
		contentPane.add(dryNoodleButton);
		
		JButton sourNoodleButton = new JButton("酸浆米线");
		sourNoodleButton.setFont(new Font("Microsoft YaHei UI Light", Font.BOLD, 16));
		sourNoodleButton.setForeground(Color.BLACK);
		sourNoodleButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				NoodleImage.setIcon(SourNoodleImage);
				noodle = "Sour Noodle";
				textArea.setText("米线：酸浆米线    ￥ 2.2\n");
				condiment.clear();
			}
		});
		sourNoodleButton.setBounds(286, 315, 117, 38);
		contentPane.add(sourNoodleButton);
		
		JButton waterNoodleButton = new JButton("水米线");
		waterNoodleButton.setFont(new Font("Microsoft YaHei UI Light", Font.BOLD, 16));
		waterNoodleButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				NoodleImage.setIcon(WaterNoodleImage);
				noodle = "Water Noolde";
				textArea.setText("米线：水米线    ￥ 2.2\n");
				condiment.clear();
			}
		});
		waterNoodleButton.setBounds(504, 315, 123, 38);
		contentPane.add(waterNoodleButton);
		
		JButton TofuButton = new JButton("豆腐");
		TofuButton.setFont(new Font("Microsoft YaHei UI Light", Font.BOLD, 16));
		TofuButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CondimentImage.setIcon(TofuImage);
				condiment.add("Tofu");
				if (condimentFlag)
					textArea.append("            豆腐    ￥ 0.5\n");
				else
					textArea.append("配料：豆腐    ￥0.5\n");
				condimentFlag = true;
			}
		});
		TofuButton.setBounds(65, 410, 123, 38);
		contentPane.add(TofuButton);
		
		JButton eggButton = new JButton("鸡蛋");
		eggButton.setFont(new Font("Microsoft YaHei UI Light", Font.BOLD, 16));
		eggButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CondimentImage.setIcon(EggImage);
				condiment.add("Egg");
				if (condimentFlag)
					textArea.append("            鸡蛋    ￥1.0\n");
				else
					textArea.append("配料：鸡蛋    ￥ 1.0\n");
				condimentFlag = true;
			}
		});
		eggButton.setBounds(286, 410, 117, 38);
		contentPane.add(eggButton);
		
		JButton beefButton = new JButton("牛肉");
		beefButton.setFont(new Font("Microsoft YaHei UI Light", Font.BOLD, 16));
		beefButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CondimentImage.setIcon(BeefImage);
				condiment.add("Beef");
				if (condimentFlag)
					textArea.append("            牛肉    ￥2.0\n");
				else
					textArea.append("配料：牛肉    ￥ 2.0\n");
				condimentFlag = true;
			}
		});
		beefButton.setBounds(504, 409, 123, 41);
		contentPane.add(beefButton);
		
		JLabel label1 = new JLabel("米线");
		label1.setFont(new Font("Microsoft YaHei UI", Font.BOLD | Font.ITALIC, 16));
		label1.setBounds(84, 34, 72, 18);
		contentPane.add(label1);
		
		JLabel label2 = new JLabel("配料");
		label2.setFont(new Font("Microsoft YaHei UI", Font.BOLD | Font.ITALIC, 16));
		label2.setBounds(299, 34, 72, 18);
		contentPane.add(label2);
		
		JLabel label = new JLabel("订单信息");
		label.setFont(new Font("Microsoft YaHei UI", Font.BOLD | Font.ITALIC, 16));
		label.setBounds(549, 39, 72, 18);
		contentPane.add(label);
		
		JLabel lblNewLabel_1 = new JLabel("+");
		lblNewLabel_1.setFont(new Font("SimSun", Font.PLAIN, 25));
		lblNewLabel_1.setBounds(202, 127, 28, 28);
		contentPane.add(lblNewLabel_1);
		
		JButton confirmButton = new JButton("确认");
		confirmButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				switch (noodle) {
					case "Dry Noodle": riceNoodle = new DryNoodle();	 break;
					case "Water Noodle": riceNoodle = new WaterNoodle(); break;
					case "Sour Noodle": riceNoodle = new SourNoodle(); 	 break;
					default: textArea.setText("请选择米线！"); 				 break;
				}
				for (int i = 0; i < condiment.size(); i++) {
					switch (condiment.get(i)) {
						case "Tofu": riceNoodle = new Tofu(riceNoodle);		break;
						case "Egg": riceNoodle = new Egg(riceNoodle); 		break;
						case "Beef": riceNoodle = new Beef(riceNoodle);		break;
						default: break;
					}
				}
				textArea.append(riceNoodle.getDescription() + "\n" + "总价: ￥" + riceNoodle.cost());
				condiment.clear();
			}
		});
		confirmButton.setFont(new Font("Microsoft YaHei UI Light", Font.BOLD, 18));
		confirmButton.setBounds(191, 494, 169, 38);
		contentPane.add(confirmButton);
		
		JLabel label_1 = new JLabel("￥ 2.2");
		label_1.setFont(new Font("SimSun", Font.BOLD | Font.ITALIC, 16));
		label_1.setBounds(84, 284, 72, 18);
		contentPane.add(label_1);
		
		JLabel label_2 = new JLabel("￥ 2.2");
		label_2.setFont(new Font("SimSun", Font.BOLD | Font.ITALIC, 16));
		label_2.setBounds(311, 284, 72, 18);
		contentPane.add(label_2);
		
		JLabel label_3 = new JLabel("￥ 2.2");
		label_3.setFont(new Font("SimSun", Font.BOLD | Font.ITALIC, 16));
		label_3.setBounds(526, 284, 72, 18);
		contentPane.add(label_3);
		
		JLabel label_4 = new JLabel("￥ 0.5");
		label_4.setFont(new Font("SimSun", Font.BOLD | Font.ITALIC, 16));
		label_4.setBounds(84, 385, 72, 18);
		contentPane.add(label_4);
		
		JLabel label_5 = new JLabel("￥ 1.0");
		label_5.setFont(new Font("SimSun", Font.BOLD | Font.ITALIC, 16));
		label_5.setBounds(311, 385, 72, 18);
		contentPane.add(label_5);
		
		JLabel label_6 = new JLabel("￥ 2.0");
		label_6.setFont(new Font("SimSun", Font.BOLD | Font.ITALIC, 16));
		label_6.setBounds(526, 386, 72, 18);
		contentPane.add(label_6);
		
		JButton button = new JButton("撤销");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				noodle = "";
				condiment.clear();
				textArea.setText("");
			}
		});
		button.setFont(new Font("Microsoft YaHei UI Light", Font.BOLD, 18));
		button.setBounds(421, 494, 169, 38);
		contentPane.add(button);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\lanti\\Desktop\\23.jpg"));
		lblNewLabel.setBounds(0, 0, 770, 574);
		contentPane.add(lblNewLabel);
	}
		
}
