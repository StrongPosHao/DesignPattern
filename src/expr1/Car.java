package expr1;

public class Car extends Vehicle {
	
	private double speed;
	
	public Car(double speed) {
		this.speed = speed;
	}
	
	public Car() {
		
	}

	public boolean drive(double speed) {
		return (speed > 100 && speed < 200)? true : false;
	}
	
	public String getType() {
		return "car";
	}
}
