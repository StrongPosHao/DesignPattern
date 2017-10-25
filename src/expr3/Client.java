package expr3;

import java.util.*;
import java.awt.*;
import javax.swing.*;

public class Client {

	public static void main(String[] args) {
		
		new MainFrame();
		
		
		TrafficLamp trafficLampEast = new TrafficLamp();
		TrafficLamp trafficLampWest = new TrafficLamp();
		TrafficLamp trafficLampNorth = new TrafficLamp();
		TrafficLamp trafficLampSouth = new TrafficLamp();
		
		WalkerAndCarDisplay eastDisplay = new WalkerAndCarDisplay(trafficLampEast);
		WalkerAndCarDisplay westDisplay = new WalkerAndCarDisplay(trafficLampWest);
		WalkerAndCarDisplay northDisplay = new WalkerAndCarDisplay(trafficLampNorth);
		WalkerAndCarDisplay southDisplay = new WalkerAndCarDisplay(trafficLampSouth);
		
		int i = 1;
	
		while (true) {
			
			trafficLampEast.setStatus("red signal");
			trafficLampWest.setStatus("red signal");
			trafficLampNorth.setStatus("red signal");
			trafficLampSouth.setStatus("red signal");
			if (i % 4 == 1) {
				trafficLampEast.setStatus("green signal");
			}
			else if (i % 4 == 2) {
				trafficLampEast.setStatus("red signal");
				trafficLampWest.setStatus("green signal");
			}
			else if (i % 4 == 3) {
				trafficLampWest.setStatus("red signal");
				trafficLampNorth.setStatus("green signal");
			}
			else {
				trafficLampNorth.setStatus("red signal");
				trafficLampSouth.setStatus("green signal");
			}
			i++;
		}
		
	}
	
}

@SuppressWarnings("serial")
class MainFrame extends JFrame {
	
	private ImageIcon background;
	private ImageIcon car1;
	private ImageIcon car2;
	private ImageIcon car3;
	private ImageIcon car4;
	private ImageIcon car5;
	private ImageIcon car6;
	private int left_x = 100;
	private int left_y1 = 250;
	private int left_y2 = 350;
	private int left_x2 = 100;
	private int up_x1 = 300;
	private int up_x2 = 420;
	private int up_y = 100;
	private int 
	
	public MainFrame() {
		/* init frame */
		this.setSize(800, 600);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		this.setTitle("Traffic Lamp program");
		this.setVisible(true);
		
		
		
		
	}
	
	public void paint(Graphics g) {
		String background_path = "D:\\Programming\\Java\\DesignPattern\\src\\expr3\\image\\background.jpg";
		String car1_path = "D:\\Programming\\Java\\DesignPattern\\src\\expr3\\image\\car1.jpg";
		String car2_path = "D:\\Programming\\Java\\DesignPattern\\src\\expr3\\image\\car2.jpg";
		String car3_path = "D:\\Programming\\Java\\DesignPattern\\src\\expr3\\image\\car3.jpg";
		String car4_path = "D:\\Programming\\Java\\DesignPattern\\src\\expr3\\image\\car4.jpg";
		String car5_path = "D:\\Programming\\Java\\DesignPattern\\src\\expr3\\image\\car5.jpg";
		String car6_path = "D:\\Programming\\Java\\DesignPattern\\src\\expr3\\image\\car6.jpg";
		background = new ImageIcon(background_path);
		car1 = new ImageIcon(car1_path);
		car2 = new ImageIcon(car2_path);
		car3 = new ImageIcon(car3_path);
		car4 = new ImageIcon(car4_path);
		car5 = new ImageIcon(car5_path);
		car6 = new ImageIcon(car6_path);
		g.drawImage(background.getImage(), 0, 0, this.getWidth(), this.getHeight(), this);
		g.drawImage(car1.getImage(), left_x, left_y1, 100, 50, this);
		g.drawImage(car2.getImage(), left_x, left_y2, 100, 50, this);
		g.drawImage(car3.getImage(), up_x1, up_y, 100, 100, this);
		g.drawImage(car3.getImage(), up_x2, up_y, 100, 100, this);
	}
	
	public void move() {
		while ()
	}
	
}

