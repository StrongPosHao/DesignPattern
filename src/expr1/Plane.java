package expr1;

public class Plane extends Vehicle{

	private double speed;
	
	public Plane(double speed) {
		this.speed = speed;
	}

	public Plane() {
		
	}
	
	public boolean drive(double speed) {
		return (speed > 500 && speed < 1000)? true : false;
	}
	
	public String getType() {
		return "plane";
	}
	
}
