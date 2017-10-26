package expr3;

import java.util.*;
import java.awt.*;
import javax.swing.*;

public class Client {

	public static void main(String[] args) throws InterruptedException {
		
		MainFrame frame = new MainFrame();
		frame.setSize(800, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
		frame.setTitle("Traffic Lamp program");
		frame.setVisible(true);
		
		
		TrafficLamp trafficLamp = new TrafficLamp();
		
		WalkerAndCarDisplay eastDisplay = new WalkerAndCarDisplay(trafficLamp, frame.getCar1(), frame.getCar2());
		WalkerAndCarDisplay northDisplay = new WalkerAndCarDisplay(trafficLamp, frame.getCar3(), frame.getCar3());
		WalkerAndCarDisplay westDisplay = new WalkerAndCarDisplay(trafficLamp, frame.getCar4(), frame.getCar5());
		WalkerAndCarDisplay southDisplay = new WalkerAndCarDisplay(trafficLamp, frame.getCar6(), frame.getCar7());
		
		while (true) {
			frame.paintLamp(frame.getGraphics());
			trafficLamp.setStatus(true, false, false, false, frame);
			trafficLamp.setStatus(false, false, false, true, frame);
			trafficLamp.setStatus(false, true, false, false, frame);
			trafficLamp.setStatus(false, false, true, false, frame);
			frame.setLeft_x(100);
			frame.setRight_x(600);
			frame.setUp_y(100);
			frame.setDown_y(500);
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
	private ImageIcon car7;
	private int left_x = 100;
	private int left_y1 = 250;
	private int left_y2 = 350;
	private int up_x1 = 300;
	private int up_x2 = 420;
	private int up_y = 100;
	private int down_y = 500;
	private int right_x = 600;
	
	public MainFrame() {
		String background_path = "D:\\Programming\\Java\\DesignPattern\\src\\expr3\\image\\background.jpg";
		String car1_path = "D:\\Programming\\Java\\DesignPattern\\src\\expr3\\image\\car1.jpg";
		String car2_path = "D:\\Programming\\Java\\DesignPattern\\src\\expr3\\image\\car2.jpg";
		String car3_path = "D:\\Programming\\Java\\DesignPattern\\src\\expr3\\image\\car3.jpg";
		String car4_path = "D:\\Programming\\Java\\DesignPattern\\src\\expr3\\image\\car4.jpg";
		String car5_path = "D:\\Programming\\Java\\DesignPattern\\src\\expr3\\image\\car5.jpg";
		String car6_path = "D:\\Programming\\Java\\DesignPattern\\src\\expr3\\image\\car6.jpg";
		String car7_path = "D:\\Programming\\Java\\DesignPattern\\src\\expr3\\image\\car7.jpg";
		background = new ImageIcon(background_path);
		car1 = new ImageIcon(car1_path);
		car2 = new ImageIcon(car2_path);
		car3 = new ImageIcon(car3_path);
		car4 = new ImageIcon(car4_path);
		car5 = new ImageIcon(car5_path);
		car6 = new ImageIcon(car6_path);
		car7 = new ImageIcon(car7_path);
	}
	 
	public void paintLamp(Graphics g) {
		g.setColor(Color.RED);
		g.fillOval(260, 300, 50, 50);
		g.fillOval(380, 200, 50, 50);
		g.fillOval(500, 300, 50, 50);
		g.fillOval(380, 430, 50, 50);
	}
	
	public void paintNorthLamp(Graphics g) {
		g.setColor(Color.GREEN);
		g.fillOval(380, 200, 50, 50);
	}
	
	public void paintSouthLamp(Graphics g) {
		g.setColor(Color.GREEN);
		g.fillOval(380, 430, 50, 50);
	}
	
	public void paintEastLamp(Graphics g) {
		g.setColor(Color.GREEN);
		g.fillOval(260, 300, 50, 50);
	}
	
	public void paintWestLamp(Graphics g) {
		g.setColor(Color.GREEN);
		g.fillOval(500, 300, 50, 50);
	}
	
	public void paint(Graphics g) {
		g.drawImage(background.getImage(), 0, 0, this.getWidth(), this.getHeight(), this);
		if (up_y <= 600) {
			g.drawImage(car3.getImage(), up_x1, up_y, 100, 100, this);
			g.drawImage(car3.getImage(), up_x2, up_y, 100, 100, this);
			if (up_y >= 100) {
				g.setColor(Color.GREEN);
				g.fillOval(380, 200, 50, 50);
				g.setColor(Color.RED);
				g.fillOval(260, 300, 50, 50);
				g.fillOval(380, 430, 50, 50);
				g.fillOval(500, 300, 50, 50);
			}
		}
		else {
			if (down_y <= 500) {
				g.setColor(Color.GREEN);
				g.fillOval(380, 430, 50, 50);
				g.setColor(Color.RED);
				g.fillOval(260, 300, 50, 50);
				g.fillOval(380, 200, 50, 50);
				g.fillOval(500, 300, 50, 50);
			}
			g.drawImage(car6.getImage(), up_x1, down_y, 100, 100, this);
			g.drawImage(car7.getImage(), up_x2, down_y, 100, 100, this);
			
		}
		if (left_x <= 800) {
			g.drawImage(car1.getImage(), left_x, left_y1, 100, 50, this);
			g.drawImage(car2.getImage(), left_x, left_y2, 100, 50, this);
			if (left_x > 100)
				g.setColor(Color.GREEN);
				g.fillOval(260, 300, 50, 50);
				g.setColor(Color.RED);
				g.fillOval(380, 200, 50, 50);
				g.fillOval(380, 430, 50, 50);
				g.fillOval(500, 300, 50, 50);
		}
		else {
			g.drawImage(car4.getImage(), right_x, left_y1, 100, 50, this);
			g.drawImage(car5.getImage(), right_x, left_y2, 100, 50, this);
			if (right_x < 600) {
				g.setColor(Color.GREEN);
				g.fillOval(500, 300, 50, 50);
				g.setColor(Color.RED);
				g.fillOval(380, 200, 50, 50);
				g.fillOval(380, 430, 50, 50);
				g.fillOval(260, 300, 50, 50);
			}
		}
			
	}
		
	public ImageIcon getCar1() {
		return car1;
	}

	public ImageIcon getCar2() {
		return car2;
	}

	public ImageIcon getCar3() {
		return car3;
	}

	public ImageIcon getCar4() {
		return car4;
	}

	public ImageIcon getCar5() {
		return car5;
	}

	public ImageIcon getCar6() {
		return car6;
	}
	
	public ImageIcon getCar7() {
		return car7;
	}


	public int getLeft_x() {
		return left_x;
	}

	public int getUp_y() {
		return up_y;
	}

	public int getDown_y() {
		return down_y;
	}

	public int getRight_x() {
		return right_x;
	}

	public void setLeft_x(int left_x) {
		this.left_x = left_x;
	}

	public void setUp_y(int up_y) {
		this.up_y = up_y;
	}

	public void setDown_y(int down_y) {
		this.down_y = down_y;
	}

	public void setRight_x(int right_x) {
		this.right_x = right_x;
	}
	
}


