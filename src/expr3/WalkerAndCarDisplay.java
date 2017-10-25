package expr3;

import javax.swing.*;
import expr3.Client;

public class WalkerAndCarDisplay implements Observer, DisplayElement {
	
	private String status;
	private Subject trafficLamp;
	
	public WalkerAndCarDisplay(Subject trafficLamp) {
		this.trafficLamp = trafficLamp;
		trafficLamp.registerObserver(this);
	}
	
	@Override
	public void display(ImageIcon car) {
		if (status.equals("green signal")) {
			
		}
		else {
			return ;
		}
	}

	@Override
	public void update(String status, ImageIcon car) {
		this.status = status;
		display(car);
	}

}
