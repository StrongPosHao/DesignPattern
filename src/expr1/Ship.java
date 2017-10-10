package expr1;

public class Ship extends Vehicle{
	
	private double speed;
	
	public Ship(double speed) {
		this.speed = speed;
	}
	
	public Ship() {
		// TODO Auto-generated constructor stub
	}

	public boolean drive(double speed) {
		return (speed > 300 && speed < 400)? true : false;
	}
	
	public String getType() {
		return "ship";
	}
	
}
