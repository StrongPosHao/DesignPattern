package expr3;

import java.util.*;
import javax.swing.*;

public class TrafficLamp implements Subject {
	
	private ArrayList<Observer> observers;
	private String status;
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
	public void notifyObservers() {
		for (int i = 0; i < observers.size(); i++) {
			Observer observer = (Observer)observers.get(i);
			observer.update(status, car);
		}
	}
	
	public void statusChanged() {
		notifyObservers();
	}
	
	public void setStatus(String status) {
		this.status = status;
		statusChanged();
	}
	
	

}
