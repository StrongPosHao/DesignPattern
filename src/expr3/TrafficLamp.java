package expr3;

import java.util.*;
import javax.swing.*;

public class TrafficLamp implements Subject {
	
	private ArrayList<Observer> observers;
	private boolean isEastPass;
	private boolean isSouthPass;
	private boolean isWestPass;
	private boolean isNorthPass;
	private MainFrame frame;
	ImageIcon car;
	
	public TrafficLamp() {
		observers = new ArrayList<>();
	}
	@Override
	public void registerObserver(Observer o) {
		observers.add(o);
	}

	@Override
	public void removeObserver(Observer o) {
		int i = observers.indexOf(o);
		if (i >= 0) {
			observers.remove(i);
		}
	}

	@Override
	public void notifyObservers() throws InterruptedException {
		for (int i = 0; i < observers.size(); i++) {
			Observer observer = (Observer)observers.get(i);
			observer.update(isEastPass, isSouthPass, isWestPass, isNorthPass, frame);
		}
	}
	
	public void statusChanged() throws InterruptedException {
		notifyObservers();
	}
	
	public void setStatus(boolean isEastPass, boolean isSouthPass, boolean isWestPass, boolean isNorthPass, MainFrame frame) throws InterruptedException {
		this.isEastPass = isEastPass;
		this.isWestPass = isWestPass;
		this.isSouthPass = isSouthPass;
		this.isNorthPass = isNorthPass;
		this.frame = frame;
		statusChanged();
	}
	
	

}
