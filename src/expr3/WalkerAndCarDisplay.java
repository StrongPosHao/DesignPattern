package expr3;

import javax.swing.*;

public class WalkerAndCarDisplay implements Observer, DisplayElement {
	
	private boolean isEastPass;
	private boolean isSouthPass;
	private boolean isWestPass;
	private boolean isNorthPass;
	private MainFrame frame;
	private Subject trafficLamp;
	private ImageIcon car1;
	private ImageIcon car2;
	
	public WalkerAndCarDisplay(Subject trafficLamp, ImageIcon car1, ImageIcon car2) {
		this.trafficLamp = trafficLamp;
		this.car1 = car1;
		this.car2 = car2;
		trafficLamp.registerObserver(this);
	}
	
	@Override
	public void display() throws InterruptedException {
		if (isEastPass == true) {
			eastMove(car1, car2, frame);
		}
		else if (isWestPass == true) {
			westMove(car1, car2, frame);
		}
		else if (isNorthPass == true) {
			northMove(car1, car2, frame);
		}
		else if (isSouthPass == true) {
			southMove(car1, car2, frame);
		}
	}
	
	public void eastMove(ImageIcon car_1, ImageIcon car_2, MainFrame frame) throws InterruptedException {
		/* East car move */ 
		int i = 1;
		while (frame.getLeft_x() <= 800) {
			frame.setLeft_x(frame.getLeft_x() + 20 * i++);
			Thread.sleep(300);
			frame.repaint();
		}
	}
	
	public void westMove(ImageIcon car_1, ImageIcon car_2, MainFrame frame) throws InterruptedException {
		/* West car move */
		int i = 1;
		while (frame.getRight_x() >= 0) {
			frame.setRight_x(frame.getRight_x() - 20 * i++);
			Thread.sleep(300);
			frame.repaint();
		}
	}
		
	public void northMove(ImageIcon car_1, ImageIcon car_2, MainFrame frame) throws InterruptedException {
		/* North car move */
		int i = 1;
		while (frame.getUp_y() <= 600) {
			frame.setUp_y(frame.getUp_y() + 20 * i++);
			Thread.sleep(300);
			frame.repaint();
		}
	}
	
	
	public void southMove(ImageIcon car_1, ImageIcon car_2, MainFrame frame) throws InterruptedException {	
		/* South car move */
		int i = 1;
		while (frame.getDown_y() >= 0) {
			frame.setDown_y(frame.getDown_y() - 20 * i++);
			Thread.sleep(300);
			frame.repaint();
		}
	

	}

	@Override
	public void update(boolean isEastPass, boolean isSouthPass, boolean isWestPass, boolean isNorthPass, MainFrame frame) throws InterruptedException {
		this.isEastPass = isEastPass;
		this.isWestPass = isWestPass;
		this.isSouthPass = isSouthPass;
		this.isNorthPass = isNorthPass;
		this.frame = frame;
		display();
	}

}
